<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Read All</title>
</head>
<body >
	<h2>read all data</h2>
	<table>
		<tr>
			<th>firstName</th>
			<th>lastName</th>
			<th>email</th>
			<th>mobile</th>
			<th>delete</th>
			<th>update</th>
		</tr>
		<c:forEach var="data" items="${lead}">
		<tr>
			<td>${data.firstName}</td>
			<td>${data.lastName}</td>
			<td>${data.email}</td>
			<td>${data.mobile}</td>
			<td><a href="deletelead?id=${data.id}">delete</a></td>
			<td><a href="updatelead?id=${data.id}">update</a></td>
			</tr>
			</c:forEach>
		
	</table>
</body>
</html>