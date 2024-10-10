<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.User.UserDetails" %>
    
<!DOCTYPE html>
<html>
<head>
 <style type="text/css">
  .back-img {
  background:url("image/notebook1.jpg");
  width: 100%;
  height: 80vh;
  background-repeat: no-repeat;
  background-size:cover;
  }
 </style>
 
 <meta charset="ISO-8859-1"> 
 <title>Home Page</title>
 <%@include file="all_component/allcss.jsp" %>
 </head>

<body class="back-img">
 <%@include file="all_component/navbar.jsp" %>
 
 <div class="container-fluid">
  <div class="text-center">
   <h1 class="text-white"><i class="fa fa-book" aria-hidden="true"></i> E Notes-Save Your Notes</h1>
   <a href="login.jsp" class="btn btn-light"><i class="fa fa-user-circle-o" aria-hidden="true"></i> Login</a>
   <a href="register.jsp" class="btn btn-light"><i class="fa fa-user-plus" aria-hidden="true"></i> Register</a>
  </div>
 
 </div>
 
 <div class="container-fluid bg-dark mt-5" style='position:relative; top:365px;'>
<p class="text-center text-white">Note: Any Errors occurs then contact with Munazza. Designed and developed by Munazza Nasir</p>

<p class="text-center text-white">All Right Reserved @Munazza-2023-24</p>

</div>
</body>
</html>