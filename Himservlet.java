package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Himservlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h2 style='color:green'>You are admin user</h2>");
		String fname = (String) request.getParameter("fname");
		String lname = (String) request.getParameter("lname");
		RequestDispatcher rd = request.getRequestDispatcher("/next");
		if (fname.equals("admin")) {
			rd.include(request,response);	
		}
		else 
			rd.forward(request,response);
	}
}