package tdt4250.assignment2.unitconverter.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Unit {
	String getName();
	ConverterResult convert(Unit targetUnit, float value);
	
}
