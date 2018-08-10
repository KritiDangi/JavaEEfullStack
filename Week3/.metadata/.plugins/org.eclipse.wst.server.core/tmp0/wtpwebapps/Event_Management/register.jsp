<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Registration Form</title>
</head>
<body>
<form action="register.do" method="post">
<table border="1" >
<tr>
<td>Event Name</td>
<td>Event Location</td>
<td>Event Date</td>
<td>Select</td>
</tr>
<c:forEach items="${events}" var="event">
<tr>
<td>${event.name}</td>
<td>${event.location}</td>
<td>${event.eventDate}</td>
<td> 
<input type="radio" name="evt" value="${event.id}"/>
</td>
</tr>
</c:forEach>
</table>
<br>
Customer email: <input type="text" name="email"> <br>
<button type="submit">submit</button>
</form>
</body>
</html>