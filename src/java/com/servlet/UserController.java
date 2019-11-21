package com.servlet;

import com.dao.UserDao;
import com.dao.VolunteerDao;
import com.model.User;
import com.model.Volunteer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");

      PrintWriter out = response.getWriter();
      String operation = request.getParameter("operation");
      out.print(operation + "<br>");
      try {
         if (operation.equals("Inactive")) {
            String userId = request.getParameter("userId");

            if (userId != null) {
               int uId = Integer.parseInt(userId);

               User user = new User();
               user.setUserId(uId);

               UserDao userDao = new UserDao();

               boolean isRemoved = userDao.inactiveUser(user);

               if (isRemoved) {
                  response.sendRedirect("admin/dashboard.jsp");
               } else {
                  out.print("Error Occured");
               }
            }
         } else if (operation.equals("Update")) {

            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);

            int userId = Integer.parseInt(request.getParameter("userId").trim());
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String mobile = request.getParameter("mobile");
            int age = Integer.parseInt(request.getParameter("age"));
            int stockId = Integer.parseInt(request.getParameter("stockId"));
            int stateId = Integer.parseInt(request.getParameter("stateId"));
            int cityId = Integer.parseInt(request.getParameter("cityId"));
            String address = request.getParameter("address");

            System.out.println("UserId : " + userId);
            System.out.println("Name : " + name);
            System.out.println("Email : " + email);
            System.out.println("Mobile : " + mobile);
            System.out.println("Age : " + age);
            System.out.println("StockId : " + stockId);
            System.out.println("StateId : " + stateId);
            System.out.println("CityId : " + cityId);
            System.out.println("Address : " + address);

            User user = new User(userId, name, email, null, null, mobile, null, age, stockId, stateId, cityId, address, 2, 1);

            UserDao userDao = new UserDao();
            boolean isUpdated = userDao.updateUser(user);

            if (isUpdated) {
               out.print("<h1>Profile Updated</h1>");
               out.print("<h1><a href='logout'>Login Again</></h1>");
            } else {
               out.print("<h1>Error Occured</h1>");
            }
         }
      } catch (Exception e) {
         out.print("User Controller Exception : " + e.toString());
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
