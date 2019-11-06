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
                            <th class="text-left">Date And Time</th>
                            <th class="text-left">Location</th>
                            <th class="text-left">Sponsers</th>
                            <th class="text-center" colspan="2">Actions</th>
                        </thead>
                        <tbody>
                        <%
                            EventDao volunteerDao = new EventDao();
                            ResultSet rs = volunteerDao.getAllEvents();
                            while (rs.next()) {
                        %>
                        <tr>
                          <td class="text-left">
                            <%= rs.getString("eventType") %>
                          </td>
                          <td class="text-left">
                            <%= rs.getString("description") %>
                          </td>
                          <td class="text-left">
                            <%= rs.getString("dateTime") %>
                          </td>
                          <td class="text-left">
                            <%= rs.getString("location") %>
                          </td>
                          <td class="text-left">
                            <%= rs.getString("sponsers") %>
                          </td>
                          <td>
                            <span class="mdc-button" data-mdc-auto-init="MDCRipple">
                              <a href="#" class="mdi mdi-heart text-blue">
                                Update
                              </a>
                            </span>
                            <span class="mdc-button" data-mdc-auto-init="MDCRipple">
                              <a href="#" class="mdi mdi-heart text-blue">
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
