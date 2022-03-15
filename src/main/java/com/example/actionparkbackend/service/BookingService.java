package com.example.actionparkbackend.service;

import com.example.actionparkbackend.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingService {

  @Autowired
  BookingRepository bookingRepository;

}
