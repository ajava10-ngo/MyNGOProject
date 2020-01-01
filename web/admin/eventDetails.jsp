<%-- 
    Document   : eventDetails
    Created on : 5 Nov, 2019, 8:41:35 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.User"%>
<%@page import="com.model.Event"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.EventDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Cache-Control", "no-store");
   response.setHeader("Pragma", "no-cache");
   response.setDateHeader("Expires", 0);

   if (session.getAttribute("user") == null) {
      response.sendRedirect("../login.jsp");
   } else {
      User user = (User) session.getAttribute("user");
      if (user.getType() == 1) {
%>
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
                       <th class="text-center">Event</th>
                       <th class="text-center">Description</th>
                       <th class="text-center">Date</th>
                       <th class="text-center">Time</th>
                       <th class="text-center">Location</th>
                       <th class="text-center">Sponsers</th>
                       <th class="text-center">Actions</th>
                       </thead>
                       <tbody>
                       <%
                          EventDao volunteerDao = new EventDao();
                          Event event = new Event();
                          ArrayList<Event> al = volunteerDao.getAllEvent();
                          for (int i = 0; i < al.size(); i++) {
                             event = al.get(i);
                       %>
                       <tr>
                         <td class="text-center">
                           <%= event.getEvent()%>
                         </td>
                         <td class="text-center">
                           <%= event.getDescription()%>
                         </td>
                         <td class="text-center">
                           <%= event.getDate()%>
                         </td>
                         <td class="text-center">
                           <%= event.getTime()%>
                         </td>
                         <td class="text-center">
                           <%= event.getLocation()%>
                         </td>
                         <td class="text-center">
                           <%= event.getSponsers()%>
                         </td>
                         <td class="text-center">
                           <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                             <a href="../eventController?operation=Remove&eventId=<%= event.getEventId()%>" class="mdi mdi-heart text-blue">
                               Remove
                             </a>
                           </span>
                           <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                             <a href="createEvent.jsp?eventId=<%= event.getEventId()%>" class="mdi mdi-heart text-blue">
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
<%
      } else {
         response.sendRedirect("../login.jsp");
      }
   }
%>