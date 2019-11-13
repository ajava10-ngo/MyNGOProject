package com.servlet;

import com.dao.VolunteerDao;
import com.model.Volunteer;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VolunteerCardController extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();

      try {

         int volunteerId = Integer.parseInt(request.getParameter("volunteerId"));
//         String idCardNo = request.getParameter("idCardNo");
//         String city = request.getParameter("city");
//         String state = request.getParameter("state");
//         String mobile = request.getParameter("mobile");
//         String qualification = request.getParameter("qualification");
//         String passingYear = request.getParameter("passingYear");
//         String proffession = request.getParameter("proffession");

         Volunteer volunteer = new Volunteer();
         volunteer.setVolunteerId(volunteerId);

         VolunteerDao volunteerDao = new VolunteerDao();
         ResultSet rs = volunteerDao.getSingleVolunteer(volunteer);
         
         String data = "";

         while (rs.next()) {

            data += "Name : " + rs.getString("name");
         }

         out.print(data);

      } catch (Exception e) {
         out.print("Volunteer Card Controller Exception : " + e.toString());
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
