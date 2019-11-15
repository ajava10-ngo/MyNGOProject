<%-- 
    Document   : contact
    Created on : Nov 15, 2019, 12:53:38 PM
    Author     : PRAGATI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="blocks/header.jsp"></jsp:include>
<html>
    <head>
        <title>Contact Us</title>
    </head>
    <body>
         <div class="contact-page-wrap">
        <div class="container">
            <div class="row">
                <div class="col-12 col-lg-5">
                    <div class="entry-content">
                        <h2>Get In touch with us</h2>

                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempus vestib ulum mauris. Lorem ipsum dolor sit amet, conse ctetur. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempus vestib ulum mauris quis aliquam. Integer accu msan sodales odio, id tempus velit ullamc.</p>

                        <ul class="contact-social d-flex flex-wrap align-items-center">
                            <li><a href="#"><i class="fa fa-pinterest-p"></i></a></li>
                            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                            <li><a href="#"><i class="fa fa-behance"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                        </ul>

                        <ul class="contact-info p-0">
                            <li><i class="fa fa-phone"></i><span>7471126354</span></li>
                            <li><i class="fa fa-envelope"></i><span>ajava10@ngo.com</span></li>
                            <li><i class="fa fa-map-marker"></i><span>Universal Informatics ,A.B Road Bhawarkuwa ,Indore</span></li>
                        </ul>
                    </div>
                </div><!-- .col -->

                <div class="col-12 col-lg-7">
                    <form  action="contactController" method="post" class="contact-form">
                        <input type="text" placeholder="Name" name="name">
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

   
    </body>
    
</html>
    
<jsp:include page="blocks/footer.jsp"></jsp:include>