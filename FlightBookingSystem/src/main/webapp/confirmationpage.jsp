<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
         <%@include file="nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>


<div class="m-5 p-4 border">

<h1 class="text-center">Booking Confirmation Details</h1>
<br>
<% Object airlines = session.getAttribute("airlines");
Object sourceflight = session.getAttribute("sourceflight");
Object destinationflight = session.getAttribute("destinationflight");
Object price = session.getAttribute("price");
Object dateoftravel = session.getAttribute("flightdate");
Object noofpersons = session.getAttribute("noofpersons");
Object totalprice = session.getAttribute("totalprice");



%>

<table class="table table-dark table-hover">
  <thead>
    <tr class="table-success">
      <th scope="col">SI.No</th>
      <th scope="col">Flight</th>
      <th scope="col">Source</th>
      <th scope="col">Destination</th>
      <th scope="col">Date of Travel</th>
      <th scope="col">No of Persons</th>
      <th scope="col">Total Amount</th>
    </tr>
  </thead>
  <tbody>
    <tr class="table-success">
      <th scope="row">1</th>
      <td>${airlines}</td>
      <td>${sourceflight}</td>
      <td>${destinationflight}</td>
      <td>${dateoftravel}</td>
      <td>${noofpersons}</td>
      <td>${totalprice}</td>
    </tr>
   
  </tbody>
</table>

<div class="m-5 p-4 border">
<h2 class="text-center">Thank You!! Have a safe journey with us!! </h2>


</div>



</div>
</body>
</html>