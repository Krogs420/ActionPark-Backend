package com.example.actionparkbackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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

  @ManyToOne
  @JoinColumn(name = "booking_id")
  @JsonBackReference
  private Booking booking;

  @OneToOne
  @JoinColumn(name = "activity_id")
  private Activity activity;

  public int getBookingLineId() {
    return BookingLineId;
  }


  public Booking getBooking() {
    return booking;
  }

  public void setBooking(Booking booking) {
    this.booking = booking;
  }

  public void setBookingLineId(int bookingLineId) {
    BookingLineId = bookingLineId;
  }

  public Activity getActivity() {
    return activity;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }
}
