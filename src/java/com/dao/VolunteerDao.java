package com.dao;

import com.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VolunteerDao {

    private Connection con = null;

    public ResultSet selectVolunteer() {

        try {
            String sql = "SELECT * FROM user inner join volunteer on user.userId = volunteer.userId;";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            return rs;
        } catch (SQLException e) {
            System.err.println("UserDao Exception : " + e.toString());
        } finally {
            try {
            } catch (Exception e) {
                System.err.println("UserDao Exception : " + e.toString());
            }
        }
        return null;
    }
}
