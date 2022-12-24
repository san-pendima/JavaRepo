package com.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MySecondServlet")
public class MySecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		

		String eid = request.getParameter("eid");
		String ename = request.getParameter("ename");
		String salary = request.getParameter("esal");
		String dept = request.getParameter("edept");
		String doj = request.getParameter("edoj");
		
		Connection con;
		try {
			con = ConnectTODatabase.createDBConnection();
			String query = "insert into employee(empid,empname,salary,dept,doj) \r\n" + 
					"values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, eid);
			ps.setString(2, ename);
			ps.setString(3, salary);
			ps.setString(4, dept);
			ps.setString(5, doj);
			
			int no_of_records_inserted = ps.executeUpdate();
			out.println("<h2>Records updated successfully...</h2>");
			out.println("<form action='./ShowRecords' method='get'>");
			out.println("<br><input type='submit' value='Show updated records'/> ");
			out.println("</form>");
			
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
