<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book form</title>
</head>
<style type="text/css">
	.error{
	color: red;
	font-size: 12pt;
	}
</style>
<body>
<h1>Book Form</h1>
<!-- not using w3c forms
using spring framework form, so that we can map form fields to an object -->
<form:form commandName="book" action="addBook.do">  <!-- name of the Book object -->
Id:  <form:input path="id"/>  <form:errors path="id" cssClass="error"/> <br>                   <!-- attributes of the Book object -->
Title:<form:input path="title"/> <form:errors path="title" cssClass="error"/>  <br>
Price: <form:input path="price"/> <form:errors path="price" cssClass="error"/> <br>
Category: <form:input path="category"/> <br>
Published Date(dd-mm-yyyy): <form:input path="publishedDate"/> <br>
Publisher Address <form:input path="publisherAddress"/>
<button type="submit">submit</button>
</form:form>
</body>
</html>