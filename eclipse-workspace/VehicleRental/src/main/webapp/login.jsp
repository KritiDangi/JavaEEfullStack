<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<div>
Welcome ${sessionScope.user }
</div>
</head>
<div>
${param.msg}
</div>
<body>
<form method="post" action="login.do">
User: <input type="text" name="user"><br>
Password: <input type="password" name="pwd"><br>
<button type="submit">Login</button>
</form>
</body>
</html>