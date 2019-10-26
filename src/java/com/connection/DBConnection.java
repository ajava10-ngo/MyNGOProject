package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static Connection con = null;

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava10_ngo", "root", "");
            return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Exception : " + e.toString());
        } finally {
            try {
            } catch (Exception e) {
                System.err.println("Connection Closing Exception : " + e.toString());
            }
        }
        return null;
    }
}
