<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Cart</title>
</head>
<body>
<h2>${sessionScope.user} 's cart </h2>
<table border="1">
<tr>
<th> Product Name </th> <th> Product Price </th>
</tr>

<c:forEach items= "${sessionScope.cartitems}" var="p">
<tr>
<td>${p.name }</td>
<td>${p.price }</td>
</tr>
</c:forEach>
</table>
<br>

<a href="checkout.do"><button type="submit">Checkout</button></a>

</body>
</html>