<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update lead page</title>
</head>
<body>
<h2>update Details</h2>
<form action="updatepage" method="post">
<input type="hidden" name="id" value="${lead.id }"/>
FirstName<input type="text" name="firstName" value="${lead.firstName}"/>
LastName<input type="text" name="lastName" value="${lead.lastName}"/>
Email<input type="text" name="email" value="${lead.email}"/>
Mobile<input type="text" name="mobile" value="${lead.mobile}"/>
<input type="submit"value="update"/>
</form>

</body>
</html>