package tdt4250.assignment2.unitconverter.api;

import java.util.HashMap;
import java.util.Map;

public class Converter {

	private Map<String, Conversion> conversions = new HashMap<String, Conversion>();
	private Map<String, Unit> units = new HashMap<String, Unit>();
	
	public void addConversions(Conversion... conversions) {
		for(Conversion conversion : conversions) {
			this.conversions.put(conversion.getConversionName(), conversion);
		}
		
		
	}
	
	public void addConversion(Conversion conversion) {
		this.conversions.put(conversion.getConversionName(), conversion);
		this.addUnit(conversion.getStartUnit());
		this.addUnit(conversion.getEndUnit());
	}
	
	public void removeConversion(Conversion conversion) {
		this.conversions.remove(conversion.getConversionName());
		this.removeUnit(conversion.getStartUnit());
		this.removeUnit(conversion.getEndUnit());
	}
	
	
	public void addUnit(Unit unit) {
		this.units.put(unit.getSymbol(), unit);
	}
	
	public void removeUnit(Unit unit) {
		this.units.remove(unit.getSymbol());
	}
	
	public Unit getUnit(String unitSymbol) {
		if (this.isUnitSymbolValid(unitSymbol)) {
			return units.get(unitSymbol);
		}
		return null;
	}
	
	public Conversion getConversion(String conversionName) {
			return conversions.get(conversionName);
	}
	
	public boolean isUnitSymbolValid(String unitSymbol) {
		return units.containsKey(unitSymbol);
	}
	public boolean isConversionNameValid(String conversionName) {
		return conversions.containsKey(conversionName);
	}
	
	public ConverterResult convertUnit(String startUnitName, String endUnitName, String value) {
		ConverterResult result;
		boolean success = true;
		Float v = 0.0f;
		try{
			v = Float.parseFloat(value);
		}
		catch(Exception e) {
			success = false;
		}
		
		Conversion conversion = this.conversionSearch(startUnitName, endUnitName);
		if(conversion == null) {
			success = false;
			result = new ConverterResult(success, v);
		} else {
			result= conversion.convert(startUnitName, endUnitName, v);
		}
		return result;
	}
	/*
	public ConverterResult convertUnit(Unit startUnit, Unit endUnit, float value) {
		ConverterResult result;
		boolean success = true;
		
		Conversion conversion = this.conversionSearch(startUnit.getName(), endUnit.getName());
		if(conversion == null) {
			success = false;
			result = new ConverterResult(success, value);
		} else {
			result= conversion.convert(startUnit.getName(), endUnit.getName(), value);
		}
		return result;
	}
	*/
	private Conversion conversionSearch(String startUnitName, String endUnitName) {
			String conversionName = startUnitName + endUnitName;
			return this.conversions.get(conversionName);
	}
	
	
}
