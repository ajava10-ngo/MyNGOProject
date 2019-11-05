<%-- 
    Document   : makeVolunteer
    Created on : 4 Nov, 2019, 10:31:25 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.dao.VolunteerDao"%>
<%@page import="com.model.Volunteer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            try {
                String id = request.getParameter("id");
                String email = request.getParameter("email");
                if (id != null && email != null) {
                    int userId = Integer.parseInt(id);
                    Volunteer volunteer = new Volunteer(userId);
                    VolunteerDao volunteerDao = new VolunteerDao();
                    boolean isInserted = volunteerDao.makeVolunteer(volunteer);
                    if (isInserted) {
        %>
        
        <h1>An Email Is Sent To The User !</h1>
        <% response.sendRedirect("volunteerDetails.jsp"); %>

        <%
        } else {
        %>

        <%= "Not Success.."%>

        <%
            }
        } else {
        %>

        <%= "Email or UserId is null"%>

        <%
                }
            } catch (Exception e) {
                out.print("Volunteer Exception : " + e.toString());
            }
        %>
    </body>
</html>
