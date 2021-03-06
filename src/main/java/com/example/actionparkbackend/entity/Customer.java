package com.example.actionparkbackend.entity;

import javax.persistence.*;

@Entity
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int customerId;
  private String customerFirstName;
  private String customerLastName;
  private String customerMail;
  private String customerPhoneNum;
  private String CustomerCvrNumber;
  private String customerComment;


  public int getCustomerId() {
    return customerId;
  }

  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  public String getCustomerMail() {
    return customerMail;
  }

  public void setCustomerMail(String customerMail) {
    this.customerMail = customerMail;
  }

  public String getCustomerPhoneNum() {
    return customerPhoneNum;
  }

  public void setCustomerPhoneNum(String customerPhoneNum) {
    this.customerPhoneNum = customerPhoneNum;
  }

  public String getCustomerCvrNumber() {
    return CustomerCvrNumber;
  }

  public void setCustomerCvrNumber(String customerCvrNumber) {
    CustomerCvrNumber = customerCvrNumber;
  }

  public String getCustomerComment() {
    return customerComment;
  }

  public void setCustomerComment(String customerComment) {
    this.customerComment = customerComment;
  }
}
