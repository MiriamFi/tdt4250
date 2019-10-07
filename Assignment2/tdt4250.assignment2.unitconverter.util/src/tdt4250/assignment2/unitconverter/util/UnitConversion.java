package tdt4250.assignment2.unitconverter.util;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import tdt4250.assignment2.unitconverter.api.Conversion;
import tdt4250.assignment2.unitconverter.api.ConverterResult;
import tdt4250.assignment2.unitconverter.api.Unit;

@Component(
		configurationPid = UnitConversion.FACTORY_PID,
		configurationPolicy = ConfigurationPolicy.REQUIRE)
public abstract class UnitConversion implements Conversion{
	
	public static final String FACTORY_PID = "tdt4250.unitConversion.util.UnitConversion";
	public static final String CONV_NAME_PROP = "conversionName";
	public static final String EXPRESSION_PROP = "expression";
	
	public UnitConversion(Unit startUnit, Unit endUnit, String conversionName, String expression) {
		this.startUnit = startUnit;
		this.endUnit = endUnit;
		this.conversionName = conversionName;
		this.setExpression(expression);
	}
	

	public @interface UnitConversionConfig {
		String conversionName();
		String expression();
	}
	

	private Unit startUnit;
	private Unit endUnit;
	private String conversionName;
	
	// Expression
	private float a;
	private float b;
	private boolean isMultiplication; // vs. division
	private boolean isAddition; // vd. subtraction
	

	@Override
	public String getConversionName() {
		return conversionName;
	}

	@Override
	public Unit getStartUnit() {
		return startUnit;
	}

	@Override
	public Unit getEndUnit() {
		return endUnit;
	}

	@Override
	public ConverterResult convert(String startUnitSymbol, String endUnitSymbol, float value) {
		boolean success = true;
		float result = 0.0f;
		if(!startUnit.getSymbol().equals(startUnitSymbol)) {
			success = false;
		}
		else if(!endUnit.getSymbol().equals(endUnitSymbol)) {
			success = false;
		}
		if(success) {
			result = this.calculate(value);
		}
		
		return new ConverterResult(success, result);
	}
	

	private float calculate(float value) {
		float result = 0.0f;
		if (isMultiplication) {
			result = a * value;
		}
		else {
			result = b / value;
		}
		if(isAddition) {
			result += b;
		}
		else {
			result -= b;
		}
		return result;
	}
	/*
	
	@Activate
	protected void activate(UnitConversionConfig config)  {
		this.update(config);
	}
	@Modified
	protected void modify(UnitConversionConfig config)  {
		this.update(config);
	}

	protected void update(UnitConversionConfig config)  {
		this.setConversionName(config.conversionName());
		this.setExpression(config.expression());
	}
	*/

	protected void setConversionName(String convName) {
		this.conversionName = convName;
	}
	
	
	// TODO: Move somewhere else, utils?
	protected boolean setExpression(String expression) {
		// expression format: [endUnit] = a * [startUnit] + b
		boolean success = true;
		String[] expParts = expression.split(" ");
		
		
		if (expParts.length != 5 && expParts.length != 7) {
			success = false;
		}
		
		if (!expParts[0].equals(endUnit.getSymbol())) {
			success = false;
		}
		
		if (!expParts[1].equals("=") ) {
			success = false;
		}
		
		if(this.isFloat(expParts[2])) {
			this.a = this.toFloat(expParts[2]);
		}
		else {
			success = false;
		}
		
		if (expParts[3].equals("*")) {
			this.isMultiplication = true;
		}
		else if (expParts[3].equals("/") ) {
			this.isMultiplication = false;
		}
		else {
			success = false;
		}
		
		if (!expParts[4].equals(startUnit.getSymbol())) {
			success = false;
		}
		
		if (expParts.length == 7) {
			if (expParts[5].equals("+")) {
				this.isAddition = true;
			}
			else if (expParts[5].equals("-") ) {
				this.isAddition = false;
			}
			else {
				success = false;
			}
			
			if(this.isFloat(expParts[6])) {
				this.b = this.toFloat(expParts[6]);
			}
			else {
				success = false;
			}
		}
		return success;
	}
	
	// TODO: Move somewhere else, utils?
	private boolean isFloat(String value) {
		try{
			float f = Float.parseFloat(value);
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}
	
	// TODO: Move somewhere else, utils?
	private Float toFloat(String value) {
		try{
			return Float.parseFloat(value);
		}
		catch(Exception e) {
			return 0.0f;
		}
	}

	@Override
	public void setUnits(Unit startUnit, Unit endUnit) {
		this.startUnit = startUnit;
		this.endUnit = endUnit;
	}

}
