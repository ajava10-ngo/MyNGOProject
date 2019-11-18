package com.servlet;

import com.dao.CityDao;
import com.dao.UserDao;
import com.model.City;
import com.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
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

            user = new User(name, email, username, password, mobile, gender, age, stockId, stateId, cityId, address);

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
            response.sendRedirect("emailVerification.jsp?email=" + email);
         } else if (operation.equals("SelectCity")) {
            int stateId = Integer.parseInt(request.getParameter("stateId").trim());
            City city = new City(stateId);

            CityDao cityDao = new CityDao();
            ArrayList<City> al = cityDao.getAllCity(city);

            String data = "";

            for (int i = 0; i < al.size(); i++) {
               city = al.get(i);
               System.out.println("City" + city.getCity());

               data += "<option value=''>" + city.getCity() + "</option>";
            }

//            while (rs.next()) {
//               data += "<option value='" + rs.getString("cityId") + "'>" + rs.getString("city") + "</option>";
//            }
            out.write(data.trim());
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
