<%--
    Document   : login
    Created on : 25 Oct, 2019, 4:51:26 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Cache-Control", "no-store");
   response.setHeader("Pragma", "no-cache");
   response.setDateHeader("Expires", 0);

   if (session.getAttribute("user") != null) {
      User user = (User) session.getAttribute("user");
      if (user.getType() == 1) {
         response.sendRedirect("admin/dashboard.jsp");
      } else {
         response.sendRedirect("user/donateNow.jsp");
      }
   }
%>
<jsp:include page="blocks/header.jsp"></jsp:include>
   <!DOCTYPE html>
   <title>Login Page</title>
   <script>
      function validateLogin() {
         var username = document.getElementById("username").value;
         var password = document.getElementById("password").value;
         var err = document.getElementById("err");

         object = new XMLHttpRequest();

         var method = "get";
         var url = "loginController?username=" + username + "&password=" + password;

         object.open(method, url);

         object.onreadystatechange = function () {
            if (object.readyState === 4) {
               var response = object.responseText;
               if (response === "Admin") {
                  window.location.href = "admin/dashboard.jsp";
               } else if (response === "User") {
                  window.location.href = "user/donateNow.jsp";
               } else if (response === "Verify") {
                  window.location.href = "emailVerification.jsp";
               } else {
                  err.innerHTML = "<span style='color : red'>" + response + "<span>";
               }
            }
         };
         object.send();
      }
   </script>
   <div class="container">
     <div class="row d-md-flex">
       <div class="col-md-6 d-flex ftco-animate">
         <div class="img img-2 align-self-stretch" style="background-image: url(assets/images/bg_4.jpg);"></div>
       </div>
       <div class="col-md-6 volunteer pl-md-5 ftco-animate">
         <h3 class="mb-3">Login</h3>
         <div class="form-group">
           <input id="username" type="text" name="username" class="form-control" placeholder="Username" required="">
         </div>
         <div class="form-group">
           <input id="password" type="password" name="password" class="form-control" placeholder="Password" required="">
         </div>
         <div class="form-group">
           <input type="button" value="Login" onclick="validateLogin()" class="btn gradient-bg">
         </div>
         <p id="err"></p>
         <div class="form-group">
           <a class="form-control-plaintext" href="register.jsp">Not Registered? Register Here</a>
         </div>
       </div>    			
     </div>
   </div>
<jsp:include page="blocks/footer.jsp"></jsp:include>
