package com.servlet;

import com.dao.EventDao;
import com.model.Event;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateEvent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        try {
            
            out.print(request.getParameter("operation"));
            
//            String event = request.getParameter("event");
//            String description = request.getParameter("description");
//            String date = request.getParameter("date");
//            String time = request.getParameter("time");
//            int volunteerId = Integer.parseInt(request.getParameter("volunteerId"));
//            String location = request.getParameter("location");
//            String sponsers = request.getParameter("sponsers");
//            
//            out.print(event + " : " + description + " : " + date + " : " + volunteerId + " : " + location + " : " + sponsers + " ");
//            
//            Event evnt = new Event(event, description, date, time, volunteerId, location, sponsers);
//            
//            EventDao eventDao = new EventDao();
//            boolean isInserted = eventDao.insertEvent(evnt);
//            
//            if (isInserted) {
//                response.sendRedirect("admin/eventDetails.jsp");
//            } else {
//                out.print("Error Occured...");
//            }
            
        } catch (Exception e) {
            out.print("Create Event Servlet Exception : " + e.toString());
        }
    }
}
