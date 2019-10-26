package com.servlet;

import com.dao.UserDao;
import com.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        try {
            
            System.out.println(request.getParameter("name"));
            System.out.println(request.getParameter("email"));
            System.out.println(request.getParameter("username"));
            System.out.println(request.getParameter("password"));
            System.out.println(request.getParameter("mobile"));
            System.out.println(request.getParameter("gender"));
            System.out.println(Integer.parseInt(request.getParameter("age")));
            System.out.println(Integer.parseInt(request.getParameter("stockId")));
            System.out.println(Integer.parseInt(request.getParameter("stateId")));
            System.out.println(Integer.parseInt(request.getParameter("cityId")));
            System.out.println(request.getParameter("address"));
            
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
            
            User user = new User(age, cityId, stateId, stockId, name, email, username, password, mobile, gender, address);
            
            UserDao userDao = new UserDao();
            boolean isRegistered = userDao.register(user);
            
            if (isRegistered == true) {
                response.sendRedirect("login.jsp");
            }
            
        } catch (IOException | NumberFormatException e) {
            out.print("Register Servelet Exception" + e.toString());
        }
    }
}
