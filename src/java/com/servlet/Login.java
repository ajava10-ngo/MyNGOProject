package com.servlet;

import com.dao.UserDao;
import com.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        try {

            System.out.println(request.getParameter("username"));
            System.out.println(request.getParameter("password"));

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            UserDao userDao = new UserDao();
            ResultSet rs = userDao.login(user);

            if (rs.next()) {

                if (Integer.parseInt(rs.getString("type")) == 1) {
                    response.sendRedirect("index.jsp");
                } else {

                    System.out.println(request.getParameter("username"));
                    System.out.println(request.getParameter("password"));
                    response.sendRedirect("index.jsp");
                }
            }

        } catch (IOException | SQLException e) {
            out.print("Login Servlet Exception : " + e.toString());
        }
    }
}
