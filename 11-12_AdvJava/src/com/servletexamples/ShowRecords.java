package com.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowRecords")
public class ShowRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		Connection con;
		try {
			con = ConnectTODatabase.createDBConnection();
			String q = "select * from mani.employee";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q);

			out.println("<table border='2px' bgcolor='cyan' cellspacing='2px' cellpadding='2px'>");
			out.println("<th>EmpID</th>");
			out.println("<th>Emp Name</th>");
			out.println("<th>Emp Salary</th>");
			out.println("<th>Emp Dept</th>");
			out.println("<th>Emp DOJ</th>");
			while (rs.next()) {
				
				out.println("<tr>");
				out.println("<td>" + rs.getString(1) + "</td>");
				out.println("<td>" + rs.getString(2) + "</td>");
				out.println("<td>" + rs.getString(3) + "</td>");
				out.println("<td>" + rs.getString(4) + "</td>");
				out.println("<td>" + rs.getString(5) + "</td>");
				out.println("</tr>");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
