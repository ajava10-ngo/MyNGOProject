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

    public boolean updateEvent() {
        // TODO UPDATE CODE
        return false;
    }

    public boolean deleteEvent() {
        // TODO DELETE CODE
        return false;
    }

    public ResultSet getAllEvents() {
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

}
