package com.example.actionparkbackend.entity;

import com.example.actionparkbackend.service.BookingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookingTest {

  @Autowired
  BookingService bookingService;

  @Test
  public void testGetTotalPricePass() {
    Booking booking = bookingService.getBookingById(1);

    assertEquals(300, booking.getTotalPrice());
  }

  @Test
  public void testGetTotalPriceFail() {
    Booking booking = bookingService.getBookingById(1);

    assertNotEquals(200, booking.getTotalPrice());
  }

}