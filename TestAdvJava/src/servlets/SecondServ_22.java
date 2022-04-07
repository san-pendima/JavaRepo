package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SecondServ_22")
public class SecondServ_22 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public SecondServ_22() {
		System.out.println("SERVLET LOADED...");
	}

	public void init() {
		System.out.println("I AM FROM init METHOD...");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Date d = new Date();
		String s = d.toString();
		pw.println("<h1> WELCOME TO SERVLETS <h1>");
		pw.println("<h2> CURRENT DATE & TIME IS : " + s + "<h2>");
	}

	public void destroy() {
		System.out.println("I AM FROM destroy METHOD...");
	}
}
