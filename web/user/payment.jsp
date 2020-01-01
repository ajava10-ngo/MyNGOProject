<%-- 
    Document   : payment
    Created on : 15 Nov, 2019, 1:47:52 PM
    Author     : root
--%>

<%@page import="com.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<!DOCTYPE html>
<jsp:include page="blocks/header.jsp"></jsp:include>

   <meta charset="utf-8" />
   <title>Payment Page</title>
   <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   <div class="container">
     <div class="page-header">
       <h1>Make Payment</h1>
     </div>
     <!-- Credit Card Payment Form - START -->
     <div class="container">
       <div class="row">
         <div class="col-xs-12 col-md-4 col-md-offset-4">
           <div class="panel panel-default">
             <div class="panel-heading">
               <div class="row">
                 <h3 class="text-center">Debit Card</h3>
                 <img class="img-responsive cc-img" src="http://www.prepbootstrap.com/Content/images/shared/misc/creditcardicons.png">
               </div>
             </div>
             <div class="panel-body">
               <form action="#" method="post">
                 <div class="row">
                   <div class="col-xs-12">
                     <div class="form-group">
                       <label>CARD NUMBER</label>
                       <div class="input-group">
                         <input type="number" name="cardnumber" class="form-control" placeholder="Valid Card Number" />
                         <span class="input-group-addon"><span class="fa fa-credit-card"></span></span>
                       </div>
                     </div>
                   </div>
                 </div>
                 <div class="row">
                   <div class="col-xs-7 col-md-7">
                     <div class="form-group">
                       <label><span class="hidden-xs">EXPIRATION</span><span class="visible-xs-inline">EXP</span> DATE</label>
                       <input type="text" name="validDate" class="form-control" placeholder="MM / YY" />
                     </div>
                   </div>
                   <div class="col-xs-5 col-md-5 pull-right">
                     <div class="form-group">
                       <label>CVV CODE</label>
                       <input type="number" name="cvc" class="form-control" placeholder="CVC" />
                     </div>
                   </div>
                 </div>
                 <div class="row">
                   <div class="col-xs-12">
                     <div class="form-group">
                       <label>CARD OWNER</label>
                       <input type="text" name="owner" class="form-control" placeholder="Card Owner Names" />

                     </div>
                   </div>
                 </div>
                 <div class="panel-footer">
                   <div class="row">
                     <div class="col-xs-12">
                       <input type="submit" value="Process payment" class="btn btn-warning btn-lg btn-block">

                     </div>

                   </div>
                 </div>
               </form>
             </div>
           </div>
         </div>
       </div>
     </div>
     <!-- Credit Card Payment Form - END -->

   </div>
<jsp:include page="blocks/footer.jsp"></jsp:include>
<% }
%>