package com.example.actionparkbackend.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Booking {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int bookingId;
  private LocalDate creationDate = LocalDate.now();
  private LocalDate bookingDate;
  private int contenderAmount;
  private double totalPrice;

  @OneToMany
  @JoinColumn(name = "booking_id")
  private List<BookingLine> bookingLines;

  @OneToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

  public int getBookingId() {
    return bookingId;
  }

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public LocalDate getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
  }

  public int getContenderAmount() {
    return contenderAmount;
  }

  public void setContenderAmount(int contenderAmount) {
    this.contenderAmount = contenderAmount;
  }

  public List<BookingLine> getBookingLines() {
    return bookingLines;
  }

  public void setBookingLines(List<BookingLine> bookingLines) {
    this.bookingLines = bookingLines;
    setTotalPrice();
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public void setTotalPrice() {
    double price = bookingLines.stream().mapToDouble(BookingLine::getLineAmount).sum();
    this.totalPrice = price;
  }

  public double getTotalPrice() {
    return totalPrice;
  }
}
