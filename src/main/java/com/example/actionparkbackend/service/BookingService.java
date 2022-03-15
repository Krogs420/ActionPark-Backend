package com.example.actionparkbackend.service;

import com.example.actionparkbackend.entity.Booking;
import com.example.actionparkbackend.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookingService {

  @Autowired
  BookingRepository bookingRepository;

  public List<Booking> getBookings() {
    return bookingRepository.findAll();
  }

  public void saveBooking(Booking booking) {
    bookingRepository.save(booking);
  }

  public Booking getBookingById(int id) {
    return bookingRepository.findById(id).get();
  }
}
