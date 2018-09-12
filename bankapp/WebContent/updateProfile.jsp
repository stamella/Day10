<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink" style="text-align=center">
<img src = "images/icici.jpg" width="150" height="50" align="left"/>

      
<form action="updateProfile" method="post">
	<br><br><br>
	
	<h1>Edit your Details</h1>
		<label> Customer Id: </label>
		<input type="number" value="${customer.customerId }" name="customerId" readonly>
		<br> <br>
		<label>Customer Name: </label> 
		<input type="text" name="customerName" placeholder="${customer.customerName}" size="15" required /> 
		<br> <br>
		<label> Email Id: </label> 
		<input type="email" name="emailId" placeholder="${customer.emailId}"size="10" required /> 
		<br> <br>
        <label> Address: </label> 
		<input type="text" name="address" placeholder="${customer.address}"size="15" required /> 
		<br> <br>
		<label> Date Of Birth: </label> 
		<input type="date" name="dob" placeholder="${customer.dob}"size="10" required /> 
		<br> <br>
		
		<input type="submit" name="update">
		
		<%@ include file = "footer.jsp" %>
</body>
</html>