<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rental Form JSTL</title>
</head>
<body>
<h2>Rental Form JSTL</h2>
<div>
Welcome ${sessionScope.user }
</div>
<form action="hireVehicle.do" method="post">
	Select customer: <input type="text" name="customerId" required><br>
	Select Vehicle: <select name="vehicle">
		<c:forEach items="${regNos}" var="no">
		<option value="${no}">${no}</option>
		</c:forEach>
		</select> <br />
	Amount: <input type="text" name="rentalAmount" /> <br />
		<button type="submit">rent a Vehicle</button>
</form>
</body>
</html>