package com.example.actionparkbackend.repository;

import com.example.actionparkbackend.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

  public List<Booking> findByBookingDate (LocalDate bookingDate);
}
