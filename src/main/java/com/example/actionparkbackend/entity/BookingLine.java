package com.example.actionparkbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BookingLine {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BookingLineId;

    private String activityTime;

    @OneToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @OneToOne
    @JoinColumn
    private Instructor instructor;


    private double lineAmount = 0;


    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public int getBookingLineId() {
        return BookingLineId;
    }

    public void setBookingLineId(int bookingLineId) {
        BookingLineId = bookingLineId;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
        setLineAmount();
        setInstructor(instructor);
    }


  public double getLineAmount() {
        return lineAmount;
    }


  private void setLineAmount() {
    this.lineAmount = activity.getActivityPrice();
  }

  public String getActivityTime() {
    return activityTime;
  }

  public void setActivityTime(String activityTime) {
    this.activityTime = activityTime;
  }

  public Instructor getInstructor() {
    return instructor;
  }
}
