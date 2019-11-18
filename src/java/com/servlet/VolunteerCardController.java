package com.servlet;

import com.dao.VolunteerDao;
import com.model.User;
import com.model.Volunteer;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
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

         Volunteer volunteer = new Volunteer();
         volunteer.setVolunteerId(volunteerId);

         VolunteerDao volunteerDao = new VolunteerDao();
         ArrayList<User> al = volunteerDao.getSingleVolunteer(volunteer);

         User user = al.get(0);

         String data = "";

         data += "<br><br>";
         data += "Volunteer ID : " + user.getVolunteer().getIdCardNo() + "<br><br>";
         data += "Name : " + user.getName() + "<br><br>";
         data += "City : " + user.getCity().getCity() + "<br><br>";
         data += "State : " + user.getState().getState() + "<br><br>";
         data += "Mobile : " + user.getMobile() + "<br><br>";
         data += "Qualification : " + user.getProfile().getQualification() + "<br><br>";
         data += "Profession : " + user.getProfile().getProfession();

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
