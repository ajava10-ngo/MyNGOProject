package com.servlet;

import com.dao.VolunteerDao;
import com.mailSending.SendMailSSL;
import com.model.Volunteer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VolunteerController extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      PrintWriter out = response.getWriter();
      try {
         String operation = request.getParameter("operation");
         out.print(operation + "<br>");

         if (operation.equals("Insert")) {
            String userId = request.getParameter("userId");

            String email = request.getParameter("email");
            if (userId != null && email != null) {
               String prefix = "NGO";
               String idCardNo = "0123456789";
               StringBuilder sb = new StringBuilder(5);

               for (int i = 0; i < 5; i++) {
                  int index = (int) (idCardNo.length() * Math.random());
                  sb.append(idCardNo.charAt(index));
               }
               idCardNo = prefix + sb;
               System.out.println(idCardNo);
               int uId = Integer.parseInt(userId);
               Volunteer volunteer = new Volunteer(uId, idCardNo);
               VolunteerDao volunteerDao = new VolunteerDao();
               boolean isInserted = volunteerDao.insertVolunteer(volunteer);

               if (isInserted) {
                  if (SendMailSSL.sendEmail(email)) {
                     response.sendRedirect("admin/volunteerDetails.jsp");
                  } else {
                     out.print("Mail Not Sent");
                  }
               } else {
                  out.print("Not Success..");
               }
            } else {
               out.print("Email or UserId is null");
            }
         } else if (operation.equals("Update")) {
            String userId = request.getParameter("userId");
         } else if (operation.equals("Remove")) {

            String volunteerId = request.getParameter("volunteerId");
            out.print(volunteerId + "<br>");

            int vId = Integer.parseInt(volunteerId);
            Volunteer volunteer = new Volunteer();
            volunteer.setVolunteerId(vId);
            VolunteerDao volunteerDao = new VolunteerDao();
            boolean isRemoved = volunteerDao.removeVolunteer(volunteer);

            out.print(isRemoved + "<br>");

            if (isRemoved) {
               response.sendRedirect("admin/volunteerDetails.jsp");
            }
         }

      } catch (Exception e) {
         out.print("Volunteer Controller Exception : " + e.toString());
      }
   }
}
