package com.example.actionparkbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Random;

@Entity
public class BookingLine {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BookingLineId;
    private String activityInstructor;

    @OneToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;


    private double lineAmount = 0;


    public String getActivityInstructor() {
        Random rand = new Random();
        ArrayList<String> names = new ArrayList<>();
        names.add("Test John");
        names.add("Test Kurt");
        names.add("Test svend");
        names.add("Test Bjarne");

        int randomInstructor = rand.nextInt(names.size());
        return names.get(randomInstructor);
    }

    public void setActivityInstructor(String activityInstructor) {
        this.activityInstructor = activityInstructor;
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
}
