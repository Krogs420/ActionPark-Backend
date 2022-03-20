package com.example.actionparkbackend.controller;

import com.example.actionparkbackend.entity.Activity;
import com.example.actionparkbackend.entity.Booking;
import com.example.actionparkbackend.entity.BookingLine;
import com.example.actionparkbackend.repository.BookingLineRepository;
import com.example.actionparkbackend.service.BookingLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/booking-line")
public class BookingLineRESTController {

  @Autowired
  BookingLineService bookingLineService;

  @GetMapping("/all-booking-lines")
  public List<BookingLine> bookingLines() {
    return bookingLineService.getBookingLines();
  }

  @GetMapping("/{id}")
  public BookingLine getBookingLine(@PathVariable int id) {
    return bookingLineService.getBookingLineById(id);
  }

  @PostMapping("/add")
  @ResponseStatus(HttpStatus.CREATED)
  public BookingLine postBookingLine(@RequestBody BookingLine bookingLine) {
    return bookingLineService.createNewBookingLine(bookingLine);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<BookingLine> updateBookingLine(@PathVariable int id,
                                                       @RequestBody BookingLine bookingLine) {
    Optional<BookingLine> optionalBookingLine = bookingLineService.findById(id);
    if (optionalBookingLine.isPresent()) {
      bookingLineService.saveBookingLine(bookingLine);
      return new ResponseEntity<>(bookingLine, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(bookingLine, HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteBookingLine(@PathVariable int id) {
    try {
      bookingLineService.deleteBookingLine(id);
      return new ResponseEntity<>("Deleted booking line with id: " + id, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
  }

}
