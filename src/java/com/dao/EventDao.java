package com.dao;

import com.connection.DBConnection;
import com.model.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EventDao {

   private Connection con = null;

   public boolean insertEvent(Event event) {
      try {
         String sql = "INSERT INTO event(event, description, date, time, volunteerId, location, sponsers) VALUES (?,?,?,?,?,?,?);";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setString(1, event.getEvent());
         ps.setString(2, event.getDescription());
         ps.setString(3, event.getDate());
         ps.setString(4, event.getTime());
         ps.setInt(5, event.getVolunteerId());
         ps.setString(6, event.getLocation());
         ps.setString(7, event.getSponsers());

         int isInserted = ps.executeUpdate();

         if (isInserted > 0) {
            return true;
         }
      } catch (Exception e) {
         System.err.println("EventDao Exception : " + e.toString());
      }
      return false;
   }

   public boolean updateEvent(Event event) {
      try {
         String sql = "UPDATE event SET event=?,description=?,date=?,time=?,volunteerId=?,location=?,sponsers=? WHERE eventId = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setString(1, event.getEvent());
         ps.setString(2, event.getDescription());
         ps.setString(3, event.getDate());
         ps.setString(4, event.getTime());
         ps.setInt(5, event.getVolunteerId());
         ps.setString(6, event.getLocation());
         ps.setString(7, event.getSponsers());
         ps.setInt(8, event.getEventId());

         int isInserted = ps.executeUpdate();

         if (isInserted > 0) {
            return true;
         }
      } catch (Exception e) {
         System.err.println("EventDao Exception : " + e.toString());
      }
      return false;
   }

   public boolean removeEvent(Event event) {
      try {
         String sql = "delete from event where eventId = ?;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setInt(1, event.getEventId());

         int isDeleted = ps.executeUpdate();

         if (isDeleted > 0) {
            return true;
         }
      } catch (Exception e) {
         System.err.println("EventDao Exception : " + e.toString());
      }
      return false;
   }

   public ArrayList<Event> getAllEvent() {
      try {
         ArrayList<Event> al = new ArrayList<>();
         String sql = "SELECT * FROM event;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ResultSet rs = ps.executeQuery();

         while (rs.next()) {

            int eventId = rs.getInt("eventId");
            String event = rs.getString("event");
            String description = rs.getString("description");
            String date = rs.getString("date");
            String time = rs.getString("time");
            int volunteerId = rs.getInt("volunteerId");
            String location = rs.getString("location");
            String sponsers = rs.getString("sponsers");

            Event eventObj = new Event(eventId, event, description, date, time, volunteerId, location, sponsers);

            al.add(eventObj);
         }

         return al;
      } catch (Exception e) {
         System.err.println("EventDao Exception : " + e.toString());
      }
      return null;
   }

   public ArrayList<Event> getSingleEvent(Event eventObj) {
      try {
         ArrayList<Event> al = new ArrayList<>();
         String sql = "SELECT * FROM event WHERE eventId = ?; ";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);

         ps.setInt(1, eventObj.getEventId());

         ResultSet rs = ps.executeQuery();
         if (rs.next()) {
            int eventId = rs.getInt("eventId");
            String event = rs.getString("event");
            String description = rs.getString("description");
            String date = rs.getString("date");
            String time = rs.getString("time");
            int volunteerId = rs.getInt("volunteerId");
            String location = rs.getString("location");
            String sponsers = rs.getString("sponsers");

            eventObj = new Event(eventId, event, description, date, time, volunteerId, location, sponsers);

            al.add(eventObj);
         }

         return al;
      } catch (Exception e) {
         System.err.println("EventDao Exception : " + e.toString());
      }
      return null;
   }
}
