<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
<h3>Customer Form</h3>
<form action="addCustomer.do" method="post">
First Name: <input type="text" name="cfname"><br>
Last Name: <input type="text" name="clname"><br>
Email: <input type="text" name="cemail"><br>
<button type="submit">Add Customer</button>
</form>
</body>
</html>