package com.model;

public class User {

   private int userId, age, cityId, stateId, type, stockId = 0;
   private String name, email, username, password, mobile, gender, address;
   private boolean verified = false;
   private Volunteer volunteer;
   private State state;
   private City city;

   public User() {}

   public User(int userId, int age, String name, String email, String username, String mobile, String gender, String address, Volunteer volunteer, State state, City city) {
      // For iterate all volunteer details 
      this.userId = userId;
      this.age = age;
      this.name = name;
      this.email = email;
      this.username = username;
      this.mobile = mobile;
      this.gender = gender;
      this.address = address;
      this.volunteer = volunteer;
      this.state = state;
      this.city = city;
   }

   public User(int userId, int age, int cityId, int stateId, int type, int stockId, String name, String email, String username, String password, String mobile, String gender, String address) {
      this.userId = userId;
      this.age = age;
      this.cityId = cityId;
      this.stateId = stateId;
      this.type = type;
      this.stockId = stockId;
      this.name = name;
      this.email = email;
      this.username = username;
      this.password = password;
      this.mobile = mobile;
      this.gender = gender;
      this.address = address;
   }

   public User(int age, int cityId, int stateId, int type, int stockId, String name, String email, String username, String password, String mobile, String gender, String address) {
      this.age = age;
      this.cityId = cityId;
      this.stateId = stateId;
      this.type = type;
      this.stockId = stockId;
      this.name = name;
      this.email = email;
      this.username = username;
      this.password = password;
      this.mobile = mobile;
      this.gender = gender;
      this.address = address;
   }

   public Volunteer getVolunteer() {
      return volunteer;
   }

   public void setVolunteer(Volunteer volunteer) {
      this.volunteer = volunteer;
   }

   public State getState() {
      return state;
   }

   public void setState(State state) {
      this.state = state;
   }

   public City getCity() {
      return city;
   }

   public void setCity(City city) {
      this.city = city;
   }

   public boolean isVerified() {
      return verified;
   }

   public void setVerified(boolean verified) {
      this.verified = verified;
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

   public int getStockId() {
      return stockId;
   }

   public void setStockId(int stockId) {
      this.stockId = stockId;
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

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}
