package com.example.actionparkbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Random;

@Entity
public class Instructor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int instructorId;
  private String instructorName;
  private String instructorPhoneNum;

  public Instructor(String instructorName) {
    this.instructorName = instructorName;
  }

  public Instructor() {

  }

  public String getRandomActivityInstructor() {
    Random rando = new Random();
    ArrayList<String> instructors = new ArrayList<>();
    instructors.add("Jens");
    instructors.add("Kurt");
    instructors.add("Alfred");
    instructors.add("Svend Aage");

    int randomInstructor = rando.nextInt(instructors.size());
    return instructors.get(randomInstructor);
  }


  public int getInstructorId() {
    return instructorId;
  }

  public void setInstructorId(int instructorId) {
    this.instructorId = instructorId;
  }

  public void setInstructorName(String instructorName) {
    this.instructorName = instructorName;
  }

  public String getInstructorName() {
    return this.instructorName = getRandomActivityInstructor();
  }

  public String getInstructorPhoneNum() {
    return instructorPhoneNum;
  }

  public void setInstructorPhoneNum(String instructorPhoneNum) {
    this.instructorPhoneNum = instructorPhoneNum;
  }
}