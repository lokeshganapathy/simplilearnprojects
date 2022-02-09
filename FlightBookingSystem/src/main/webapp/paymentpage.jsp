
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     <%@include file="nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Page</title>

</head>
<body>

<% Object l = session.getAttribute("l");
System.out.println("pay jsp : "+l);
%>
<br>
<div class="m-5 p-4 border">

<h1 class="text-center">Booking Details</h1>

<% Object airlines = session.getAttribute("airlines");
Object sourceflight = session.getAttribute("sourceflight");
Object destinationflight = session.getAttribute("destinationflight");
Object price = session.getAttribute("price");
Object dateoftravel = session.getAttribute("flightdate");
Object noofpersons = session.getAttribute("noofpersons");
Object totalprice = session.getAttribute("totalprice");



%>
Flight : ${airlines} <br>
Source : ${sourceflight} <br>
Destination : ${destinationflight} <br>
Date of Travel : ${dateoftravel} <br>
No of persons : ${noofpersons} <br>
Total Amount : ${totalprice} <br> 

</div>

<br>
<h1 class="text-center">Payment</h1>
<form action="payment" method="post">
<div class="container m-5 p-4">
    <div class="card px-4">
        <p class="h8 py-3">Payment Details</p>
        <div class="row gx-3">
            <div class="col-12">
                <div class="d-flex flex-column">
                    <p class="text mb-1">Person Name</p> <input class="form-control mb-3" type="text" placeholder="Name" >
                </div>
            </div>
            <div class="col-12">
                <div class="d-flex flex-column">
                    <p class="text mb-1">Card Number</p> <input class="form-control mb-3" type="text" placeholder="1234 5678 435678">
                </div>
            </div>
            <div class="col-6">
                <div class="d-flex flex-column">
                    <p class="text mb-1">Expiry</p> <input class="form-control mb-3" type="text" placeholder="MM/YYYY">
                </div>
            </div>
            <div class="col-6">
                <div class="d-flex flex-column">
                    <p class="text mb-1">CVV/CVC</p> <input class="form-control mb-3 pt-2 " type="password" placeholder="***">
                </div>
            </div>
            <div class="col-12">
                <div class="btn btn-primary mb-3"> <input class="btn btn-primary" type ="submit" value="Pay"/> <span class="fas fa-arrow-right"></span> </div>
            </div>
        </div>
    </div>
</div>
</form>
</body>
</html>