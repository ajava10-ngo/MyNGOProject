<%-- 
    Document   : donorDetails
    Created on : 5 Nov, 2019, 6:30:26 PM
    Author     : Ritesh Verma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.DonorDao"%>
<%@page import="com.model.Donor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor Details</title>
    </head>
    <body>
        <div class="body-wrapper">
            <jsp:include page="blocks/nav.jsp"></jsp:include>
            <jsp:include page="blocks/header.jsp"></jsp:include>
                <div class="page-wrapper mdc-toolbar-fixed-adjust">
                    <main class="content-wrapper">
                        <div class="mdc-layout-grid">
                            <div class="mdc-layout-grid__inner">
                                <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
                                    <div class="mdc-card table-responsive">
                                        <div class="table-heading px-2 px-1 border-bottom">
                                            <h1 class="mdc-card__title mdc-card__title--large">Donor List</h1>
                                        </div>
                                        <table class="table">
                                            <thead>

                                                <tr>
                                                    <th class="text-left">Name</th>
                                                    <th class="text-left">Blood Group</th>
                                                    <th class="text-left">Mobile</th>
                                                    <th class="text-left">Gender</th>
                                                    <th class="text-left">Age</th>
                                                    <th class="text-left">Address</th>
                                                </tr>

                                            </thead>
                                            <tbody>
                                            <%
                                                DonorDao donorDao = new DonorDao();
                                                ResultSet rs = donorDao.getAllDonor();
                                                while (rs.next()) {
                                            %>
                                            <tr>
                                                <td class="text-left">
                                                    <%= rs.getString("name") %>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("bloodGroup") %>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("mobile") %>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("gender") %>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("age") %>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("address") %>
                                                </td>
                                            </tr>
                                            <%
                                                }
                                            %>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
                <!--content-->
                <jsp:include page="blocks/footer.jsp"></jsp:include>
            </div>
        </div>
    </body>
</html>
