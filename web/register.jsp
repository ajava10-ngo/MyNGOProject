<%-- 
    Document   : register
    Created on : 25 Oct, 2019, 5:10:33 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.dao.StockDao"%>
<%@page import="com.dao.CityDao"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.StateDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int stateId = 0;
%>
<jsp:include page="blocks/nav.jsp"></jsp:include>
<jsp:include page="blocks/cssLinkage.jsp"></jsp:include>
    <!DOCTYPE html>
    <html>
        <head>
            <title>Register Page</title>
        </head>
        <body>
            <section class="ftco-section-3 img" style="background-image: url(assets/images/bg_3.jpg);">
                <div class="overlay"></div>
                <div class="container">
                    <div class="row d-md-flex">
                        <div class="col-md-6 d-flex ftco-animate">
                            <div class="img img-2 align-self-stretch" style="background-image: url(assets/images/bg_4.jpg);"></div>
                        </div>
                        <div class="col-md-6 volunteer pl-md-5 ftco-animate">
                            <h3 class="mb-3">Register</h3>
                            <form action="register" method="post" class="volunter-form">
                                <div class="form-group">
                                    <input type="text" name="name" class="form-control" placeholder="Name">
                                </div>
                                <div class="form-group">
                                    <input type="email" name="email" class="form-control" placeholder="Email">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="username" class="form-control" placeholder="Username">
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" class="form-control" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="mobile" class="form-control" placeholder="Mobile">
                                </div>
                                <div class="form-group">
                                    <div class="form-control">
                                        <label class="label-gender">Gender
                                        </label>

                                        <label class="gender-radio">Male
                                            <input type="radio" name="gender" value="Male">
                                            <span class="checkmark"></span>
                                        </label>

                                        <label class="gender-radio" >Female
                                            <input type="radio" name="gender" value="Female">
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="text" name="age" class="form-control" placeholder="Age">
                                </div>
                                <div class="form-group">
                                    <select class="custom-select" name="stockId">
                                        <option value="" selected="">Select Blood Group</option>
                                    <%
                                        StockDao stockDao = new StockDao();
                                        ResultSet rsStock = stockDao.getAllStock();

                                        while (rsStock.next()) {
                                    %>
                                    <option value="<%= rsStock.getString("stockId")%>" >
                                        <%= rsStock.getString("bloodGroup")%>
                                    </option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>
                            <div class="form-group">
                                <select class="custom-select" name="stateId">
                                    <option value="" selected="">Select State</option>
                                    <%
                                        ResultSet rsState = null;
                                        try {
                                            StateDao stateDao = new StateDao();

                                            rsState = stateDao.getAllState();
                                        } catch (Exception e) {
                                            out.print("Exception : " + e.toString());
                                        }
                                        while (rsState.next()) {
                                    %>
                                    <option value="<%= rsState.getInt("stateId")%>">
                                        <%= rsState.getString("state")%>
                                    </option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>
                            <div class="form-group">
                                <select class="custom-select" name="cityId">
                                    <option value="">Select City</option>
                                    <%
                                        ResultSet rsCity = null;
                                        stateId = 20;
                                        try {
                                            CityDao cityDao = new CityDao();
                                            rsCity = cityDao.getAllCity(stateId);
                                        } catch (Exception e) {
                                            out.print("Exception : " + e.toString());
                                        }
                                        while (rsCity.next()) {
                                    %>

                                    <option value="<%= rsCity.getString("cityId")%>"><%= rsCity.getString("city")%></option>

                                    <%
                                        }
                                    %>
                                </select>
                            </div>

                            <div class="form-group">
                                <textarea name="address" placeholder="Address" class="form-control textarea"></textarea>
                            </div>

                            <div class="form-group">
                                <input type="submit" value="Register" class="btn btn-white py-3 px-5">
                            </div>
                            <div class="form-group">
                                <a class="form-control-plaintext" href="login.jsp">Already Registered? Login Here</a>
                            </div>
                        </form>
                    </div>    			
                </div>
            </div>
        </section>
    </body>
</html>
<jsp:include page="blocks/footer.jsp"></jsp:include>


