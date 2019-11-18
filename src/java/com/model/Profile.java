package com.model;

public class Profile {

   private int profileId;
   private String qualification, passingYear, profession, image;
   private int volunteerId;

   public Profile(int profileId, String qualification, String passingYear, String profession, String image, int volunteerId) {
      // for read all data
      this.profileId = profileId;
      this.qualification = qualification;
      this.passingYear = passingYear;
      this.profession = profession;
      this.image = image;
      this.volunteerId = volunteerId;
   }

   public int getProfileId() {
      return profileId;
   }

   public void setProfileId(int profileId) {
      this.profileId = profileId;
   }

   public String getQualification() {
      return qualification;
   }

   public void setQualification(String qualification) {
      this.qualification = qualification;
   }

   public String getPassingYear() {
      return passingYear;
   }

   public void setPassingYear(String passingYear) {
      this.passingYear = passingYear;
   }

   public String getProfession() {
      return profession;
   }

   public void setProfession(String profession) {
      this.profession = profession;
   }

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image = image;
   }

   public int getVolunteerId() {
      return volunteerId;
   }

   public void setVolunteerId(int volunteerId) {
      this.volunteerId = volunteerId;
   }
}
