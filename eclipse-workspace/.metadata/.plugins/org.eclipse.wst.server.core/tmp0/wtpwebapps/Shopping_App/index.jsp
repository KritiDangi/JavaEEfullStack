<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping App</title>
</head>
<body>
<h1>Shopping App</h1>
<div>
Welcome ${sessionScope.user}
</div> 
<a href="productForm.html">Add Product</a><br>
<a href="listProducts.do">List Products</a><br>
<a href=logout.do>Logout</a><br>

</body>
</html>