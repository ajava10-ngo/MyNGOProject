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

public class Login extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
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

         user = al.get(0);

         if (user != null) {
            if (user.getType() == 1) {
               HttpSession session = request.getSession();
               session.setAttribute("user", user);
               response.sendRedirect("admin/dashboard.jsp");
            } else {
               response.sendRedirect("donateNow.jsp");
            }
         } else {
            out.print("Invalid Username or Password ");
            response.sendRedirect("login.jsp");
         }

      } catch (Exception e) {
         out.print("Login Servlet Exception : " + e.toString());
      }
   }
}
