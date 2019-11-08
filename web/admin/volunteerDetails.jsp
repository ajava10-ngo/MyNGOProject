<%-- 
    Document   : volunteerDetails
    Created on : 4 Nov, 2019, 11:40:04 AM
    Author     : Ritesh Verma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.VolunteerDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Volunteer Details</title>
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
                        <h1 class="mdc-card__title mdc-card__title--large">Volunteer List</h1>
                      </div>
                      <table class="table">
                        <thead>
                          <tr>
                            <th class="text-center">Name</th>
                            <th class="text-center">Email</th>
                            <th class="text-center">Username</th>
                            <th class="text-center">Mobile</th>
                            <th class="text-center">Gender</th>
                            <th class="text-center">Age</th>
                            <th class="text-center">City</th>
                            <th class="text-center">State</th>
                            <th class="text-center">Address</th>
                            <th class="text-center">Actions</th>
                          </tr>
                        </thead>
                        <tbody>
                        <%
                            VolunteerDao volunteerDao = new VolunteerDao();
                            ResultSet rs = volunteerDao.getAllVolunteer();
                            while (rs.next()) {
                        %>
                        <tr>
                          <td class="text-center">
                            <%= rs.getString("name")%>
                          </td>
                          <td class="text-center">
                            <%= rs.getString("email")%>
                          </td>
                          <td class="text-center">
                            <%= rs.getString("username")%>
                          </td>
                          <td class="text-center">
                            <%= rs.getString("mobile")%>
                          </td>
                          <td class="text-center">
                            <%= rs.getString("age")%>
                          </td>
                          <td class="text-center">
                            <%= rs.getString("gender")%>
                          </td>
                          <td class="text-center">
                            <%= rs.getString("cityId")%>
                          </td>
                          <td class="text-center">
                            <%= rs.getString("stateId")%>
                          </td>
                          <td class="text-center">
                            <%= rs.getString("address")%>
                          </td>
                          <td >
                            <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                              <a href="../volunteerController?operation=Remove&volunteerId=<%= rs.getString("volunteerId")%>" class="mdi mdi-heart text-blue">
                                Remove
                              </a>
                            </span>
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
          <jsp:include page="blocks/footer.jsp"></jsp:include>
      </div>
    </div>
  </body>
</html>
