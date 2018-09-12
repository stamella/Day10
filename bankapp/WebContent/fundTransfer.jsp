<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fund Transfer</title>
</head>
<body bgcolor="pink">
<img src = "images/icici.jpg" width="150" height="50" align="left"/>


<form action="fundTransfer" method="post">
	<br><br>
	<h1>Transfer Fund</h1>
		<label> From Account Number: </label>
		<input type="number" value="${customer.accountId}" name="fromAcc" readonly>
		<br> <br>
		<label> Enter amount : </label>
		<input type="number"  name="amount">
		<br> <br>
		<label> To Account Number: </label>
		<input type="number" name="toAcc">
		<br> <br>

        <input type="submit" name="Tranfer Fund"/>

</body>
</html>