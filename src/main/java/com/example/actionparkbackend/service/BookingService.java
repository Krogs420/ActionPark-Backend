package com.example.actionparkbackend.service;

import com.example.actionparkbackend.entity.Booking;
import com.example.actionparkbackend.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

  public Booking createNewBooking(Booking booking) {
    return bookingRepository.save(booking);
  }

  public Optional<Booking> findById(int id) {
    return bookingRepository.findById(id);
  }

  public void deleteBooking(int id) {
    bookingRepository.deleteById(id);
  }

  public List<Booking> getBookingByBookingDate (LocalDate date) {
    return bookingRepository.findByBookingDate(date);
  }
}
