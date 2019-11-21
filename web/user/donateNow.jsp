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
   <script>
      $(function () {
         $("#desc").hide();
         $("#other").on("click", function () {
            $("#desc").toggle();
         });
      });
   </script>
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
                 <h2 class="entry-title"><a href="#">Donate Food</a></h2>
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
             <textarea rows="15" cols="6" placeholder="Description" name="description"></textarea>
             <span>
               <input class="btn gradient-bg" type="submit" value="Donate">
             </span>
           </form><!-- .contact-form -->
         </div><!-- .col -->
       </div><!-- .row -->
     </div><!-- .container -->
   </div>
<jsp:include page="blocks/footer.jsp"></jsp:include>
