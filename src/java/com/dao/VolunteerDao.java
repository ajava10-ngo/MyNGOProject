package com.dao;

import com.connection.DBConnection;
import com.model.City;
import com.model.State;
import com.model.User;
import com.model.Volunteer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VolunteerDao {

   private Connection con = null;

   public ArrayList<User> getAllVolunteer() {

      try {
         ArrayList alList = new ArrayList<>();
         ArrayList al = new ArrayList();
         
         String sql = "SELECT * FROM user, volunteer, city, state WHERE user.userId = volunteer.userId AND user.cityId = city.cityId AND user.stateId = state.stateId;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ResultSet rs = ps.executeQuery();
         
         while(rs.next()) {
            
            int volunteerId = rs.getInt("volunteerId");
            int userId = rs.getInt("userId");
            String post = rs.getString("post");
            String idCardNo = rs.getString("idCardNo");
            
            String name = rs.getString("name");
            String email = rs.getString("email");
            String username = rs.getString("username");
            String mobile = rs.getString("mobile");
            String gender = rs.getString("gender");
            int age = rs.getInt("age");
            String address = rs.getString("address");
            String state = rs.getString("state");
            String city = rs.getString("city");
            
            Volunteer volunteer = new Volunteer(volunteerId, userId, post, idCardNo);
            State stateObj = new State(state);
            City cityObj = new City(city);
            
            User user = new User(userId, age, name, email, username, mobile, gender, address, volunteer, stateObj, cityObj);
            
            alList.add(user);
            
         }

         return alList;
      } catch (SQLException e) {
         System.err.println("VolunteerDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("VolunteerDao Exception : " + e.toString());
         }
      }
      return null;
   } 
   
   /*
       public static ArrayList<Volunteer> getAllVolunteer() {

      ArrayList<Volunteer> al = newArrayList<>();
      try {
         String sql = "SELECT * FROM user inner join volunteer on user.userId = volunteer.userId;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ResultSet rs = ps.executeQuery();
         while(rs.next())
         {
          int id = rs.getInt("volunteerId");
          int userid = rs.getInt("userId");
           String post = rs.getString("post");
           String idCardNo = rs.getString("idCardNo");
        
           Volunteer v = new Volunteer(id,userid,post,idCardNo);
           al.add(v);
         }
         
      } catch (SQLException e) {
         System.err.println("VolunteerDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("VolunteerDao Exception : " + e.toString());
         }
      }
      return al;
   }
   
   */

   public ResultSet getSingleVolunteer(Volunteer volunteer) {

      try {
         String sql = "SELECT * FROM USER, volunteer, profile, state, city WHERE"
                 + " user.userId = volunteer.userId AND profile.volunteerId"
                 + " = volunteer.volunteerId AND state.stateId = user.stateId"
                 + " AND city.cityId = user.cityId AND volunteer.volunteerId = ?;";

         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setInt(1, volunteer.getVolunteerId());

         ResultSet rs = ps.executeQuery();

         return rs;
      } catch (SQLException e) {
         System.err.println("VolunteerDao Exception : " + e.toString());
      } finally {
         try {
         } catch (Exception e) {
            System.err.println("VolunteerDao Exception : " + e.toString());
         }
      }
      return null;
   }

   public boolean insertVolunteer(Volunteer volunteer) {
      try {
         String sql = "INSERT INTO volunteer (userId, idCardNo) VALUES (?, ?);";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setInt(1, volunteer.getUserId());
         ps.setString(2, volunteer.getIdCardNo());

         int isInserted = ps.executeUpdate();

         if (isInserted > 0) {
            return true;
         }
      } catch (Exception e) {
         System.err.println("VolunteerDao Exception : " + e.toString());
      }
      return false;
   }

   public boolean removeVolunteer(Volunteer volunteer) {
      try {
         String sql = "DELETE FROM volunteer WHERE volunteerId = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setInt(1, volunteer.getVolunteerId());

         int isInserted = ps.executeUpdate();

         if (isInserted > 0) {
            return true;
         }
      } catch (Exception e) {
         System.err.println("VolunteerDao Exception : " + e.toString());
      }
      return false;
   }
}
