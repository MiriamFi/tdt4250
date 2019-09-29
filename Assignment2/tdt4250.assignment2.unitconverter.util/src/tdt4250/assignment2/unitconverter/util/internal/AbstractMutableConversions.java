package tdt4250.assignment2.unitconverter.util.internal;


import tdt4250.assignment2.unitconverter.util.MutableConversions;

public abstract class AbstractMutableConversions implements MutableConversions{

	public boolean isLegalConversion(CharSequence conversion) {
		int count = conversion.length();
		String signs = ".,=+-*/^ ";
		
		for (int i = 0; i < count; i++) {
			char c = conversion.charAt(i);
			if (! Character.isLetter(c)) {
				return false;
			}
			else if (! Character.isDigit(c)) {
				return false;
			}
			else if(signs.indexOf(c) == -1) {
				return false;
			}
		}
		// Add something about legal units
		return true;
	}
	
}
