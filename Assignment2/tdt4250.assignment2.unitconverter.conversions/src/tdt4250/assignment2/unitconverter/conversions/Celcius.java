package tdt4250.assignment2.unitconverter.conversions;


import tdt4250.assignment2.unitconverter.api.Unit;

public class Celcius implements Unit{
	

	@Override
	public String getName() {
		return "Celcius";
	}

	@Override
	public String getSymbol() {
		return "C";
	}

}
