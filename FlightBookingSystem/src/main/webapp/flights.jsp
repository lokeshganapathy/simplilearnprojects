<%@page import="com.flyaway.model.Flights"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway-Flights</title>
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


<!-- Add flights -->


<div class="m-1" style="text-align:center">
<a  href="addflight.jsp"><button class="m-5  btn btn-primary">Add Flight</button></a>

</div>


<!-- View Flights -->

<div class="m-1" style="text-align:center">

<form action="viewflights">

<input class="btn btn-primary" type="submit" value="View Flights" >

</form>

</div>






<!-- values from database -->



<!-- Display of Flights 

by Lokesh ganapathy G 

-->

<div class="m-5 p-2">

<table class="table" >
<tr>
<th>ID</th>
<th>Source</th>
<th>Destination</th>
<th>Airlines</th>
<th>Prices</th>
</tr>

<% System.out.println("${flights}"); %>

<c:forEach items="${flights}" var="fl">
<% System.out.println("in jsp"); %>


    <tr>    
    				
                    <td><c:out value="${fl.fid}" /></td>
                    <td><c:out value="${fl.sourceflight}" /></td>
                    <td><c:out value="${fl.destinationflight}" /></td>
                    <td><c:out value="${fl.airlines}" /></td>
                    <td><c:out value="${fl.prices}" /></td>  
        
       
    </tr>
   
</c:forEach>





</table>

</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>