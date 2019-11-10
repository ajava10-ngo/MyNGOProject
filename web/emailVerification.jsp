<%-- 
    Document   : emailVerification
    Created on : 9 Nov, 2019, 11:14:07 AM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.EmailVerification"%>
<%@page import="com.mailSending.SendMailSSL"%>
<%@page import="java.util.Random"%>
<%@page import="com.dao.UserDao"%>
<%@page import="com.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   String email = "";
   Random r = new Random();
   String generatedOtp = "";

   if (request.getParameter("email") != null) {
      email = request.getParameter("email");

      generatedOtp = String.format("%4d", r.nextInt(1001));
      System.out.println("Value of i is : " + generatedOtp);
      EmailVerification verification = new EmailVerification(email, generatedOtp);
      SendMailSSL.sendEmail(verification);

      session.setAttribute("generatedOtp", generatedOtp);

   }
%>

<html>
  <head>
    <title>Email Verification</title>
    <jsp:include page="blocks/header.jsp"></jsp:include>
       <script>
          function verifyOtp() {

             var otp = document.getElementById("otp").value;
             var email = document.getElementById("email").value;
             var err = document.getElementById("err");

             object = new XMLHttpRequest();
             object.open("post", "register?operation=Verify&email=" + email + "&otp=" + otp);
             object.onreadystatechange = function () {
                if (object.readyState === 4) {
                   var response = object.responseText;
                   if (response === "Success") {
                      window.location.href = "index.jsp";
                   } else {
                      err.innerHTML = response;
                   }
                }
             };
             object.send();
          }
       </script>
    </head>
    <body>
      <div class="container">
        <div class="row d-md-flex">
          <div class="col-md-6 d-flex ftco-animate">
            <div class="img img-2 align-self-stretch" style="background-image: url(assets/images/bg_4.jpg);"></div>
          </div>
          <div class="col-md-6 volunteer pl-md-5 ftco-animate">
            <h3 class="mb-3">Email Verification</h3>
            <!--<form action="register" method="post" class="volunter-form">-->
            <div class="form-group">
              <input type="text" id="otp" name="otp" class="form-control" placeholder="Enter OTP" required="">
              <input type="hidden" id="email" value="<%= email%>" name="email">
          </div>
          <div class="form-group" >
            <input type="button" onclick="verifyOtp()" id="verifyButton" class="btn gradient-bg" value="Verify">
            <p id="err"></p>
          </div>              
          <div class="form-group">
            <a class="form-control-sm" href="register?operation=ResendOTP&email=<%=email%>">Didn't Get OTP? Resend</a>
          </div>
          <!--</form>-->
        </div>    			
      </div>
    </div>
  </body>
</html>
<jsp:include page="blocks/footer.jsp"></jsp:include>
