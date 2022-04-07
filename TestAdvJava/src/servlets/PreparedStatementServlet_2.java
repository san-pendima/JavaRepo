package servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Example of PreparedStatement to insert records until user press n

@WebServlet("/PreparedStatementServlet_2")
public class PreparedStatementServlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pythondb", "root", "root");

			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			do {
				System.out.println("enter id:");
				int id = Integer.parseInt(br.readLine());

				System.out.println("enter name:");
				String name = br.readLine();

				System.out.println("enter salary:");
				float salary = Float.parseFloat(br.readLine());

				System.out.println("enter dept:");
				String dept = br.readLine();

				System.out.println("enter DOJ:");
				String date = br.readLine();

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setFloat(3, salary);
				ps.setString(4, dept);
				ps.setString(5, date);

				int i = ps.executeUpdate();
				System.out.println(i + " records affected");

				System.out.println("Do you want to continue: y/n");
				String s = br.readLine();

				if (s.startsWith("n")) {
					con.close();
					break;
				}
			} while (true);
		} catch (SQLException | ClassNotFoundException sqle) {
			sqle.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
