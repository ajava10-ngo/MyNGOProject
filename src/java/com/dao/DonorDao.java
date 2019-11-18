package com.dao;

import com.connection.DBConnection;
import com.model.City;
import com.model.Donor;
import com.model.State;
import com.model.Stock;
import com.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

   public ArrayList<User> getAllDonor() {
      try {
         ArrayList<User> al = new ArrayList<>();
         String sql = "SELECT * FROM ((donor INNER JOIN USER ON donor.userId = user.userId) INNER JOIN stock ON stock.stockId = donor.donorId);";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();

         while (rs.next()) {
            
            // Donor
            int donorId = rs.getInt("donorId");
            String date = rs.getString("date");
            
            // Stock
            int stockId = rs.getInt("stockId");
            int available = rs.getInt("available");
            String bloodGroup = rs.getString("bloodGroup");
            
            // User
            int userId = rs.getInt("userId");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String mobile = rs.getString("mobile");
            String gender = rs.getString("gender");
            int age = rs.getInt("age");
            int stateId = rs.getInt("stateId");
            int cityId = rs.getInt("cityId");
            String address = rs.getString("address");
            int type = rs.getInt("type");
            int verified = rs.getInt("verified");
            
            Donor donor = new Donor(donorId, userId, stockId, date);
            Stock stock = new Stock(stockId, available, bloodGroup);
            User user = new User(userId, name, email, username, password, mobile, gender, age, stockId, stateId, cityId, address, type, verified, null, null, null, null, donor, stock);
            al.add(user);
         }

         return al;
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
