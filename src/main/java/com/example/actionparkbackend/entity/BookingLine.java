package com.example.actionparkbackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BookingLine {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int BookingLineId;

  @OneToOne
  @JoinColumn(name = "activity_id")
  private Activity activity;

  private double lineAmount = 0;

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
