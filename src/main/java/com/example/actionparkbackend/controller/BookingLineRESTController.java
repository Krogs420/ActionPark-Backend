package com.example.actionparkbackend.controller;

import com.example.actionparkbackend.entity.Activity;
import com.example.actionparkbackend.entity.Booking;
import com.example.actionparkbackend.entity.BookingLine;
import com.example.actionparkbackend.repository.BookingLineRepository;
import com.example.actionparkbackend.service.BookingLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingLineRESTController {

  @Autowired
  BookingLineService bookingLineService;

  @GetMapping("/getBookingLines")
  public List<BookingLine> bookingLines() {
    return bookingLineService.getBookingLines();
  }

  @GetMapping("/getBookingLine/{id}")
  public BookingLine getBookingLine(@PathVariable int id) {
    return bookingLineService.getBookingLineById(id);
  }

  @PostMapping("/postBookingLine")
  @ResponseStatus(HttpStatus.CREATED)
  public BookingLine postBookingLine(@RequestBody BookingLine bookingLine){
    return bookingLineService.createNewBookingLine(bookingLine);
  }

}
