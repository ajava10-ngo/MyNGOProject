package com.dao;

import com.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDao {
    private Connection con = null;
    public ResultSet getAllStock() {
        
        try {
            String sql = "select * from stock where stockId < 9;";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.err.println("StockDao Exception : " + e.toString());
        }
        return null;
    }
}