<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<form action="customerLogin" method="post">
<body bgcolor="pink" style="text-align:center" >
 
 <img src = "images/icici.jpg" width="150" height="50" align="left"/>


	<h1>Login to your account</h1>
	
	<br><br>
		<label> Customer Id: </label> 
		<input type="number" name="customerId" required /> 
		<br> <br>
		<label> Password: </label> 
		<input type="password" name="password" size="10" required /> 
		<br> <br>
		<input type="submit" name="Login">
		<br> <br>

<%@ include file = "footer.jsp" %>
</body>
</html>