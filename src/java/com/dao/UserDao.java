package com.dao;

import com.connection.DBConnection;
import com.model.City;
import com.model.State;
import com.model.Stock;
import com.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {

   private Connection con = null;

   private static Connection con1 = null;

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
            con.close();
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
            con.close();
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return false;
   }

   public ArrayList<User> login(User user) {

      try {
         ArrayList<User> al = new ArrayList<>();
         String sql = "SELECT * FROM user, state, city, stock WHERE user.stateId = state.stateId AND user.cityId = city.cityId AND user.stockId = stock.stockId AND user.username = ? AND user.password = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setString(1, user.getUsername());
         ps.setString(2, user.getPassword());

         ResultSet rs = ps.executeQuery();

         if (rs.next()) {

            int userId = rs.getInt("userId");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String mobile = rs.getString("mobile");
            String gender = rs.getString("gender");
            int age = rs.getInt("age");
            int stockId = rs.getInt("stockId");
            int stateId = rs.getInt("stateId");
            int cityId = rs.getInt("cityId");
            String address = rs.getString("address");
            int type = rs.getInt("type");
            int verified = rs.getInt("verified");
            String bloodGroup = rs.getString("bloodGroup");

            String state = rs.getString("state");
            String city = rs.getString("city");

            Stock stock = new Stock(stockId, 0, bloodGroup);
            State stateObj = new State(state);
            City cityObj = new City(city);

            user = new User(userId, name, email, username, password, mobile, gender, age, stockId, stateId, cityId, address, type, verified, null, stateObj, cityObj, null, null, stock);
            al.add(user);
         }
         return al;
      } catch (SQLException e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
            con.close();
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
            con.close();
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return false;
   }

   public ArrayList<User> getAllUser() {
      try {
         ArrayList<User> al = new ArrayList<>();

         String sql = "SELECT * FROM user where type = 2 AND verified = 1;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ResultSet rs = ps.executeQuery();
         while (rs.next()) {

            int userId = rs.getInt("userId");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String mobile = rs.getString("mobile");
            String gender = rs.getString("gender");
            int age = rs.getInt("age");
            int stockId = rs.getInt("stockId");
            int stateId = rs.getInt("stateId");
            int cityId = rs.getInt("cityId");
            String address = rs.getString("address");
            int type = rs.getInt("type");
            int verified = rs.getInt("verified");

            User user = new User(userId, name, email, username, password, mobile, gender, age, stockId, stateId, cityId, address, type, verified);
            al.add(user);
         }

         return al;
      } catch (SQLException e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
            con.close();
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return null;
   }

   public ArrayList<User> getUserNotInVolunteer() {

      try {
         ArrayList<User> al = new ArrayList<>();
         String sql = "SELECT * FROM user, state, city WHERE NOT EXISTS(SELECT * FROM volunteer WHERE (user.userId = volunteer.userId)) AND user.verified  = 1 AND user.type = 2 AND user.cityId = city.cityId AND user.stateId = state.stateId;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ResultSet rs = ps.executeQuery();
         while (rs.next()) {

            int userId = rs.getInt("userId");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String mobile = rs.getString("mobile");
            String gender = rs.getString("gender");
            int age = rs.getInt("age");
            int stockId = rs.getInt("stockId");
            int stateId = rs.getInt("stateId");
            int cityId = rs.getInt("cityId");
            String address = rs.getString("address");
            int type = rs.getInt("type");
            int verified = rs.getInt("verified");
            String state = rs.getString("state");
            String city = rs.getString("city");

            State stateObj = new State(state);
            City cityObj = new City(city);

            User user = new User(userId, name, email, username, password, mobile, gender, age, stockId, stateId, cityId, address, type, verified, null, stateObj, cityObj, null, null, null);
            al.add(user);
         }

         return al;
      } catch (SQLException e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
            con.close();
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
      } finally {
         try {
            con.close();
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return false;
   }

   public boolean updateUser(User user) {
      try {
         String sql = "UPDATE user SET NAME = ?, email = ?, mobile = ?, age = ?, stockId = ?, stateId = ?, cityId = ?, address = ? WHERE userId = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setString(1, user.getName());
         ps.setString(2, user.getEmail());
         ps.setString(3, user.getMobile());
         ps.setInt(4, user.getAge());
         ps.setInt(5, user.getStockId());
         ps.setInt(6, user.getStateId());
         ps.setInt(7, user.getCityId());
         ps.setString(8, user.getAddress());
         ps.setInt(9, user.getUserId());

         int isRemoved = ps.executeUpdate();

         if (isRemoved > 0) {
            return true;
         }
      } catch (Exception e) {
         System.err.println("UserDao Exception : " + e.toString());
      } finally {
         try {
            con.close();
         } catch (Exception e) {
            System.err.println("UserDao Exception : " + e.toString());
         }
      }
      return false;
   }

//   public ArrayList<User> getSingleUser(User user) {
//      try {
//         ArrayList<User> al = new ArrayList<>();
//
//         String sql = "SELECT * FROM user, stock, city, state WHERE user.stateId = "
//                 + "state.stateId AND user.cityId = city.cityId AND user.stockId = "
//                 + "stock.stockId AND user.userId = ?;";
//         con = DBConnection.getConnection();
//         PreparedStatement ps = con.prepareStatement(sql);
//
//         ps.setInt(1, user.getUserId());
//
//         ResultSet rs = ps.executeQuery();
//         while (rs.next()) {
//            // User
//            int userId = rs.getInt("userId");
//            String name = rs.getString("name");
//            String email = rs.getString("email");
//            String username = rs.getString("username");
//            String password = rs.getString("password");
//            String mobile = rs.getString("mobile");
//            String gender = rs.getString("gender");
//            int age = rs.getInt("age");
//            String address = rs.getString("address");
//            int type = rs.getInt("type");
//            int verified = rs.getInt("verified");
//
//            // Stock
//            int stockId = rs.getInt("stockId");
//            String bloodGroup = rs.getString("bloodGroup");
//
//            // State
//            int stateId = rs.getInt("stateId");
//            String state = rs.getString("state");
//
//            // City
//            int cityId = rs.getInt("cityId");
//            String city = rs.getString("city");
//
//            Stock stock = new Stock(0, bloodGroup);
//            State stateObj = new State(state);
//            City cityObj = new City(city);
//            user = new User(userId, name, email, username, password, mobile, gender, age, stockId, stateId, cityId, address, type, verified, null, stateObj, cityObj, null, null, stock);
//            al.add(user);
//         }
//
//         return al;
//      } catch (SQLException e) {
//         System.err.println("UserDao Exception : " + e.toString());
//      } finally {
//         try {
//            con.close();
//         } catch (Exception e) {
//            System.err.println("UserDao Exception : " + e.toString());
//         }
//      }
//      return null;
//   }
}
