<%-- 
    Document   : eventDetails
    Created on : 5 Nov, 2019, 8:41:35 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.dao.EventDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Event Details</title>
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
                        <h1 class="mdc-card__title mdc-card__title--large">Upcoming Events</h1>
                      </div>
                      <table class="table">
                        <thead>
                        <th class="text-left">Event</th>
                        <th class="text-left">Description</th>
                        <th class="text-left">Date</th>
                        <th class="text-left">Time</th>
                        <th class="text-left">Location</th>
                        <th class="text-left">Sponsers</th>
                        <th class="text-center">Actions</th>
                        </thead>
                        <tbody>
                        <%
                            EventDao volunteerDao = new EventDao();
                            ResultSet rs = volunteerDao.getAllEvent();
                            while (rs.next()) {
                        %>
                        <tr>
                          <td class="text-left">
                            <%= rs.getString("event")%>
                          </td>
                          <td class="text-left">
                            <%= rs.getString("description")%>
                          </td>
                          <td class="text-left">
                            <%= rs.getString("date")%>
                          </td>
                          <td class="text-left">
                            <%= rs.getString("time")%>
                          </td>
                          <td class="text-left">
                            <%= rs.getString("location")%>
                          </td>
                          <td class="text-left">
                            <%= rs.getString("sponsers")%>
                          </td>
                          <td class="text-center">
                            <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                              <a href="" class="mdi mdi-heart text-blue">
                                Remove
                              </a>
                            </span>
                            <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                              <a href="createEvent.jsp?eventId=<%= rs.getString("eventId") %>" class="mdi mdi-heart text-blue">
                                Update
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
              <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                <a href="createEvent.jsp" class="mdi mdi-heart text-blue">
                  Create
                </a>
              </span>
            </div>
          </main>
          <jsp:include page="blocks/footer.jsp"></jsp:include>
      </div>
    </div>
  </body>
</html>
