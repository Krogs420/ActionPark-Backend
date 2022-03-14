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

    @ManyToOne
    @JoinColumn(name="activity_id")
    private Activity activities;

    @OneToOne
    @JoinColumn(name="customer_id")
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
}
