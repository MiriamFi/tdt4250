package tdt4250.assignment2.unitconverter.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Conversion {
	String getConversionName();
	Unit getStartUnit();
	Unit getEndUnit();
	void setUnits(Unit startUnit, Unit endUnit) throws Exception;
	ConverterResult convert(String startUnitSymbol, String endUnitSymbol, float value);
	
}
