package com.model;

public class State {

   private int stateId;
   private String state;

   public State() {}

   public State(String state) {
      this.state = state;
   }

   public State(int stateId, String state) {
      this.stateId = stateId;
      this.state = state;
   }

   public int getStateId() {
      return stateId;
   }

   public void setStateId(int stateId) {
      this.stateId = stateId;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }
}
