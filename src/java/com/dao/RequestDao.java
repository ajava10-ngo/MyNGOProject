package com.dao;

import com.connection.DBConnection;
import com.model.Request;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RequestDao {

   private static Connection con = DBConnection.getConnection();

   public static ArrayList<Request> getAllRequest() {
      ArrayList<Request> al = new ArrayList<>();
      try {
         String sql = "select * from request";
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();

         while (rs.next()) {
            int reqId = rs.getInt("reqId");
            int userId = rs.getInt("userId");
            
            String reqType = rs.getString("reqType");
            String date = rs.getString("date");
            String time = rs.getString("time");
            String location = rs.getString("location");

            // TODO Here

         }
      } catch (Exception e) {
         System.err.println("RequestDao Exception : " + e.toString());
      } finally {
         try {
            con.close();
         } catch (Exception e) {
            System.err.println("RequestDao Exception : " + e.toString());
         }
      }
      return al;
   }
}
