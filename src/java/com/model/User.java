package com.model;

public class User {

   private int userId, age, cityId, stateId, type, stockId;
   private String name, email, username, password, mobile, gender, address;
   boolean status = false;

   public User() {
   }

   public User(int userId, int age, int cityId, int stateId, int stockId, String name, String email, String username, String password, String mobile, String gender, String bloodGroup, String address) {
      this.userId = userId;
      this.age = age;
      this.cityId = cityId;
      this.stateId = stateId;
      this.stockId = stockId;
      this.name = name;
      this.email = email;
      this.username = username;
      this.password = password;
      this.mobile = mobile;
      this.gender = gender;
      this.address = address;
   }

   public User(int age, int cityId, int stateId, int stockId, String name, String email, String username, String password, String mobile, String gender, String address) {
      this.age = age;
      this.cityId = cityId;
      this.stateId = stateId;
      this.stockId = stockId;
      this.name = name;
      this.email = email;
      this.username = username;
      this.password = password;
      this.mobile = mobile;
      this.gender = gender;
      this.address = address;
   }

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getCityId() {
      return cityId;
   }

   public void setCityId(int cityId) {
      this.cityId = cityId;
   }

   public int getStateId() {
      return stateId;
   }

   public void setStateId(int stateId) {
      this.stateId = stateId;
   }

   public int getType() {
      return type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getMobile() {
      return mobile;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public int getStockId() {
      return stockId;
   }

   public void setStockId(int stockId) {
      this.stockId = stockId;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public boolean isStatus() {
      return status;
   }

   public void setStatus(boolean status) {
      this.status = status;
   }
   
   public boolean getStatus() {
      return status;
   }
   
   @Override
   public String toString() {
      return "User{" + "userId=" + userId + ", age=" + age + ", cityId=" + cityId + ", stateId=" + stateId + ", type=" + type + ", name=" + name + ", email=" + email + ", username=" + username + ", password=" + password + ", mobile=" + mobile + ", gender=" + gender + ", stockId=" + stockId + ", address=" + address + '}';
   }
}
