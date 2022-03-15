package com.example.actionparkbackend.service;

import com.example.actionparkbackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;



}
