package dilip;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/MyFirstSer")
public class MyFirstSer implements Servlet {

	ServletConfig config = null;

	public MyFirstSer() {

	}

	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("servlet is initialized");
	}

	public void destroy() {
		System.out.println("servlet is destroyed");
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("<h1><b>hello simple servlet</b></h1>");
		out.print("</body></html>");
	}

}
