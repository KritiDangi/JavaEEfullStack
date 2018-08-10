<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Listing</title>
</head>
<body>
<h3>Product Listing</h3>
<div>
Welcome ${sessionScope.user }
</div>
<form action="cart.do" method="post">
<table border="1">
<tr>
<th> Product Name </th> <th> Product Price </th> <th> Select </th>
</tr>

<c:forEach items= "${products}" var="p">
<tr>
<td>${p.name }</td>
<td>${p.price }</td>
<td><input type="checkbox" value="${p.id}" name="productcheckbox"></td>
</tr>
</c:forEach>
</table>
<br>
<button type="submit">Add to cart</button>
</form>
</body>
</html>