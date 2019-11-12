package com.dao;

import com.connection.DBConnection;
import com.model.Donor;
import com.model.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DonorDao {

    private Connection con = null;

    public boolean insertDonor(Donor donor) {
        try {
            String sql = "INSERT INTO donor(userId, stockId, date) VALUES (?,?,?);";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, donor.getUserId());
            ps.setInt(2, donor.getStockId());
            ps.setString(3, donor.getDate());
            
            int isInserted = ps.executeUpdate();
            
            if (isInserted > 0) {
                return true;
            }
            
            return true;
        } catch (Exception e) {
            System.err.println("DonorDao Exception : " + e.toString());
        }
        return false;
    }

    public ResultSet getAllDonor() {
        try {
            String sql = "SELECT * FROM ((donor INNER JOIN user ON donor.userId = user.userId) INNER JOIN stock on stock.stockId = donor.donorId);";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            System.err.println("DonorDao Exception : " + e.toString());
        }
         return null;
    }
        
    
     public boolean removeDonor(Donor donor) {
        try {
            String sql = "delete from donor where donorId = ?;";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, donor.getDonorId());

            int isDeleted = ps.executeUpdate();

            if (isDeleted > 0) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("DonorDao Exception : " + e.toString());
        }
      return false;
     }
}