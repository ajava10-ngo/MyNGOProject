package com.dao;

import com.connection.DBConnection;
import com.model.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StateDao {

    private Connection con = null;

    public ResultSet getAllState() {
        try {
            String sql = "select * from state;";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            return rs;
        } catch (SQLException e) {
            System.err.println("StateDao Exception : " + e.toString());
        } finally {
            try {
//                con.close();
            } catch (Exception e) {
                System.err.println("StateDao Exception : " + e.toString());
            }
        }
        return null;
    }
}
