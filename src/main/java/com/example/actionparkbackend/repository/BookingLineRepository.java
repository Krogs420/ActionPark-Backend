package com.example.actionparkbackend.repository;

import com.example.actionparkbackend.entity.BookingLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingLineRepository extends JpaRepository<BookingLine, Integer> {
}
