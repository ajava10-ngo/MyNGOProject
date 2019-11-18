package com.model;

public class User {

   // User Data Members
   private int userId;
   private String name, email, username, password, mobile, gender;
   private int age, stockId, stateId, cityId;
   private String address;
   private int type, verified;
   
   // Model Objects
   private Volunteer volunteer;
   private State state;
   private City city;
   private Profile profile;
   private Donor donor;
   private Stock stock;

   public User() {
   }

   public User(int userId, String name, String email, String username, String password, String mobile, String gender, int age, int stockId, int stateId, int cityId, String address, int type, int verified) {

      this.userId = userId;
      this.name = name;
      this.email = email;
      this.username = username;
      this.password = password;
      this.mobile = mobile;
      this.gender = gender;
      this.age = age;
      this.stockId = stockId;
      this.stateId = stateId;
      this.cityId = cityId;
      this.address = address;
      this.type = type;
      this.verified = verified;
   }

   public User(int userId, String name, String email, String username, String password, String mobile, String gender, int age, int stockId, int stateId, int cityId, String address, int type, int verified, Volunteer volunteer, State state, City city, Profile profile, Donor donor, Stock stock) {
      // for read all record
      this.userId = userId;
      this.name = name;
      this.email = email;
      this.username = username;
      this.password = password;
      this.mobile = mobile;
      this.gender = gender;
      this.age = age;
      this.stockId = stockId;
      this.stateId = stateId;
      this.cityId = cityId;
      this.address = address;
      this.type = type;
      this.verified = verified;
      this.volunteer = volunteer;
      this.state = state;
      this.city = city;
      this.profile = profile;
      this.donor = donor;
      this.stock = stock;
   }

   public User(String name, String email, String username, String password, String mobile, String gender, int age, int stockId, int stateId, int cityId, String address) {
      // for registration
      this.name = name;
      this.email = email;
      this.username = username;
      this.password = password;
      this.mobile = mobile;
      this.gender = gender;
      this.age = age;
      this.stockId = stockId;
      this.stateId = stateId;
      this.cityId = cityId;
      this.address = address;
   }

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
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

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getStockId() {
      return stockId;
   }

   public void setStockId(int stockId) {
      this.stockId = stockId;
   }

   public int getStateId() {
      return stateId;
   }

   public void setStateId(int stateId) {
      this.stateId = stateId;
   }

   public int getCityId() {
      return cityId;
   }

   public void setCityId(int cityId) {
      this.cityId = cityId;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public int getType() {
      return type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getVerified() {
      return verified;
   }

   public void setVerified(int verified) {
      this.verified = verified;
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

   public Profile getProfile() {
      return profile;
   }

   public void setProfile(Profile profile) {
      this.profile = profile;
   }

   public Donor getDonor() {
      return donor;
   }

   public void setDonor(Donor donor) {
      this.donor = donor;
   }

   public Stock getStock() {
      return stock;
   }

   public void setStock(Stock stock) {
      this.stock = stock;
   }
}
