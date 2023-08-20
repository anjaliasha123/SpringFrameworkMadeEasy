<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trasferring Data from UI to controller</title>
</head>
<body>
	<h1>Using Request Params</h1>
	id: <%=request.getAttribute("id")%>
	name: <%=request.getAttribute("name")%>
	email: id: <%=request.getAttribute("email")%>
</body>
</html>