package servlets;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FirstServ_11")
public class FirstServ_11 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public FirstServ_11() {
		super();
		System.out.println("I AM FROM DEFAULT CONSTRUCTOR...");
	}

	public void init() {
		System.out.println("I LOVE MY COUNTRY...");
		System.out.println("I AM FROM service METHOD...");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("I AM FROM init METHOD...");
	}

	public void destroy() {
		System.out.println("I AM FROM destroy METHOD...");
	}
}
