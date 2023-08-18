<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
List<String> list = (List<String>)request.getAttribute("departments"); 
for(String d: list) out.print("dept name: "+d+"\n");
%>
<br>
	<b>id: ${emp.getId()}</b> <br>
	<b>name: ${emp.getName()}</b><br>
	<b>salary: ${emp.getSalary()}</b><br>

<ul>
	<c:forEach var="item" items="${departments}">
	<li>${item}</li>
</c:forEach>
</ul>


</body>
</html>