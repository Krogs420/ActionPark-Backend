package com.example.actionparkbackend.service;

import com.example.actionparkbackend.entity.BookingLine;
import com.example.actionparkbackend.repository.BookingLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookingLineService {
  @Autowired
  BookingLineRepository bookingLineRepository;

  public void saveBookingLine(BookingLine bookingLine) {
    bookingLineRepository.save(bookingLine);
  }

  public List<BookingLine> getBookingLines() {
    return bookingLineRepository.findAll();
  }

  public BookingLine getBookingLineById(int id) {
    return bookingLineRepository.findById(id).get();
  }
}
