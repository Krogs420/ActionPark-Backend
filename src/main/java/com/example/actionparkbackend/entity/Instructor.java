package com.example.actionparkbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instructor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int instructorId;
  private String instructorName;
  private String instructorPhoneNum;

  public int getInstructorId() {
    return instructorId;
  }

  public void setInstructorId(int instructorId) {
    this.instructorId = instructorId;
  }

  public String getInstructorName() {
    return instructorName;
  }

  public void setInstructorName(String instructorName) {
    this.instructorName = instructorName;
  }

  public String getInstructorPhoneNum() {
    return instructorPhoneNum;
  }

  public void setInstructorPhoneNum(String instructorPhoneNum) {
    this.instructorPhoneNum = instructorPhoneNum;
  }
}