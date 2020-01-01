<%--
    Document   : donation
    Created on : 25 Oct, 2019, 4:51:26 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="blocks/header.jsp"></jsp:include>
   <!DOCTYPE html>
<%
   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Cache-Control", "no-store");
   response.setHeader("Pragma", "no-cache");
   response.setDateHeader("Expires", 0);

   if (session.getAttribute("user") == null) {
      response.sendRedirect("../login.jsp");
   } else {
      User user = (User) session.getAttribute("user");
      if (user.getVerified() == 0) {
         response.sendRedirect("../emailVerification.jsp");
      }
%>
<html>
  <head>
    <title>Donation</title>
    <script>
       $(function () {
          $("#chkPassport").click(function () {
             if ($(this).is(":checked")) {
                $("#dvPassport").show();

             } else {
                $("#dvPassport").hide();
             }
          });
       });
    </script>
  </head>
  <body>
    <div class="container">
      <div class="row d-md-flex">
        <div class="col-md-6 d-flex ftco-animate">
          <div class="img img-2 align-self-stretch" style="background-image: url(../../assets/images/bg_4.jpg);"></div>
        </div>
        <div class="col-md-6 volunteer pl-md-5 ftco-animate">
          <h3 class="mb-3">Donation Detail</h3>
          <form action="donationController" method="post" class="volunter-form">
            <div class="form-group">
              <label>Name</label><input type="text" name="name" class="form-control" placeholder="Enter Your Name..." required="">
            </div>
            <div class="form-group">
              <ul>
                <li><a href="payment.jsp" name="money" style="font-size: 20px;color: black" >&nbsp;Money</a></li>
                <li><a href="" name="blood" style="font-size: 20px;color: black">&nbsp;Blood</a></li>
                <li>
                  <label for="chkPassport">
                    <input type="checkbox" id="chkPassport" />
                    other
                  </label>
                </li>
                <hr/>
                <div id="dvPassport" style="display: none">
                  <textarea id="txtPassportNumber" placeholder="Other Please Specify" ></textarea>
                  <br>
                  <br>
                  <input type="submit" value="Continue.."  class="btn gradient-bg">
                </div>
              </ul>
            </div>
            <div class="form-group">
            </div>
          </form>
        </div>    			
      </div>
    </div>
  </body>
</html>
<jsp:include page="blocks/footer.jsp"></jsp:include>
<%
   }
%>