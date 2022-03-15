package com.example.actionparkbackend.service;

import com.example.actionparkbackend.entity.Customer;
import com.example.actionparkbackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;


  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }
}
