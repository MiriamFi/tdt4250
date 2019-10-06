package tdt4250.assignment2.unitconverter.api;

import java.net.URI;

import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public class ConverterResult {

	private final boolean success;
	private final String message;
	private static final String DEFAULT_MESSAGE = "Resource not found";
	
	public ConverterResult(boolean success, float value) {
		super();
		this.success = success;
		
		if(success) {
			this.message = String.format("%.2f", value);
		}
		else {
			this.message = DEFAULT_MESSAGE;
		}
		
		
	}
	
	public boolean isSuccess() {
		return success;
	}
	
	public String getMessage() {
		return message;
	}
	

}
