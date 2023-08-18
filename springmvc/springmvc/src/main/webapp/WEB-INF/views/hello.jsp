<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Hello File</title>
</head>
<body>
	<%
	Integer id = (Integer)request.getAttribute("id");
	String name = (String)request.getAttribute("name");
	Integer salary = (Integer)request.getAttribute("salary");
	out.print("id: "+id+" name: "+name+" salary: "+salary);
	%>
	
	<br/>
	id: <b>${id}</b>
	name: <b>${name}</b>
	salary: <b>${salary}</b>
</body>
</html>