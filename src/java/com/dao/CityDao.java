package com.dao;

import com.connection.DBConnection;
import com.model.City;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CityDao {

   private Connection con = null;

   public ArrayList<City> getAllCity(City cityObj) {
      try {
         ArrayList<City> al = new ArrayList<>();
         String sql = "select * from city where stateId = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setInt(1, cityObj.getStateId());

         ResultSet rs = ps.executeQuery();

         while (rs.next()) {
            int cityId = rs.getInt("cityId");
            String city = rs.getString("city");
            int stateId = rs.getInt("stateId");

            cityObj = new City(cityId, stateId, city);

            al.add(cityObj);

         }
         return al;
      } catch (Exception e) {
         System.err.println("CityDao Exception : " + e.toString());
      } finally {
         try {
            con.close();
         } catch (Exception e) {
            System.err.println("CityDao Exception : " + e.toString());
         }
      }
      return null;
   }
}
