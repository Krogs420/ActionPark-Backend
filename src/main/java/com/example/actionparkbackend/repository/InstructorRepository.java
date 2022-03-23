package com.example.actionparkbackend.repository;

import com.example.actionparkbackend.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
}
