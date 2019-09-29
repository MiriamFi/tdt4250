package tdt4250.assignment2.unitconverter.rest;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleSerializers;

import tdt4250.assignment2.unitconverter.api.ConverterResult;

public class UnitModule extends Module{
	
	
	private final SimpleSerializers serializers = new SimpleSerializers();
	
	public UnitModule() {
		serializers.addSerializer(ConverterResult.class, new JsonSerializer<ConverterResult>(){
			@Override
			public void serialize(ConverterResult converterResult, JsonGenerator jsonGen, 
				SerializerProvider serializerProvider) throws IOException {
					jsonGen.writeStartObject(converterResult);
					jsonGen.writeBooleanField("success", converterResult.isSuccess());
					jsonGen.writeStringField("message", converterResult.getMessage());
					if (converterResult.getLink() != null) {
						jsonGen.writeStringField("link", converterResult.getLink().toString());
					}
			}
		});
		
	}

	@Override
	public String getModuleName() {
		return "UnitModule";
	}

	@Override
	public void setupModule(final SetupContext context) {
		context.addSerializers(serializers);
		
	}

	@Override
	public Version version() {
		return Version.unknownVersion();
	}

	
}
