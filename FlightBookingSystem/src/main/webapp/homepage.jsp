<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>



</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>






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
 
 
 
 
 




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>