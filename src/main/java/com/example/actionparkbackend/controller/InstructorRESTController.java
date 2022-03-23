package com.example.actionparkbackend.controller;

import com.example.actionparkbackend.entity.Instructor;
import com.example.actionparkbackend.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/instructor")
@CrossOrigin
public class InstructorRESTController {

  @Autowired
  InstructorService instructorService;

  @GetMapping("/all-instructors")
  public List<Instructor> getAllInstructors() {
    return instructorService.getAllInstructors();
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Instructor> updateInstructor(@PathVariable int id, @RequestBody Instructor instructor) {
    Optional<Instructor> optionalInstructor = instructorService.findById(id);
    if (optionalInstructor.isPresent()) {
      instructorService.saveInstructor(instructor);
      return new ResponseEntity<>(instructor, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(instructor, HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/")

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteInstructor(@PathVariable int id) {
    try {
      instructorService.deleteCustomer(id);
      return new ResponseEntity<>("Deleted instructor with id: " + id, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
  }


}
