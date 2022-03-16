package com.example.actionparkbackend.service;

import com.example.actionparkbackend.entity.Customer;
import com.example.actionparkbackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;

  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

  public void saveCustomer(Customer customer) {
    customerRepository.save(customer);
  }

  public Customer getCustomerById(int id) {
    return customerRepository.findById(id).get();
  }

  public Customer createNewCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  public Optional<Customer> findById(int id) {
    return customerRepository.findById(id);
  }

  public void deleteCustomer(int id) {
    customerRepository.deleteById(id);
  }
}
