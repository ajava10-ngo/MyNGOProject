<%-- 
    Document   : aboutUs
    Created on : Nov 15, 2019, 1:22:17 PM
    Author     : PRAGATI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="blocks/header.jsp"></jsp:include>
   <html>
     <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>About Us</title>
     </head>
     <body>
       <div class="welcome-wrap">
         <div class="container">
           <div class="row">
             <div class="col-12 col-lg-6 order-2 order-lg-1">
               <div class="welcome-content">
                 <header class="entry-header">
                   <h2 class="entry-title">Welcome to our Charity</h2>
                 </header><!-- .entry-header -->

                 <div class="entry-content mt-5">
                   <p>No one is useless in this world who lightens the burdens of another.You have not lived today until you have done something for someone who can never repay you.It's not how much we give but how much love we put into giving.
                   </p>
                 </div><!-- .entry-content -->

                 <div class="entry-footer mt-5">
                   <a href="#" class="btn gradient-bg mr-2">Read More</a>
                 </div><!-- .entry-footer -->
               </div><!-- .welcome-content -->
             </div><!-- .col -->

             <div class="col-12 col-lg-6 order-1 order-lg-2">
               <img src="assets/images/welcome.jpg" alt="welcome">
             </div><!-- .col -->
           </div><!-- .row -->
         </div><!-- .container -->
       </div><!-- .home-page-icon-boxes -->

       <div class="about-stats">
         <div class="container">
           <div class="row">
             <div class="col-12 col-sm-6 col-lg-3">
               <div class="circular-progress-bar">
                 <div class="circle" id="loader_1">
                   <strong class="d-flex justify-content-center"></strong>
                 </div>

                 <h3 class="entry-title">Hard Work</h3>
               </div>
             </div>

             <div class="col-12 col-sm-6 col-lg-3">
               <div class="circular-progress-bar">
                 <div class="circle" id="loader_2">
                   <strong class="d-flex justify-content-center"></strong>
                 </div>

                 <h3 class="entry-title">Pure Love</h3>
               </div>
             </div>

             <div class="col-12 col-sm-6 col-lg-3">
               <div class="circular-progress-bar">
                 <div class="circle" id="loader_3">
                   <strong class="d-flex justify-content-center"></strong>
                 </div>

                 <h3 class="entry-title">Smart Ideas</h3>
               </div>
             </div>

             <div class="col-12 col-sm-6 col-lg-3">
               <div class="circular-progress-bar">
                 <div class="circle" id="loader_4">
                   <strong class="d-flex justify-content-center"></strong>
                 </div>

                 <h3 class="entry-title">Good Decisions</h3>
               </div>
             </div>
           </div>
         </div>
       </div>

       <div class="about-testimonial">
         <div class="container">
           <div class="row">
             <div class="col-12 col-md-6 col-lg-5">
               <div class="testimonial-cont">
                 <div class="entry-content">
                   <p>We love to help all the children that have problems in the world. After 15 years we have many goals achieved.</p>
                 </div>

                 <div class="entry-footer d-flex flex-wrap align-items-center mt-5">
                   <img src="assets/images/testimonial-1.jpg" alt="">

                   <h4>Ritesh Verma, <span>Volunteer</span></h4>
                 </div>
               </div>
             </div>

             <div class="col-12 col-md-6 offset-lg-2 col-lg-5">
               <div class="testimonial-cont">
                 <div class="entry-content">
                   <p>We love to help all the children that have problems in the world. After 15 years we have many goals achieved.</p>
                 </div>

                 <div class="entry-footer d-flex flex-wrap align-items-center mt-5">
                   <img src="assets/images/testimonial-2.jpg" alt="">

                   <h4>Cristian James, <span>Volunteer</span></h4>
                 </div>
               </div>
             </div>
           </div>
         </div>
       </div>

       <div class="help-us">
         <div class="container">
           <div class="row">
             <div class="col-12 d-flex flex-wrap justify-content-between align-items-center">
               <h2>Help us so we can help others</h2>
               <a class="btn orange-border" href="login.jsp">Donate now</a>
             </div>
           </div>
         </div>
       </div>

       <script type='text/javascript' src='assests/js/jquery.js'></script>
       <script type='text/javascript' src='assests/js/jquery.collapsible.min.js'></script>
       <script type='text/javascript' src='assests/js/swiper.min.js'></script>
       <script type='text/javascript' src='assests/js/jquery.countdown.min.js'></script>
       <script type='text/javascript' src='assests/js/circle-progress.min.js'></script>
       <script type='text/javascript' src='assests/js/jquery.countTo.min.js'></script>
       <script type='text/javascript' src='assests/js/jquery.barfiller.js'></script>
       <script type='text/javascript' src='assests/js/custom.js'></script>

     </body>
   </html>
<jsp:include page="blocks/footer.jsp"></jsp:include>
