package tdt4250.assignment2.unitconverter.rest;


import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import com.fasterxml.jackson.core.JsonProcessingException;

import tdt4250.assignment2.unitconverter.api.Conversion;
import tdt4250.assignment2.unitconverter.api.Converter;
import tdt4250.assignment2.unitconverter.api.ConverterResult;

@Component(service=ConversionResource.class)
@JaxrsResource
@Path("conversion")
public class ConversionResource {
	@Reference(
			policy = ReferencePolicy.DYNAMIC
			)
	private volatile Collection<Conversion> conversions;
	
	public Converter getConverter() {
		return new Converter(conversions.toArray(new Conversion[conversions.size()]));
	}

	@GET
	@Path("/{lang1}/{lang2}")
	@Produces(MediaType.APPLICATION_JSON)
	public ConverterResult search(@PathParam("lang1") String lang1, @PathParam("lang2") String lang2, @QueryParam("v") String v) throws JsonProcessingException {
		return getConverter().convertUnit(lang1, lang2, v);
	}
	

}