package com.servlet;

import com.dao.UserDao;
import com.model.EmailVerification;
import com.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Register extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

      PrintWriter out = response.getWriter();

      User user;
      UserDao userDao;

      try {
         String operation = request.getParameter("operation");
//         out.print(operation);
         if (operation.equals("Register")) {

            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String mobile = request.getParameter("mobile");
            String gender = request.getParameter("gender");
            int age = Integer.parseInt(request.getParameter("age"));
            int stockId = Integer.parseInt(request.getParameter("stockId"));
            int stateId = Integer.parseInt(request.getParameter("stateId"));
            int cityId = Integer.parseInt(request.getParameter("cityId"));
            String address = request.getParameter("address");

            out.print(name + " : " + email + " : " + username + " : " + password + " : " + mobile + " : " + age + " : " + stockId + " : " + stateId + " : " + cityId + " : " + address);

            user = new User(age, cityId, stateId, age, stockId, name, email, username, password, mobile, gender, address);

            userDao = new UserDao();
            boolean isRegistered = userDao.register(user);

            if (isRegistered == true) {
               response.sendRedirect("emailVerification.jsp?email=" + email);
            }

         } else if (operation.equals("Verify")) {
            HttpSession session = request.getSession();
            String verification = (String) session.getAttribute("generatedOtp");
            verification = verification.trim();

            String enteredOtp = request.getParameter("otp").trim();
            String email = request.getParameter("email").trim();

            System.out.println("Operation : " + operation);
            System.out.println("GeneratedOtp : " + verification);
            System.out.println("EnteredOtp : " + enteredOtp);
            System.out.println("Email : " + email);

            if (verification.equals(enteredOtp)) {

               user = new User();
               user.setEmail(email);

               userDao = new UserDao();
               boolean isChanged = userDao.verifyUser(user);

               if (isChanged) {
                  out.print("Success");
               } else {
                  out.print("Status Not Changed...");
               }
            } else {
               out.print("OTP is incorrect...");
            }

         } else if (operation.equals("ResendOTP")) {
            String email = request.getParameter("email");
         }
      } catch (Exception e) {
         out.print("Register Exception : " + e.toString());
      }
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      processRequest(request, response);
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      processRequest(request, response);
   }
}
