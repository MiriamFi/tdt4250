package tdt4250.assignment2.unitconverter.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import tdt4250.assignment2.unitconverter.api.Converter;
import tdt4250.assignment2.unitconverter.api.ConverterResult;
import tdt4250.assignment2.unitconverter.api.Unit;
import tdt4250.assignment2.unitconverter.api.Conversion;

@Component
@HttpWhiteboardServletPattern("/convert/*")
public class ConversionServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	//private Converter converter = new Converter();
	
	private static final String VALUE_PARAM = "v";
	private static final String FROM_PARAM = "from";
	private static final String TO_PARAM = "to";


	@Reference(
			cardinality = ReferenceCardinality.MULTIPLE,
			policy = ReferencePolicy.DYNAMIC,
			bind = "addConversion",
			unbind = "removeConversion"
	)
	public void addConversion(Conversion conversion) {
		Converter.addConversion(conversion);
	}
	public void removeConversion(Conversion conversion) {
		Converter.removeConversion(conversion);
	}
/*
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> segments = new ArrayList<>();
		String path = request.getPathTranslated();
		if (path != null) {
			segments.addAll(Arrays.asList(path.split("\\/")));
		}
		if (segments.size() > 0 && segments.get(0).length() == 0) {
			segments.remove(0);
		}
		if (segments.size() < 2) {
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "Request must contain 2 path segments");
			return;
		}
		String v = request.getParameter("v");
		String startUnit = segments.get(0);
		String endUnit = segments.get(1);
		
		ConverterResult result =  converter.convertUnit(startUnit, endUnit , v);
		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		writer.print(result.getMessage());
	}*/
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> parameterMap = request.getParameterMap();
		if (!parameterMap.containsKey(VALUE_PARAM)
				|| !parameterMap.containsKey(FROM_PARAM)
				|| !parameterMap.containsKey(TO_PARAM)) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST,
					"Request must contain all three parameters: "
							+ VALUE_PARAM + ", " + FROM_PARAM + " and " + TO_PARAM);
			return;
		}

		String value = request.getParameter(VALUE_PARAM);
		Unit startUnit = Converter.getUnit(request.getParameter(FROM_PARAM));
		Unit endUnit = Converter.getUnit(request.getParameter(TO_PARAM));
		if (startUnit == null || endUnit == null) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST,
					"Request must contain valid units");
			return;
		}

		ConverterResult result = Converter.convertUnit(startUnit.getSymbol(), endUnit.getSymbol(), value);
		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		writer.print(result.getMessage());
		//sendResponse(result, response);
	}
	
	
	
	

}