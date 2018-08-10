<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event form</title>
</head>
<style type="text/css">
	.error{
	color: red;
	font-size: 12pt;
	}
</style>
<body>
<h1>Event Form</h1>
<!-- not using w3c forms
using spring framework form, so that we can map form fields to an object -->
<form:form commandName="event" action="addEvent.do">  <!-- name of the Book object -->                 <!-- attributes of the Book object -->
Event name:<form:input path="name"/> <form:errors path="name" cssClass="error"/>  <br>
Event Date: <form:input path="eventDate"/> <form:errors path="eventDate" cssClass="error"/> <br>
Location: <form:input path="location"/> <br> <form:errors path="location" cssClass="error"/> <br>
<button type="submit">submit</button>
</form:form>
</body>
</html>