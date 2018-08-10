<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User form</title>
</head>
<style type="text/css">
	.error{
	color: red;
	font-size: 12pt;
	}
</style>
<body>
<h1>User Form</h1>
<!-- not using w3c forms
using spring framework form, so that we can map form fields to an object -->
<form:form commandName="user" action="addUser.do">  <!-- name of the Book object -->                 <!-- attributes of the Book object -->
First name:<form:input path="firstName"/> <form:errors path="firstName" cssClass="error"/>  <br>
Last name: <form:input path="lastName"/> <form:errors path="lastName" cssClass="error"/> <br>
phone: <form:input path="phone"/> <br> <form:errors path="phone" cssClass="error"/> <br>
email: <form:input path="email"/> <br> <form:errors path="email" cssClass="error"/> <br>
<button type="submit">submit</button>
</form:form>
</body>
</html>