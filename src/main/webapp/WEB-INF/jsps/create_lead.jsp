<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>create lead page</h2>
<form action="savelead" method="post">
<pre>
FirstName<input type="text" name="firstName"/>
LastName<input type="text" name="lastName"/>
Email<input type="text" name="email"/>
Mobile<input type="text" name="mobile"/>
<input type="submit"value="save"/>
</pre>
</form>

</body>
</html>