package com.servlet;

import com.model.Donor;
import com.dao.DonorDao;
import com.dao.UserDao;
import com.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DonorController extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter pw = response.getWriter();

      String operation = request.getParameter("operation");
      try {
         pw.print(operation);
         if (operation.equals("Submit")) {
            int userId = Integer.parseInt(request.getParameter("userId").trim());
            String date = request.getParameter("date");
            int stockId = Integer.parseInt(request.getParameter("stockId"));
            Donor donor = new Donor(userId, stockId, date);
            DonorDao donorDao = new DonorDao();

            User user = new User();
            user.setUserId(userId);
            user.setStockId(stockId);

            UserDao userDao = new UserDao();
            Boolean isUpdated = userDao.updateBloodGroup(user);

            if (isUpdated) {
               boolean isInserted = donorDao.insertDonor(donor);
               if (isInserted) {
                  response.sendRedirect("admin/donorDetails.jsp");
                  pw.print("Recored Inserted");
               } else {
                  pw.print("Cannot Insert...");
               }
            } else {
               pw.print("Cannot Udpate...");
            }

         } else if (operation.equals("Remove")) {
            int donorId = Integer.parseInt(request.getParameter("donorId"));

            Donor donor = new Donor();
            donor.setDonorId(donorId);

            DonorDao donorDao = new DonorDao();
            boolean isRemoved = donorDao.removeDonor(donor);

            if (isRemoved) {
               response.sendRedirect("admin/donorDetails.jsp");
            } else {
               pw.print("Error Occured...");
            }
         }
      } catch (Exception ex) {
         pw.print("DonorController Exception : " + ex.toString());
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
