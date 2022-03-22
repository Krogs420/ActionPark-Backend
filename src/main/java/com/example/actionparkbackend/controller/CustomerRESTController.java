package com.example.actionparkbackend.controller;

import com.example.actionparkbackend.entity.Customer;
import com.example.actionparkbackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/customer")
@CrossOrigin
public class CustomerRESTController {

  @Autowired
  CustomerService customerService;

  @GetMapping("/all-customers")
  public List<Customer> getAllCustomers() {
    return customerService.getAllCustomers();
  }

  @GetMapping("/{id}")
  public Customer getCustomer(@PathVariable int id) {
    return customerService.getCustomerById(id);
  }

  @PostMapping("/add")
  @ResponseStatus(HttpStatus.CREATED)
  public Customer postCustomer(@RequestBody Customer customer) {
    return customerService.createNewCustomer(customer);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Customer> updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
    Optional<Customer> optionalCustomer = customerService.findById(id);
    if (optionalCustomer.isPresent()) {
      customerService.saveCustomer(customer);
      return new ResponseEntity<>(customer, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(customer, HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
    try {
      customerService.deleteCustomer(id);
      return new ResponseEntity<>("Deleted customer with id: " + id, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
  }
}
