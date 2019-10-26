package com.dao;

import com.connection.DBConnection;
import com.model.City;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityDao {
    
    private Connection con = null;

    public ResultSet getAllCity(int stateId) {
        try {
            String sql = "select * from city where stateId = ?;";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, stateId);

            ResultSet rs = ps.executeQuery();

            return rs;
        } catch (SQLException e) {
            System.err.println("CityDao Exception : " + e.toString());
        } finally {
        }
        return null;
    }
    
}
