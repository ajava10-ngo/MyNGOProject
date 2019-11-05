package com.dao;

import com.connection.DBConnection;
import com.model.Volunteer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VolunteerDao {

    private Connection con = null;

    public ResultSet getAllVolunteer() {

        try {
            String sql = "SELECT * FROM user inner join volunteer on user.userId = volunteer.userId;";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            return rs;
        } catch (SQLException e) {
            System.err.println("VolunteerDao Exception : " + e.toString());
        } finally {
            try {
            } catch (Exception e) {
                System.err.println("VolunteerDao Exception : " + e.toString());
            }
        }
        return null;
    }

    public boolean makeVolunteer(Volunteer volunteer) {
        try {
            String sql = "INSERT INTO volunteer (userId) VALUES (?);";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, volunteer.getUserId());
            
            int isInserted = ps.executeUpdate();
            
            if (isInserted > 0) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("VolunteerDao Exception : " + e.toString());
        }
        return false;
    }
    
    public boolean removeVolunteer(Volunteer volunteer) {
        try {
            String sql = "DELETE FROM `volunteer` WHERE volunteer = ?;";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, volunteer.getVolunteerId());
            
            int isInserted = ps.executeUpdate();
            
            if (isInserted > 0) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("VolunteerDao Exception : " + e.toString());
        }
        return false;
    }
}
