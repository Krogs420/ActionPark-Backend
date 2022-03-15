package com.example.actionparkbackend.config;

import com.example.actionparkbackend.entity.Activity;
import com.example.actionparkbackend.entity.Booking;
import com.example.actionparkbackend.entity.BookingLine;
import com.example.actionparkbackend.entity.Customer;
import com.example.actionparkbackend.service.ActivityService;
import com.example.actionparkbackend.service.BookingLineService;
import com.example.actionparkbackend.service.BookingService;
import com.example.actionparkbackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitData implements CommandLineRunner {

  @Autowired
  ActivityService activityService;
  @Autowired
  BookingService bookingService;
  @Autowired
  BookingLineService bookingLineService;
  @Autowired
  CustomerService customerService;


  @Override
  public void run(String... args) throws Exception {

    //Activity
    Activity activity = new Activity();
    activity.setActivityName("Mini Gold");
    activity.setActivityPrice(100.0);
    activity.setActivityDescription("Mega nice Mini golf for familien");

    activityService.saveActivity(activity);

    //Customer
    Customer customer = new Customer();
    customer.setCustomerFirstName("Finn");
    customer.setCustomerLastName("Jesen");
    customer.setCustomerMail("Finn@jensen.dk");
    customer.setCustomerPhoneNum("12345678");
    customer.setCustomerAddress("adresse");

    customerService.saveCustomer(customer);

    //Bookings
    Booking booking = new Booking();
    booking.setBookingDate(LocalDate.now());
    booking.setCreationDate(LocalDate.now());
    booking.setContenderAmount(4);
    booking.setCustomer(customer);
    bookingService.saveBooking(booking);

    Booking booking2 = new Booking();
    booking2.setBookingDate(LocalDate.now());
    booking2.setCreationDate(LocalDate.now());
    booking2.setContenderAmount(4);
    booking2.setCustomer(customer);
    bookingService.saveBooking(booking2);

    //BookingLines
    BookingLine bookingLine = new BookingLine();
    bookingLine.setBooking(booking);
    bookingLine.setActivity(activity);

    BookingLine bookingLine2 = new BookingLine();
    bookingLine2.setBooking(booking);
    bookingLine2.setActivity(activity);

    BookingLine bookingLine3 = new BookingLine();
    bookingLine3.setBooking(booking);
    bookingLine3.setActivity(activity);

    BookingLine bookingLine4 = new BookingLine();
    bookingLine4.setBooking(booking2);
    bookingLine4.setActivity(activity);

    bookingLineService.saveBookingLine(bookingLine);
    bookingLineService.saveBookingLine(bookingLine2);
    bookingLineService.saveBookingLine(bookingLine3);
    bookingLineService.saveBookingLine(bookingLine4);



  }
}
