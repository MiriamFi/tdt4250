package tdt4250.assignment2.unitconverter.rest;

import tdt4250.assignment2.unitconverter.api.Unit;

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

import tdt4250.assignment2.unitconverter.api.Converter;
import tdt4250.assignment2.unitconverter.api.ConverterResult;

@Component(service=UnitResource.class)
@JaxrsResource
@Path("unit")
public class UnitResource {
	@Reference(
			policy = ReferencePolicy.DYNAMIC
			)
	private volatile Collection<Unit> units;
	
	public Converter getConverter() {
		return new Converter(units.toArray(new Unit[units.size()]));
	}

	@GET
	@Path("/{lang1}/{lang2}")
	@Produces(MediaType.APPLICATION_JSON)
	public ConverterResult search(@PathParam("lang1") String lang1, @PathParam("lang2") String lang2, @QueryParam("v") String v) throws JsonProcessingException {
		return getConverter().convertUnit(lang1, lang2, v, "-1");
	}
	
	@GET
	@Path("/{lang1}/{lang2}")
	@Produces(MediaType.APPLICATION_JSON)
	public ConverterResult search(@PathParam("lang1") String lang1, @PathParam("lang2") String lang2, @QueryParam("v") String v, @QueryParam("d") String d) throws JsonProcessingException {
		return getConverter().convertUnit(lang1, lang2, v, d);
	}

}
