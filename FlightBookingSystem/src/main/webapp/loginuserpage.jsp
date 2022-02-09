<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div class="d-flex align-items-center justify-content-center">
<h1>Login</h1>
</div>
<br>
<div class="border p-3 mb-4">

<div class="d-flex align-items-center justify-content-center">
 <div class="p-2 bd-highlight col-example">
<form action="loginuser" method="post">
Username &ensp; : &ensp; <input  type="text" name="uname" placeholder="Username"><br><br>
Password &emsp; : &ensp;<input type="password" name="pass" placeholder="Password"><br><br>
<input class="btn btn-primary" type="submit" value="Login">
</form>
</div>
</div>
</div>
</body>
</html>