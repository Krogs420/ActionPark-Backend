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
/*
  public Instructor getRandomActivityInstructor() {
    Random rando = new Random();
    ArrayList<Instructor> instructors = new ArrayList<>();
    Instructor instructor1 = new Instructor("Jens");
    instructors.add(instructor1);
    Instructor instructor2 = new Instructor("Kurt");
    instructors.add(instructor2);
    Instructor instructor3 = new Instructor("Alfred");
    instructors.add(instructor3);
    Instructor instructor4 = new Instructor("Svend Aage");
    instructors.add(instructor4);

    int randomInstructor = rando.nextInt(instructors.size());
    return instructors.get(randomInstructor);
  }

 */

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