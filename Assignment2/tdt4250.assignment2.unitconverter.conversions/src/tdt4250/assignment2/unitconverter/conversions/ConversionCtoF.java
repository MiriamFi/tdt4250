package tdt4250.assignment2.unitconverter.conversions;

import org.osgi.service.component.annotations.Component;

import tdt4250.assignment2.unitconverter.api.Conversion;
import tdt4250.assignment2.unitconverter.api.Unit;
import tdt4250.assignment2.unitconverter.util.UnitConversion;


@Component(
		)
public class ConversionCtoF extends UnitConversion implements Conversion{

	public ConversionCtoF() throws Exception {
		Unit startUnit = new Celcius();
		Unit endUnit = new Fahrenheit();
		this.setUnits(startUnit, endUnit);
		this.setConversionName("CelciusFahrenheit");
		this.setExpression("F = 1.8 * C + 32");
	}
}
