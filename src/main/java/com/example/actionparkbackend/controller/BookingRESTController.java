package com.example.actionparkbackend.controller;


import com.example.actionparkbackend.entity.Booking;
import com.example.actionparkbackend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/booking")
@CrossOrigin
public class BookingRESTController {

  @Autowired
  BookingService bookingService;

  @GetMapping("/all-bookings")
  public List<Booking> getAllBooking() {
    return bookingService.getBookings();
  }

  @GetMapping("/{id}")
  public Booking getBooking(@PathVariable int id) {
    return bookingService.getBookingById(id);
  }

  @PostMapping("/add")
  @ResponseStatus(HttpStatus.CREATED)
  public Booking postBooking(@RequestBody Booking booking) {
    return bookingService.createNewBooking(booking);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Booking> updateBooking(@PathVariable int id, @RequestBody Booking booking) {
    Optional<Booking> optionalBooking = bookingService.findById(id);
    if (optionalBooking.isPresent()) {
      bookingService.saveBooking(booking);
      return new ResponseEntity<>(booking, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(booking, HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteBooking(@PathVariable int id) {
    try {
      bookingService.deleteBooking(id);
      return new ResponseEntity<>("Delete task with id: " + id, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/bookingdate/{id}")
  public List<Booking> getBookingByDate(@PathVariable String id) {
    LocalDate date = LocalDate.parse(id);
    return bookingService.getBookingByBookingDate(date);
  }

  @GetMapping("/customer-phone/{phoneNum}")
  public List<Booking> getBookingByPhoneNum(@PathVariable String phoneNum) {
    return bookingService.getBookingByPhoneNum(phoneNum);
  }
}
