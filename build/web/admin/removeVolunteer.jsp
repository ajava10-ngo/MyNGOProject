<%-- 
    Document   : removeVolunteer
    Created on : 5 Nov, 2019, 2:27:34 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.Volunteer"%>
<%@page import="com.dao.VolunteerDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            try {
                int volunteerId = Integer.parseInt(request.getParameter("volunteerId"));
                if (volunteerId !=  0) {
                    Volunteer volunteer = new Volunteer();
                    volunteer.setVolunteerId(volunteerId);
                    VolunteerDao volunteerDao = new VolunteerDao();
                    
                    boolean isRemoved = volunteerDao.removeVolunteer(volunteer);
                    
                    if (isRemoved) {
                        response.sendRedirect("volunteerDetails.jsp");
                    } else {
                        out.print("<h1 style='color : red;>Volunteer Not Removed</h1>");
                    }
                }
        %>

        <%
            } catch (Exception e) {
                out.print("<h1 style='color : red;'>Remove Volunteer Exception : " + e.toString() + " </h1>");
            }
        %>
    </body>
</html>
