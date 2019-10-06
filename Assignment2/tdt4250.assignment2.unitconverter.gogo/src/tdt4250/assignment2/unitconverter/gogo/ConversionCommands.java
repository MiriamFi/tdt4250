package tdt4250.assignment2.unitconverter.gogo;

import java.io.IOException;
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

import tdt4250.assignment2.unitconverter.api.Conversion;
import tdt4250.assignment2.unitconverter.api.ConverterResult;
import tdt4250.assignment2.unitconverter.api.Unit;
import tdt4250.assignment2.unitconverter.util.UnitConversion;

@Component(
		service = ConversionCommands.class,
		property = {
				"osgi.command.scope=conversion",
				"osgi.command.function=list",
				"osgi.command.function=convert",
				"osgi.command.function=add",
				"osgi.command.function=remove"
		})
public class ConversionCommands {

	private Configuration getConfig(String convName) {
		try {
			Configuration[] configs = cm.listConfigurations("(&(" + UnitConversion.CONV_NAME_PROP + "=" + convName + ")(service.factoryPid=" + UnitConversion.FACTORY_PID + "))");
			if (configs != null && configs.length >= 1) {
				return configs[0];
			}
		} catch (IOException | InvalidSyntaxException e) {
		}
		return null;
	}
	
	@Descriptor("list available conversions")
	public void list() {
		System.out.print("Conversions: ");
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		try {
			for (ServiceReference<Conversion> serviceReference : bc.getServiceReferences(Conversion.class, null)) {
				Conversion conversion = bc.getService(serviceReference);
				try {
					if (conversion != null) {
						String startUnitName = conversion.getStartUnit().getName();
						String endUnitName = conversion.getEndUnit().getName();
						String conversionName = startUnitName + endUnitName;
						System.out.print("From " + startUnitName + " to " + endUnitName);
						if (getConfig(conversionName) != null) {
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
	
	@Descriptor("convert a value from an unit to another")
	public void convert(
			@Descriptor("unit to convert from")
			String startUnitSymbol,
			@Descriptor("unit to convert to")
			String endUnitSymbol,
			@Descriptor("value")
			float value
			) {
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		
		ConverterResult converterResult = null;
		try {
			for (ServiceReference<Conversion> serviceReference : bc.getServiceReferences(Conversion.class, null)) {
				Conversion conversion = bc.getService(serviceReference);
				if (conversion != null) {
					try {
						if( startUnitSymbol == conversion.getStartUnit().getSymbol() && endUnitSymbol == conversion.getEndUnit().getSymbol()) {
							converterResult = conversion.convert(startUnitSymbol, endUnitSymbol, value);
						}
						
					} finally {
						bc.ungetService(serviceReference);
					}
				} else {
					System.out.println(serviceReference.getProperties());
				}
				if(converterResult == null) {
					boolean success = false;
					converterResult = new ConverterResult(success, value);
				}
				System.out.println(converterResult.getMessage());
			}
		} catch (InvalidSyntaxException e) {
		}
	}
	
	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	private ConfigurationAdmin cm;

	@Descriptor("add a conversion")
	public void add(
			@Descriptor("the name of start unit")
			String startUnitName,
			@Descriptor("the name of the end unit")
			String endUnitName,
			@Descriptor("The conversion expression. Format: [endUnit] = a * [startUnit] + b")
			String expression
			) throws Exception {
		
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		Unit startUnit = null;
		Unit endUnit = null;
		try {
			for (ServiceReference<Unit> serviceReference : bc.getServiceReferences(Unit.class, null)) {
				Unit unit = bc.getService(serviceReference);
				try {
					if (unit != null && unit.getName()==startUnitName) {
						startUnit = unit;
					}
					else if (unit != null && unit.getName()==endUnitName) {
						endUnit = unit;
					}
				} finally {
					bc.ungetService(serviceReference);
				}
			}
		} catch (InvalidSyntaxException e) {
		}
		if( startUnit == null || endUnit == null) {
			throw new Exception("Unit name does not exists");
			
		}
		
		
		
		String conversionName = startUnitName + endUnitName;
		Configuration config = getConfig(conversionName);
		if (config == null) {
			// create a new one
			config = cm.createFactoryConfiguration(UnitConversion.FACTORY_PID, "?");
		}
		
		Dictionary<String, String> props = new Hashtable<>();
		props.put(UnitConversion.CONV_NAME_PROP, conversionName);
		if (expression != null) {
			props.put(UnitConversion.EXPRESSION_PROP, expression);
		}
		
		try {
			for (ServiceReference<Conversion> serviceReference : bc.getServiceReferences(Conversion.class, null)) {
				Conversion conversion = bc.getService(serviceReference);
				try {
					if (conversion.getConversionName() == conversionName) {
						conversion.setUnits(startUnit, endUnit);
					}
				} finally {
					bc.ungetService(serviceReference);
				}
			}
		} catch (InvalidSyntaxException e) {
		}
		config.update(props);
		System.out.println("Conversion from " + startUnitName + " to " + endUnitName + " has been added.");
	}
	
}