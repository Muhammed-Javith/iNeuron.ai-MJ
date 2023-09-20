package mjavith.ineuron;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("David");

		response.setContentType("text/html");
		response.getWriter().println("<html><body>");

		if (name == null) {
			response.getWriter().println("<h2>Welcome, Guest!</h2>");
		} else {
			response.getWriter().println("<h2>Welcome, " + name + "!</h2>");
		}

		response.getWriter().println("<a href=\"updateName\">Update Name</a>");
		response.getWriter().println("</body></html>");
	}
}

@SuppressWarnings("serial")
@WebServlet("/updateName")
class UpdateNameServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");

		HttpSession session = request.getSession();
		session.setAttribute("name", name);

		response.sendRedirect("welcome");
	}
}
