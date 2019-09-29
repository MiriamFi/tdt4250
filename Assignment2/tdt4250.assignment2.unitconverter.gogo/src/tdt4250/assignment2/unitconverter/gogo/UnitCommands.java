package tdt4250.assignment2.unitconverter.gogo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.felix.service.command.Descriptor;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import tdt4250.assignment2.unitconverter.api.ConverterResult;
import tdt4250.assignment2.unitconverter.api.Unit;
import tdt4250.assignment2.unitconverter.util.ConvUnit;
import tdt4250.assignment2.unitconverter.util.WordsDict;

@Component(
		service = UnitCommands.class,
		property = {
				"osgi.command.scope=unit",
				"osgi.command.function=list",
				"osgi.command.function=convert",
				"osgi.command.function=add",
				"osgi.command.function=remove"
		})
public class UnitCommands {

	private Configuration getConfig(String unitName) {
		try {
			Configuration[] configs = cm.listConfigurations("(&(" + ConvUnit.UNIT_NAME_PROP + "=" + unitName + ")(service.factoryPid=" + ConvUnit.FACTORY_PID + "))");
			if (configs != null && configs.length >= 1) {
				return configs[0];
			}
		} catch (IOException | InvalidSyntaxException e) {
		}
		return null;
	}
	
	@Descriptor("list available units")
	public void list() {
		System.out.print("Units: ");
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		try {
			for (ServiceReference<Unit> serviceReference : bc.getServiceReferences(Unit.class, null)) {
				Unit unit = bc.getService(serviceReference);
				try {
					if (unit != null) {
						System.out.print(unit.getName());
						if (getConfig(unit.getName()) != null) {
							System.out.print("*");						
						}
					}
				} finally {
					bc.ungetService(serviceReference);
				}
				System.out.print(" ");
			}
		} catch (InvalidSyntaxException e) {
		}
		System.out.println();
	}
	
	@Descriptor("convert a value to another unit")
	public void lookup(
			@Descriptor("unit to convert from")
			String unitName,
			@Descriptor("unit to convert to")
			String targetUnitName,
			@Descriptor("value")
			float value
			) {
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		Unit unit = null;
		Unit targetUnit = null;
		try {
			// iterate through all Dict service objects
			for (ServiceReference<Unit> serviceReference : bc.getServiceReferences(Unit.class, null)) {
				Unit u = bc.getService(serviceReference);
				if (u != null) {
					try {
						if(u.getName() == unitName) {
							unit = u;
						}
						if(u.getName() == targetUnitName) {
							targetUnit = u;
						}
						if(unit != null && targetUnit != null) {
							ConverterResult converterResult = unit.convert(targetUnit, value);
							System.out.println(unit.getName() + ": " + converterResult.getMessage());
						}
						
					} finally {
						bc.ungetService(serviceReference);
					}
				} else {
					System.out.println(serviceReference.getProperties());
				}
			}
		} catch (InvalidSyntaxException e) {
		}
	}
	
	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	private ConfigurationAdmin cm;

	@Descriptor("add a unit")
	public void add(
			@Descriptor("the name of the new dictionary")
			String name,
			@Descriptor("the URL of file with the words, or a simple word to add to the dictionary")
			String urlStringOrWord,
			@Descriptor("additional words to add to the dictionary")
			String... ss
			) throws IOException, InvalidSyntaxException {
		URL url = null;
		Collection<String> words = new ArrayList<String>();
		try {
			url = new URL(urlStringOrWord);
		} catch (MalformedURLException e) {
			words.add(urlStringOrWord);
		}
		words.addAll(Arrays.asList(ss));
		String actionName = "updated";
		// lookup existing configuration
		Configuration config = getConfig(name);
		if (config == null) {
			// create a new one
			config = cm.createFactoryConfiguration(WordsDict.FACTORY_PID, "?");
			actionName = "added";
		}
		Dictionary<String, String> props = new Hashtable<>();
		props.put(WordsDict.DICT_NAME_PROP, name);
		if (url != null) {
			props.put(WordsDict.DICT_RESOURCE_PROP, url.toString());
		}
		if (words != null && words.size() > 0) {
			props.put(WordsDict.DICT_WORDS_PROP, String.join(" ", words));
		}
		config.update(props);
		System.out.println("\"" + name + "\" dictionary " + actionName);
	}
	
}
