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
            ResultSet rs = userDao.login(user);
            
            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            if (rs.next()) {
                if (Integer.parseInt(rs.getString("type")) == 1) {
                    response.sendRedirect("admin/dashboard.jsp");
                } else {
                    response.sendRedirect("index.jsp");
                }
            } else {
                out.print("Invalid Username or Password ");
                response.sendRedirect("login.jsp");
            }

        } catch (IOException | SQLException e) {
            out.print("Login Servlet Exception : " + e.toString());
        }
    }
}
