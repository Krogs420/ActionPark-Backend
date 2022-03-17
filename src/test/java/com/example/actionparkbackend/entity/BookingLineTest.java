package com.example.actionparkbackend.entity;

import com.example.actionparkbackend.service.BookingLineService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookingLineTest {

  @Autowired
  BookingLineService bookingLineService;

  @Test
  public void testLineAmountPass(){
    BookingLine bookingLine = bookingLineService.getBookingLineById(1);

    assertEquals(100, bookingLine.getLineAmount());
  }

  @Test
  public void testLineAmountFail(){
    BookingLine bookingLine = bookingLineService.getBookingLineById(1);

    assertNotEquals(200, bookingLine.getLineAmount());
  }

}