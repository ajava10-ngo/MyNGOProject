package com.servlet;

import com.dao.UserDao;
import com.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

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

               boolean isRemoved = userDao.removeUser(user);

               if (isRemoved) {
                  response.sendRedirect("admin/dashboard.jsp");
               } else {
                  out.print("Error Occured");
               }
            }
         }

      } catch (Exception e) {
         out.print("User Controller Exception : " + e.toString());
      }
   }
}
