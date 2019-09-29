package tdt4250.assignment2.unitconverter.api;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Converter {
	
	private static final String DEFAULT_MESSAGE = "Resource not found";

	private Collection<Unit> units = new ArrayList<Unit>();
	
	public Converter(Unit... units) {
		this.units.addAll(Arrays.asList(units));
	}
	
	public void addUnit(Unit unit) {
		this.units.add(unit);
	}
	
	public void removeUnit(Unit unit) {
		this.units.remove(unit);
	}
	
	
	public ConverterResult convertUnit(String unitName, String targetUnitName, String value) {
		ConverterResult result;
		float v = Float.parseFloat(value);
		
		Unit unit = this.unitSearch(unitName);
		Unit targetUnit = this.unitSearch(targetUnitName);
		if(unit == null || targetUnit == null) {
			Boolean success = false;
			URI link = null;
			result = new ConverterResult(success, v,  link);
		} else {
			result= unit.convert(targetUnit, v);
		}
		return result;
	}
	
	private Unit unitSearch(String name) {
		for(Unit unit : this.units) {
			if (name == unit.getName()) {
				return unit;
			}
		}
		return null;
	}
	
	
}
