package com.example.actionparkbackend.service;

import com.example.actionparkbackend.entity.BookingLine;
import com.example.actionparkbackend.repository.BookingLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingLineService {
  @Autowired
  BookingLineRepository bookingLineRepository;

  public BookingLine createBookingLine(BookingLine bookingLine){
    return bookingLineRepository.save(bookingLine);
  }

  public void saveBookingLine(BookingLine bookingLine) {
    bookingLineRepository.save(bookingLine);
  }
}
