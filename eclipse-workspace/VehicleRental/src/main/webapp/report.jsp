<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rental report</title>
</head>
<body>
<h1>Rental report</h1>
<div>
Welcome ${sessionScope.user }
</div>
<table border="1">
<tr>
<th>Id</th> <th> Customer email </th> <th> Vehicle reg no </th> <th> type </th> <th> Rental date </th>
</tr>

<c:forEach items= "${reports}" var="report">
<tr>
<td>${report.id }</td>
<td>${report.email }</td>
<td>${report.regNo }</td>
<td>${report.vehicleType }</td>
<td>${report.rentalDate }</td>
</tr>
</c:forEach>
</table>

</body>
</html>