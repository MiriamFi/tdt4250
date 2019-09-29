package tdt4250.assignment2.unitconverter.util;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import tdt4250.assignment2.unitconverter.api.ConverterResult;
import tdt4250.assignment2.unitconverter.api.Unit;

@Component(
		configurationPid = ConvUnit.FACTORY_PID,
		configurationPolicy = ConfigurationPolicy.REQUIRE)

public class ConvUnit implements Unit{

	public static final String FACTORY_PID = "tdt4250.assignment2.unitconverter.util.ConvUnit";
	
	public static final String UNIT_CONVERSIONS_PROP = "unitConverions";
	public static final String UNIT_RESOURCE_PROP = "unitResource";
	public static final String UNIT_NAME_PROP = "unitName";
	
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConverterResult convert(Unit targetUnit, float value, int decimals) {
		// TODO Auto-generated method stub
		return null;
	}

}
