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
   <div class="contact-page-wrap">
     <div class="container">
       <div class="row">
         <div class="col-12 col-lg-5">
           <div class="entry-content">
             <h2>Contribute With Us</h2>
             <header class="entry-header d-flex flex-wrap justify-content-between align-items-center">
               <div class="header-elements">
                 <h2 class="entry-title"><a href="#">Donate Money</a></h2>
                 <div class="post-metas d-flex flex-wrap align-items-center">
                 </div>
               </div>
               <div class="donate-icon">
                 <a href="#"><img src="assets/images/donate-icon.png" alt=""></a>
               </div>
             </header>
             <div class="entry-content mt-5">
               <p>No one is useless in this world who lightens the burdens of another.You have not lived today until you have done something for someone who can never repay you.It's not how much we give but how much love we put into giving.
               </p>
             </div><!-- .entry-content -->
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
               <p>
                 Get involved in any way that suits you and start lifting lives today. Campaign, Volunteer, Intern, Fundraise, Donate, Shop, Become a Member. Best NGO in India. Trusted Indian NGO. Educate a Child. Sponsor a Girl Child. Shuddhi All India NGO. Empower Women.
               </p>
             </div><!-- .entry-content -->

           </div>
         </div><!-- .col -->
         <div class="col-12 col-lg-7">
           <form  action="contactController" method="post" class="contact-form">
             <header class="entry-header d-flex flex-wrap justify-content-between align-items-center">
               <div class="header-elements">
                 <h2 class="entry-title"><a href="#">Other</a></h2>
                 <div class="post-metas d-flex flex-wrap align-items-center">
                 </div>
               </div>
               <div class="donate-icon">
                 <a href="#"><img src="assets/images/donate-icon.png" alt=""></a>
               </div>
             </header>
             <div class="entry-content mt-5">
               <p>
                 Volunteer for causes of your choice Education, Children, Environment. Bhumi - Youth volunteering NGO, Educate children, transform lives. Be a Campus Ambassador. Volunteer Now. Intern with us. Highlights: 10 Years Of Experience, Non-Profit Organisation.
               </p>
             </div><!-- .entry-content -->
             <input type="email" placeholder="Email"  name="email">
             <textarea rows="15" cols="6" placeholder="Messages" name="message"></textarea>
             <span>
               <input class="btn gradient-bg" type="submit" value="Contact us">
             </span>
           </form><!-- .contact-form -->
         </div><!-- .col -->
       </div><!-- .row -->
     </div><!-- .container -->
   </div>
<jsp:include page="blocks/footer.jsp"></jsp:include>
