package com.model;

public class Request {

   private int reqId;
   private int userId;
   private int reqType;
   private String reqFor;
   private String date;
   private String time;
   private String location;
   private String description;

   public Request() {
   }

   public Request(int userId, int reqType, String reqFor, String date, String time, String location, String description) {
      this.userId = userId;
      this.reqType = reqType;
      this.reqFor = reqFor;
      this.date = date;
      this.time = time;
      this.location = location;
      this.description = description;
   }

   public int getReqId() {
      return reqId;
   }

   public void setReqId(int reqId) {
      this.reqId = reqId;
   }

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   public int getReqType() {
      return reqType;
   }

   public void setReqType(int reqType) {
      this.reqType = reqType;
   }

   public String getReqFor() {
      return reqFor;
   }

   public void setReqFor(String reqFor) {
      this.reqFor = reqFor;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public String getTime() {
      return time;
   }

   public void setTime(String time) {
      this.time = time;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}
