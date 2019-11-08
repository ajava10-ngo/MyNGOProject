package com.servlet;

import com.dao.EventDao;
import com.model.Event;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print(request.getParameter("operation") + " : ");

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

                out.print(event + " : " + description + " : " + date + " : " + time + " : " + volunteerId + " : " + location + " : " + sponsers + " ");

                Event evnt = new Event(event, description, date, time, volunteerId, location, sponsers);

                EventDao eventDao = new EventDao();
                boolean isInserted = eventDao.insertEvent(evnt);

                out.print(isInserted + " ");

                if (isInserted) {
                    response.sendRedirect("admin/eventDetails.jsp");
                } else {
                    out.print("Error Occured...");
                }

            } else if (operation.equals("Update")) {

                int eventId = Integer.parseInt(request.getParameter("eventId"));
                String event = request.getParameter("event");
                String description = request.getParameter("description");
                String date = request.getParameter("date");
                String time = request.getParameter("time");
                int volunteerId = Integer.parseInt(request.getParameter("volunteerId"));
                String location = request.getParameter("location");
                String sponsers = request.getParameter("sponsers");

                out.print(eventId + " : " + event + " : " + description + " : " + date + " : " + time + " : " + volunteerId + " : " + location + " : " + sponsers + " ");

                Event evnt = new Event(eventId, event, description, date, time, volunteerId, location, sponsers);

                EventDao eventDao = new EventDao();
                boolean isUpdated = eventDao.updateEvent(evnt);

                if (isUpdated) {
                    response.sendRedirect("admin/eventDetails.jsp");
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
                    response.sendRedirect("admin/eventDetails.jsp");
                } else {
                    out.print("Error Occured...");
                }
            }
        } catch (Exception e) {
            out.print("Event Controller Exception : " + e.toString());
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }
}
