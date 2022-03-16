package com.example.actionparkbackend.repository;

import com.example.actionparkbackend.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
