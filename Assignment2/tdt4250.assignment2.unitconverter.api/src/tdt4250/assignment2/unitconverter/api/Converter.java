package tdt4250.assignment2.unitconverter.api;

import java.util.HashMap;
import java.util.Map;

public class Converter {

	private static Map<String, Conversion> conversions = new HashMap<String, Conversion>();
	private static Map<String, Unit> units = new HashMap<String, Unit>();
	
	public static void addConversions(Conversion... conversions) {
		for(Conversion conversion : conversions) {
			addConversion(conversion);
		}
		
		
	}
	
	public static void addConversion(Conversion conversion) {
		conversions.put(conversion.getConversionName(), conversion);
		addUnit(conversion.getStartUnit());
		addUnit(conversion.getEndUnit());
	}
	
	public static void removeConversion(Conversion conversion) {
		conversions.remove(conversion.getConversionName());
		removeUnit(conversion.getStartUnit());
		removeUnit(conversion.getEndUnit());
	}
	
	
	public static void addUnit(Unit unit) {
		units.put(unit.getSymbol(), unit);
	}
	
	public static void removeUnit(Unit unit) {
		units.remove(unit.getSymbol());
	}
	
	public static Unit getUnit(String unitSymbol) {
		if (isUnitSymbolValid(unitSymbol)) {
			return units.get(unitSymbol);
		}
		return null;
	}
	
	public static Conversion getConversion(String conversionName) {
			return conversions.get(conversionName);
	}
	
	public static boolean isUnitSymbolValid(String unitSymbol) {
		return units.containsKey(unitSymbol);
	}
	public static boolean isConversionNameValid(String conversionName) {
		return conversions.containsKey(conversionName);
	}
	
	public static ConverterResult convertUnit(String startUnitName, String endUnitName, String value) {
		ConverterResult result;
		boolean success = true;
		Float v = 0.0f;
		try{
			v = Float.parseFloat(value);
		}
		catch(Exception e) {
			success = false;
		}
		
		Conversion conversion = conversionSearch(startUnitName, endUnitName);
		if(conversion == null) {
			success = false;
			result = new ConverterResult(success, v);
		} else {
			result= conversion.convert(startUnitName, endUnitName, v);
		}
		return result;
	}

	private static Conversion conversionSearch(String startUnitSymbol, String endUnitSymbol) {
			String conversionName = startUnitSymbol + endUnitSymbol;
			return conversions.get(conversionName);
	}
	
	
}
