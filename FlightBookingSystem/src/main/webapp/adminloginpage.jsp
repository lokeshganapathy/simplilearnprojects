<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway-Admin Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<div class="d-flex align-items-center justify-content-center">
<h1>Admin</h1>
</div>
<br>
<div class="border p-3 mb-4">

<div class="d-flex align-items-center justify-content-center">
 <div class="p-2 bd-highlight col-example">
<form action="login">
Username &ensp; : &ensp; <input  type="text" name="username" placeholder="Username"><br><br>
Password &emsp; : &ensp;<input type="password" name="password" placeholder="Password"><br><br>
<input class="btn btn-primary" type="submit" value="Login">
</form>
</div>
</div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>