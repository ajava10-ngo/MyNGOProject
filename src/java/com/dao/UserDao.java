package com.dao;

import com.connection.DBConnection;
import com.model.Stock;
import com.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

   private Connection con = null;

   public boolean register(User user) {

      try {
         String sql = "insert into user(name, email, username, password, mobile, gender, age, stockId, stateId, cityId, address) values(?,?,?,?,?,?,?,?,?,?,?);";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setString(1, user.getName());
         ps.setString(2, user.getEmail());
         ps.setString(3, user.getUsername());
         ps.setString(4, user.getPassword());
         ps.setString(5, user.getMobile());
         ps.setString(6, user.getGender());
         ps.setInt(7, user.getAge());
         ps.setInt(8, user.getStockId());
         ps.setInt(9, user.getStateId());
         ps.setInt(10, user.getCityId());
         ps.setString(11, user.getAddress());

         int isRegistered = ps.executeUpdate();
         return isRegistered > 0;
      } catch (SQLException e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return false;
   }

   public boolean verifyUser(User user) {

      try {
         String sql = "UPDATE user SET verified = 1 WHERE email = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setString(1, user.getEmail());

         int isRegistered = ps.executeUpdate();
         return isRegistered > 0;

      } catch (SQLException e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return false;
   }

   public ResultSet login(User user) {

      try {
         String sql = "select * from user where username = ? and password = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setString(1, user.getUsername());
         ps.setString(2, user.getPassword());

         ResultSet rs = ps.executeQuery();

         return rs;
      } catch (SQLException e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return null;
   }

   public boolean updateBloodGroup(User user) {
      try {
         String sql = "UPDATE user SET stockId = ? WHERE userID = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setInt(1, user.getStockId());
         ps.setInt(2, user.getUserId());

         int isUpdated = ps.executeUpdate();

         return isUpdated > 0;

      } catch (SQLException e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return false;
   }

   public ResultSet getAllUser() {
      try {
         String sql = "SELECT * FROM user where type = 2 AND verified = 1;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ResultSet rs = ps.executeQuery();

         return rs;
      } catch (SQLException e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return null;
   }

   public ResultSet getUserNotInVolunteer() {

      try {
         String sql = "SELECT * FROM USER WHERE NOT EXISTS(SELECT * FROM volunteer WHERE (user.userId = volunteer.userId)) AND user.verified  = 1 AND user.type = 2;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ResultSet rs = ps.executeQuery();

         return rs;
      } catch (SQLException e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return null;
   }

   public boolean inactiveUser(User user) {
      try {
         String sql = "UPDATE user SET verified = 0 WHERE userId = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setInt(1, user.getUserId());

         int isRemoved = ps.executeUpdate();

         if (isRemoved > 0) {
            return true;
         }
      } catch (Exception e) {
         System.err.println("UserDao Exception : " + e.toString());
      }
      return false;
   }

}
