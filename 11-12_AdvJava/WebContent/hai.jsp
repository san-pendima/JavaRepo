<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String value = "hello";
		out.print("Welcome " + request.getParameter("uname"));
		value = config.getInitParameter("var");
		out.println("<br/>driver name is= " + value);
	%>
</body>
</html>