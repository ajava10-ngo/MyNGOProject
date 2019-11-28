<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">

    <!-- FontAwesome CSS -->
    <link rel="stylesheet" href="assets/css/font-awesome.min.css">

    <!-- ElegantFonts CSS -->
    <link rel="stylesheet" href="assets/css/elegant-fonts.css">

    <!-- themify-icons CSS -->
    <link rel="stylesheet" href="assets/css/themify-icons.css">

    <!-- Swiper CSS -->
    <link rel="stylesheet" href="assets/css/swiper.min.css">

    <!-- Styles -->
    <link rel="stylesheet" href="assets/css/style.css">

    <script type='text/javascript' src='assets/js/jquery.js'></script>
    <script type='text/javascript' src='assets/js/jquery.collapsible.min.js'></script>
    <script type='text/javascript' src='assets/js/swiper.min.js'></script>
    <script type='text/javascript' src='assets/js/jquery.countdown.min.js'></script>
    <script type='text/javascript' src='assets/js/circle-progress.min.js'></script>
    <script type='text/javascript' src='assets/js/jquery.countTo.min.js'></script>
    <script type='text/javascript' src='assets/js/jquery.barfiller.js'></script>
    <script type='text/javascript' src='assets/js/custom.js'></script>

  </head>
  <body>
    <header class="site-header">
      <div class="top-header-bar">
        <div class="container">
          <div class="row flex-wrap justify-content-center justify-content-lg-between align-items-lg-center">
            <div class="col-12 col-lg-8 d-none d-md-flex flex-wrap justify-content-center justify-content-lg-start mb-3 mb-lg-0">
              <div class="header-bar-email">
                MAIL: <a href="#">ajava@ngo.com</a>
              </div><!-- .header-bar-email -->
              <div class="header-bar-text">
                <p>PHONE: <span>7471126354</span></p>
              </div><!-- .header-bar-text -->
            </div><!-- .col -->
            <div class="col-12 col-lg-4 d-flex flex-wrap justify-content-center justify-content-lg-end align-items-center">
              <div class="donate-btn">
                <%
                   if (session.getAttribute("user") != null) {
                %>
                <a href="../logout">Logout</a>
                <%
                } else {
                %>
                <a href="../login.jsp">Donate Now</a>
                <%
                   }
                %>
              </div><!-- .donate-btn -->
            </div><!-- .col -->            
          </div><!-- .row -->
        </div><!-- .container -->
      </div><!-- .top-header-bar -->
      <div class="nav-bar">
        <div class="container">
          <div class="row">
            <div class="col-12 d-flex flex-wrap justify-content-between align-items-center">
              <div class="site-branding d-flex align-items-center">
                <a class="d-block" href="index.jsp" rel="home"><img class="d-block" src="assets/images/logo.png" alt="logo"></a>
              </div><!-- .site-branding -->
              <nav class="site-navigation d-flex justify-content-end align-items-center">
                <ul class="d-flex flex-column flex-lg-row justify-content-lg-end align-content-center">
                  <li class="current-menu-item"><a href="../index.jsp">Home</a></li>
                  <li><a href="donateNow.jsp">Donate Now</a></li>
                  <li><a href="#">Suggestion</a></li>
                  <li><a href="updateProfile.jsp">Update Profile</a></li>
                </ul>
              </nav><!-- .site-navigation -->
              <div class="hamburger-menu d-lg-none">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
              </div><!-- .hamburger-menu -->
            </div><!-- .col -->
          </div><!-- .row -->
        </div><!-- .container -->
      </div><!-- .nav-bar -->
    </header><!-- .site-header -->
    <!-- END nav -->