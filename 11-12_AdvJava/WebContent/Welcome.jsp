<%@ page language="java" import="java.util.Date"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP test</title>
</head>
<body>
	<h2>My first JSP program...</h2>
	<h2>This is declaration tag</h2>
	<%!int a = 100, b = 200;
	int c;
	Date d = new Date();%>

	<h2>This is Expression tag(no semi-colons are allowed)</h2>
	<%=c = a + b%>
	<%=new Date()%>

	<h2>This is a scriptlet</h2>
	<%
		out.println("This is a scriptlet: " + c);
		out.print(d);
	%>
	<hr>
	<%
		int a = 100, b = 200;
		int c;
		Date d = new Date();
		c = a + b;
		out.println("This is a scriptlet: " + c);
		out.print(d);
	%>

</body>
</html>