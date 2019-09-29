package tdt4250.assignment2.unitconverter.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

@Component
@HttpWhiteboardServletPattern("/unit/*")
public class UnitServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	private Converter converter = new Converter();

	@Reference(
			cardinality = ReferenceCardinality.MULTIPLE,
			policy = ReferencePolicy.DYNAMIC,
			bind = "addUnit",
			unbind = "removeUnit"
	)
	public void addDictionary(Unit unit) {
		converter.addUnit(unit);
	}
	public void removeUnit(Unit unit) {
		converter.removeUnit(unit);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> segments = new ArrayList<>();
		String path = request.getPathTranslated();
		if (path != null) {
			segments.addAll(Arrays.asList(path.split("\\/")));
		}
		if (segments.size() > 0 && segments.get(0).length() == 0) {
			segments.remove(0);
		}
		if (segments.size() != 2) {
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "Request must contain 2 path segments");
			return;
		}
		String v = request.getParameter("v");
		String d = request.getParameter("d");
		ConverterResult result =  converter.convertUnit(segments.get(0), segments.get(1), v,d);
		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		if (result.getLink() != null) {
			writer.print(result.getLink());
		}
		writer.print(result.getMessage());
	}
}
