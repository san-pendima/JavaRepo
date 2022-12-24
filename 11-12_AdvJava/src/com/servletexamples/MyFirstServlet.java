package com.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		int value = Integer.parseInt(request.getParameter("marks"));

		if (value >= 0 && value <= 40) {
			out.println("<html>");
			out.println("<h2>Sorry your are failed....</h2>");
			out.println("</html>");
		} else if (value >= 41 && value <= 90) {
			out.println("<html>");
			out.println("<h2>Congrats! your are passed....</h2>");
			out.println("</html>");
		} else if (value >= 91 && value <= 100) {
			out.println("<html>");
			out.println("<h2>Congrats! First Class....</h2>");
			out.println("</html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
