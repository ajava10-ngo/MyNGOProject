package com.dao;

import com.connection.DBConnection;
import com.model.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StateDao {

   private Connection con = null;

   public ArrayList<State> getAllState() {
      try {
         ArrayList<State> al = new ArrayList<>();
         State stateObj;
         String sql = "select * from state;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ResultSet rs = ps.executeQuery();
         while (rs.next()) {
            int stateId = rs.getInt("stateId");
            String state = rs.getString("state");

            stateObj = new State(stateId, state);

            al.add(stateObj);
         }

         return al;
      } catch (SQLException e) {
         System.err.println("StateDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("StateDao Exception : " + e.toString());
         }
      }
      return null;
   }
}
