package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class NextPage extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname = (String) request.getParameter("fname");
		String lname = (String) request.getParameter("lname");
		out.print("<h2 style='color:blue'>"+fname+"</h2>");
		out.print("<h2 style='color:blue'>"+lname+"</h2>");
	}
}