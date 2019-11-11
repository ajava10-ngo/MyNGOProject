package com.model;

public class Volunteer {

    private int volunteerId;
    private int userId;
    private String post;
    private String idCardNo;

    public Volunteer() {
    }

    public Volunteer(int userId) {
       this.userId = userId;
    }
    
   public Volunteer(int userId, String idCardNo) {
      this.userId = userId;
      this.idCardNo = idCardNo;
   }

   public int getVolunteerId() {
      return volunteerId;
   }

   public void setVolunteerId(int volunteerId) {
      this.volunteerId = volunteerId;
   }

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   public String getPost() {
      return post;
   }

   public void setPost(String post) {
      this.post = post;
   }

   public String getIdCardNo() {
      return idCardNo;
   }

   public void setIdCardNo(String idCardNo) {
      this.idCardNo = idCardNo;
   }
}
