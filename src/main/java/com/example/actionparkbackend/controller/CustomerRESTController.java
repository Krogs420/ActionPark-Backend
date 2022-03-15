package com.example.actionparkbackend.controller;

import com.example.actionparkbackend.entity.Customer;
import com.example.actionparkbackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRESTController {

  @Autowired
  CustomerService customerService;

  @GetMapping("/getCustomers")
  public List<Customer> getAllCustomers(){
    return customerService.getAllCustomers();
  }

}
