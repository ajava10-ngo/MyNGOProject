<%-- 
    Document   : donateNow
    Created on : Nov 14, 2019, 11:37:02 AM
    Author     : PRAGATI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Cache-Control", "no-store");
   response.setHeader("Pragma", "no-cache");
   response.setDateHeader("Expires", 0);

   if (session.getAttribute("user") == null) {
      response.sendRedirect("../login.jsp");
   }
%>
<!DOCTYPE html>
<jsp:include page="blocks/header.jsp"></jsp:include>
   <title>Donate Now</title>
   <!--   <link rel="stylesheet" href="assets/css/jquery.datetimepicker.min.css">
      <link rel="stylesheet" href="assets/css/bootstrap.min.css">
   
      <script src="assets/js/jquery.js"></script>
      <script src="assets/js/jquery.datetimepicker.full.js"></script>
      <script src="assets/js/jquery-3.4.1.js"></script>
      <script src="assets/js/popper.min.js"></script>
      <script src="assets/js/bootstrap.min.js"></script>
      <script src="assets/js/jquery.datetimepicker.full.min.js"></script>
      <script>
         $('#datepicker').datetimepicker({
            timepicker: false,
            datepicker: true,
            format: 'Y-m-d',
            value: '2019-01-01',
            hours12: true,
            step: 5
         });
      </script>-->


   <div class="contact-page-wrap">
     <div class="container">
       <div class="row">
         <div class="col-12 col-lg-5">
           <h2>Contribute With Us</h2>
           <div class="entry-content">
             <header class="entry-header d-flex flex-wrap justify-content-between align-items-center">
               <div class="header-elements">
                 <h2 class="entry-title"><a href="payment.jsp">Donate Money</a></h2>
                 <div class="post-metas d-flex flex-wrap align-items-center">
                 </div>
               </div>
               <div class="donate-icon">
                 <a href="payment.jsp"><img src="assets/images/donate-icon.png" alt=""></a>
               </div>
             </header>
             <div class="entry-content mt-5">
             </div>
             <header class="entry-header d-flex flex-wrap justify-content-between align-items-center">
               <div class="header-elements">
                 <h2 class="entry-title"><a href="#">Donate Blood</a></h2>
                 <div class="post-metas d-flex flex-wrap align-items-center">
                 </div>
               </div>
               <div class="donate-icon">
                 <a href="#"><img src="assets/images/donate-icon.png" alt=""></a>
               </div>
             </header>
             <div class="entry-content mt-5">
             </div>
             <header class="entry-header d-flex flex-wrap justify-content-between align-items-center">
               <div class="header-elements">
                 <h2 class="entry-title"><a href="../requestController?req=Food">Donate Food</a></h2>
                 <div class="post-metas d-flex flex-wrap align-items-center">
                 </div>
               </div>
               <div class="donate-icon">
                 <a href="../requestController?req=Food"><img src="assets/images/donate-icon.png" alt=""></a>
               </div>
             </header>
             <div class="entry-content mt-5">
             </div>
             <header class="entry-header d-flex flex-wrap justify-content-between align-items-center">
               <div class="header-elements">
                 <h2 class="entry-title"><a href="#">Donate Clothes</a></h2>
                 <div class="post-metas d-flex flex-wrap align-items-center">
                 </div>
               </div>
               <div class="donate-icon">
                 <a href="#"><img src="assets/images/donate-icon.png" alt=""></a>
               </div>
             </header>
             <div class="entry-content mt-5">
             </div>
             <header class="entry-header d-flex flex-wrap justify-content-between align-items-center">
               <div class="header-elements">
                 <h2 id="other" class="entry-title"><a href="#">Other</a></h2>
                 <div class="post-metas d-flex flex-wrap align-items-center">
                 </div>
               </div>
               <div class="donate-icon">
                 <a href="#"><img src="assets/images/donate-icon.png" alt=""></a>
               </div>
             </header>
             <div class="entry-content mt-5">
             </div>
           </div>
         </div><!-- .col -->
         <div class="col-12 col-lg-7" id="desc">
           <form  action="" method="post" class="contact-form">
             <input type="text" name="reqType" placeholder="Request Type">
             <input type="text" name="reqFor" placeholder="Request For">
             <input type="text" name="date" id="datepicker" placeholder="Date">
             <input type="text" name="time" placeholder="Time">
             <textarea rows="5" cols="6" name="location" placeholder="Location"></textarea>
             <textarea rows="7" cols="6" name="description" placeholder="Description"></textarea>
             <span>
               <input class="btn gradient-bg" type="submit" name="req" value="Donate">
             </span>
           </form><!-- .contact-form -->
         </div><!-- .col -->
       </div><!-- .row -->
     </div><!-- .container -->
   </div>
<jsp:include page="blocks/footer.jsp"></jsp:include>
