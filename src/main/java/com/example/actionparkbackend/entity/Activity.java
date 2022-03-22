package com.example.actionparkbackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Activity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int activityId;
  private String activityName;
  private double activityPrice;
  private String activityDescription;


  @OneToOne
  @JoinColumn(name = "activity_id")
  @JsonBackReference
  private BookingLine bookingLine;
  public int getActivityId() {
    return activityId;
  }

  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public double getActivityPrice() {
    return activityPrice;
  }

  public void setActivityPrice(double activityPrice) {
    this.activityPrice = activityPrice;
  }

  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public void setActivityId(int activityId) {
    this.activityId = activityId;
  }

  public BookingLine getBookingLine() {
    return bookingLine;
  }

  public void setBookingLine(BookingLine bookingLine) {
    this.bookingLine = bookingLine;
  }
}
