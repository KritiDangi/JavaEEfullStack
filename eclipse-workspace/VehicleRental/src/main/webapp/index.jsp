<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Rental Application</title>
</head>
<body>
<h3> Vehicle Rental Application</h3>
<div>
Welcome ${sessionScope.user }
</div>
<div>
	${param.msg}
</div>
<a href="login.jsp">Login</a><br>
<a href="vehicleForm.html">add vehicle</a><br>
<a href="customerForm.html">add customer</a><br>
<a href="rentalForm.do">rent a vehicle</a><br>
<a href="report.do">Rental report</a><br>
<a href="logout.do">Logout</a><br>
</body>
</html>