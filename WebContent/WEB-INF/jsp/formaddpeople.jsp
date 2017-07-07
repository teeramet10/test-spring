<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello Users</h2>
<table>
<form:form method ="POST"  action="peopleview.html" >

	<td>ID</td>
	<td><form:input path="Id"/></td>
	<tr>
	<td>Name</td>
	<td><form:input path="name"/></td>
	<tr>
	<td>Address</td>
	<td><form:input path="address"/></td>
	<tr>
	<td colspan="2"><input type ="Submit" value="Send"/></td>
	
</form:form>
</table>
</body>
</html>