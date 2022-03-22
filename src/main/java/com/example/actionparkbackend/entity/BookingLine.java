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
    private String activity_instructor;

    @OneToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;


    private double lineAmount = 0;


    public String getActivity_instructor() {
        return activity_instructor;
    }

    public void setActivity_instructor(String activity_instructor) {
        this.activity_instructor = activity_instructor;
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
}
