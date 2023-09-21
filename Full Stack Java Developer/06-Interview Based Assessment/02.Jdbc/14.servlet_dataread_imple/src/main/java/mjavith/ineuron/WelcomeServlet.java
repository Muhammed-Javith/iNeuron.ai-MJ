package mjavith.ineuron;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "WelcomeServlet1", urlPatterns = { "/WelcomeServlet1" })
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Set the content type and get the writer
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Read the user's name from the request parameter
		String name = "Subodh";
		//System.out.println(name);
		// Generate the welcome message
		String message = "Welcome, " + name + "!";

		// Write the HTML response
		out.println("<html>");
		out.println("<head><title>Welcome</title></head>");
		out.println("<body>");
		out.println("<h1>" + message + "</h1>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}

}
