<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=request.getAttribute("emp") %>
<br>
	<b>id: ${emp.getId()}</b> <br>
	<b>name: ${emp.getName()}</b><br>
	<b>salary: ${emp.getSalary()}</b>
</body>
</html>