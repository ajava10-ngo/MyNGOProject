package com.dao;

import com.connection.DBConnection;
import com.model.Stock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StockDao {

   private Connection con = null;

   public ArrayList<Stock> getAllStock() {

      ArrayList<Stock> al = new ArrayList<>();

      try {
         String sql = "select * from stock where stockId < 9;";
         con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();

         while (rs.next()) {
            int stockId = rs.getInt("stockId");
            int available = rs.getInt("available");
            String bloodGroup = rs.getString("bloodGroup");
            Stock stock = new Stock(stockId, available, bloodGroup);
            al.add(stock);
         }

         return al;
      } catch (SQLException e) {
         System.err.println("StockDao Exception : " + e.toString());
      }
      return null;
   }
}
