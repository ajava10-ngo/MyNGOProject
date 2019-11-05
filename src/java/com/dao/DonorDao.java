package com.dao;

import com.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DonorDao {
    
    private Connection con = null;
    
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
    
}
