<%-- 
    Document   : adminLogin
    Created on : 28 Oct, 2019, 11:29:23 AM
    Author     : Ritesh Verma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="blocks/cssLinkage.jsp"></jsp:include>
<jsp:include page="blocks/nav.jsp"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
    </head>
    <body>
        <section class="ftco-section-3 img" style="background-image: url(assets/images/bg_3.jpg);">
            <div class="overlay"></div>
            <div class="container">
                <div class="row d-md-flex">
                    <div class="col-md-6 d-flex ftco-animate">
                        <div class="img img-2 align-self-stretch">
                            <h3 class="mb-3">Admin Login</h3>
                            <form action="login" method="post" class="volunter-form">
                                <div class="form-group">
                                    <input type="text" name="username" class="form-control" placeholder="Username">
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" class="form-control" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <input type="submit" value="Login" class="btn btn-white py-3 px-5">
                                </div>
                                <div class="form-group">
                                    <a class="form-control-plaintext" href="register.jsp">Not Registered? Register Here</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
<jsp:include page="blocks/footer.jsp"></jsp:include>