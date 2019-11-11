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

    public boolean insertVolunteer(Volunteer volunteer) {
        try {
            String sql = "INSERT INTO volunteer (userId, idCardNo) VALUES (?, ?);";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, volunteer.getUserId());
            ps.setString(2, volunteer.getIdCardNo());
            
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
            String sql = "DELETE FROM volunteer WHERE volunteerId = ?;";
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
