package com.dao;

import com.connection.DBConnection;
import com.model.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    public ResultSet getAllEvent() {
        try {
            String sql = "SELECT * FROM event;";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            return rs;
        } catch (Exception e) {
            System.err.println("EventDao Exception : " + e.toString());
        }
        return null;
    }

    public Event getSingleEvent(Event event) {
        try {
            String sql = "SELECT * FROM event WHERE eventId = ?; ";
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, event.getEventId());

            ResultSet rs = ps.executeQuery();
            rs.next();
            
            Event evnt = new Event();
            
            evnt.setEvent(rs.getString("event"));
            evnt.setDescription(rs.getString("description"));
            evnt.setDate(rs.getString("date"));
            evnt.setTime(rs.getString("time"));
            evnt.setVolunteerId(Integer.parseInt(rs.getString("volunteerId")));
            evnt.setLocation(rs.getString("location"));
            evnt.setSponsers(rs.getString("sponsers"));

            return evnt;
        } catch (Exception e) {
            System.err.println("EventDao Exception : " + e.toString());
        }
        return null;
    }
}
