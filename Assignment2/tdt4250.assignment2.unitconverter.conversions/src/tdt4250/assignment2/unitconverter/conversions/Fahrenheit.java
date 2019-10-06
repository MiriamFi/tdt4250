package tdt4250.assignment2.unitconverter.conversions;

import tdt4250.assignment2.unitconverter.api.Unit;

public class Fahrenheit implements Unit{

	@Override
	public String getName() {
		return "Fahrenheit";
	}

	@Override
	public String getSymbol() {
		return "F";
	}

}
