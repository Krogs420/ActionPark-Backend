package com.example.actionparkbackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Entity
public class Instructor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int instructorId;
  private String instructorName;
  private String instructorPhoneNum;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "instructor_id")
  @JsonBackReference
  private BookingLine bookingLine;


  /*
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

   */



  public BookingLine getBookingLine() {
    return bookingLine;
  }

  public void setBookingLine(BookingLine bookingLine) {
    this.bookingLine = bookingLine;
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

  public String getInstructorPhoneNum() {
    return instructorPhoneNum;
  }

  public void setInstructorPhoneNum(String instructorPhoneNum) {
    this.instructorPhoneNum = instructorPhoneNum;
  }

  public String getInstructorName() {
    return instructorName;
  }


}