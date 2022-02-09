<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>



</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>


<!-- Nav Bar 

- By Lokesh Ganapathy G

 -->
 
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="homepage.jsp">FlyAway</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="homepage.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="adminloginpage.jsp">Admin</a>
        </li>
        
        
      </ul>
      
    </div>
  </div>
</nav>



<!-- Search Flights Form

By - Lokesh Ganapathy G 
 -->
 
 <div class="flightform m-5 pt-4">
 <form action = "flight">
 
 <input type="date" name="dateoftravel"  >
 <input type="text" name="source" placeholder="Source">
 <input type="text" name="destination" placeholder="Destination">
 <input type="text" name="noofpersons" placeholder="No of Persons">
 <input  type="submit">
 </form>
 </div>
 
 
 
 
 <!-- Display of Flights 

by Lokesh ganapathy G 

-->

<div class="m-5 p-2">

<table class="table" >
<tr>

<th>Source</th>
<th>Destination</th>
<th>Airlines</th>
<th>Prices</th>
</tr>

<% Object l = request.getAttribute("l");
Object d = request.getAttribute("d");

session.setAttribute("l", l);
session.setAttribute("d", d);

%>

<c:forEach items="${flightss}" var="fli">
<% System.out.println("in loop"); %>

<form action="book" method="post">
    <tr>    
    				
                   
                    <td><label name="sourceflight" >${fli.sourceflight}</label></td>
                    
                    <td><label name="destinationflight" >${fli.destinationflight}</label></td>
                    <td><label name="airlines">${fli.airlines}</label> </td>
                    <td><label name="prices">${fli.prices}</label></td>  
                    <td><input type="hidden" name="flight" value="${fli.fid}" placeholder="${fli}"/></td>
        
        <td><input class="btn btn-primary" type="submit" value="book"></td>  
    </tr>
    </form>
</c:forEach>





</table>

</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>