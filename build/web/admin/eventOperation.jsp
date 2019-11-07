<%--
    Document   : eventOperation
    Created on : 7 Nov, 2019, 2:49:33 PM
    Author     : root
--%>

<%@page import="com.dao.EventDao"%>
<%@page import="com.model.Event"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    out.print(request.getParameter("operation"));
    
    String operation = request.getParameter("operation");

    try {
        if (operation.equals("Submit")) {
            
            String event = request.getParameter("event");
            String description = request.getParameter("description");
            String date = request.getParameter("date");
            String time = request.getParameter("time");
            int volunteerId = Integer.parseInt(request.getParameter("volunteerId"));
            String location = request.getParameter("location");
            String sponsers = request.getParameter("sponsers");

            Event evnt = new Event(event, description, date, time, volunteerId, location, sponsers);

            EventDao eventDao = new EventDao();
            boolean isInserted = eventDao.insertEvent(evnt);

            if (isInserted) {
                response.sendRedirect("eventDetails.jsp");
            } else {
                out.print("Error Occured...");
            }
        } else if (operation.equals("Update")) {
            
            String event = request.getParameter("event");
            String description = request.getParameter("description");
            String date = request.getParameter("date");
            String time = request.getParameter("time");
            int volunteerId = Integer.parseInt(request.getParameter("volunteerId"));
            String location = request.getParameter("location");
            String sponsers = request.getParameter("sponsers");
            
            int eventId = Integer.parseInt(request.getParameter("eventId"));
            Event evnt = new Event(event, description, date, time, volunteerId, location, sponsers);
            evnt.setEventId(eventId);
            EventDao eventDao = new EventDao();
            boolean isUpdated = eventDao.updateEvent(evnt);

            if (isUpdated) {
                response.sendRedirect("eventDetails.jsp");
            } else {
                out.print("Error Occured...");
            }
        } else if (operation.equals("Remove")) {
            int eventId = Integer.parseInt(request.getParameter("eventId"));
            Event evnt = new Event();
            evnt.setEventId(eventId);
            EventDao eventDao = new EventDao();

            boolean isRemoved = eventDao.removeEvent(evnt);

            if (isRemoved) {
                response.sendRedirect("eventDetails.jsp");
            } else {
                out.print("Error Occured...");
            }
        }

    } catch (Exception e) {
        out.print("Create Event JSP Exception : " + e.toString());
    }
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Event Operation Page</title>
  </head>
  <body>

  </body>
</html>
