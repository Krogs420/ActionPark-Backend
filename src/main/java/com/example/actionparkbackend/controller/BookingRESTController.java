package com.example.actionparkbackend.controller;


import com.example.actionparkbackend.entity.Booking;
import com.example.actionparkbackend.service.ActivityService;
import com.example.actionparkbackend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingRESTController {

  @Autowired
  BookingService bookingService;

  @GetMapping("/getBookings")
  public List<Booking> getAllBooking() {
    return bookingService.getBookings();
  }

  @GetMapping("/getBooking/{id}")
  public Booking getBooking(@PathVariable int id) {
    return bookingService.getBookingById(id);
  }

}
