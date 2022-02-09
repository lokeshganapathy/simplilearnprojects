<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway-Places</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<!-- Nav Bar 

- By Lokesh Ganapathy G

 -->
 
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="adminpage.jsp">FlyAway</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="adminpage.jsp">Admin</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="places.jsp">Places</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="airlines.jsp">Airlines</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="flights.jsp">Flights</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="changepasswordpage.jsp">Change Password</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="homepage.jsp">Logout</a>
        </li>
        
        
      </ul>
      
    </div>
  </div>
</nav>

<!-- Display of Places 

by Lokesh ganapathy G 

-->

<div class="m-5 p-2">
<table class="table" >
<tr>
<th>ID</th>
<th>Places</th>
</tr>

<tr>
<td>1</td>
<td>Chennai</td>
</tr>

<tr>
<td>2</td>
<td>Mumbai</td>
</tr>

<tr>
<td>3</td>
<td>Delhi</td>
</tr>

<tr>
<td>4</td>
<td>Bangalore</td>
</tr>


</table>

</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>