package com.servlet;

import com.dao.UserDao;
import com.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      PrintWriter out = response.getWriter();
      try {

         String username = request.getParameter("username");
         String password = request.getParameter("password");

         User user = new User();
         user.setUsername(username);
         user.setPassword(password);

         UserDao userDao = new UserDao();
         ArrayList<User> al = userDao.login(user);

         if (!al.isEmpty()) {
            user = al.get(0);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            System.out.println("LoginController Email : " + user.getEmail());
            if (user != null) {
               if (user.getType() == 1) {
                  out.print("Admin");
               } else if (user.getVerified() == 1) {
                  out.print("User");
               } else {
                  out.print("Verify");
               }
            }
         } else {
            out.println("Invalid Username or Password");
         }
      } catch (Exception e) {
         out.print("Login Servlet Exception : " + e.toString());
      }
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      processRequest(request, response);
   }
}
