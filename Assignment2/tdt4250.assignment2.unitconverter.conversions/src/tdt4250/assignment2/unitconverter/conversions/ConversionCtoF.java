package tdt4250.assignment2.unitconverter.conversions;

import org.osgi.service.component.annotations.Component;

import tdt4250.assignment2.unitconverter.api.Conversion;
import tdt4250.assignment2.unitconverter.util.UnitConversion;


@Component(
		property = { UnitConversion.CONV_NAME_PROP + "=CF" } 
		)
public class ConversionCtoF extends UnitConversion implements Conversion{

	public ConversionCtoF() {
		super(new Celcius(), new Fahrenheit(), "CF", "F = 1.8 * C + 32");
	}
}
