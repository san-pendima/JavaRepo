<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Implicit_Obj_Req_Resp.jsp">
		Enter your user-name: <input type="text" name="username"> <input
			type="submit" value="submit"><br />
	</form>

	<%
		String name = request.getParameter("username");
		out.print("Welcome " + name);
		
		//response.sendRedirect("https://www.youtube.com/");
	%>
</body>
</html>