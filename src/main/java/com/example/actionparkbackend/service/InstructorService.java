package com.example.actionparkbackend.service;

import com.example.actionparkbackend.entity.Instructor;
import com.example.actionparkbackend.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class InstructorService {

  @Autowired
  InstructorRepository instructorRepository;

  public List<Instructor> getAllInstructors() {
    return instructorRepository.findAll();
  }

  public void saveInstructor(Instructor instructor) {
    instructorRepository.save(instructor);
  }

  public Instructor getInstructorById(int id) {
    return instructorRepository.findById(id).get();
  }

  public Instructor createNewInstructor(Instructor instructor) {
    return instructorRepository.save(instructor);
  }

  public Optional<Instructor> findById(int id) {
    return instructorRepository.findById(id);
  }

  public void deleteCustomer(int id) {
    instructorRepository.deleteById(id);
  }
}
