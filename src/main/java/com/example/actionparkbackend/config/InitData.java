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
import java.util.ArrayList;
import java.util.List;

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
    activity.setActivityName("Mini Golf");
    activity.setActivityPrice(100.0);
    activity.setActivityDescription("Mega nice Mini golf for familien");

    Activity activity2 = new Activity();
    activity2.setActivityName("Go-cart");
    activity2.setActivityPrice(100.0);
    activity2.setActivityDescription("Mega nice Go-cart for dig og drengene");

    Activity activity3 = new Activity();
    activity3.setActivityName("Paintball");
    activity3.setActivityPrice(100.0);
    activity3.setActivityDescription("Mega nice PaintBall for familien");

    Activity activity4 = new Activity();
    activity4.setActivityName("Sumo Wrestling");
    activity4.setActivityPrice(100.0);
    activity4.setActivityDescription("Mega nice Sumo wrestling for familien");

    Activity activity5 = new Activity();
    activity5.setActivityName("Bumper Ball");
    activity5.setActivityPrice(100.0);
    activity5.setActivityDescription("Mega nice Bumper Ball for familien");


    activityService.saveActivity(activity);
    activityService.saveActivity(activity2);
    activityService.saveActivity(activity3);
    activityService.saveActivity(activity4);
    activityService.saveActivity(activity5);

    //Customer
    Customer customer = new Customer();
    customer.setCustomerFirstName("Finn");
    customer.setCustomerLastName("Jesen");
    customer.setCustomerMail("Finn@jensen.dk");
    customer.setCustomerPhoneNum("12345678");

    customerService.saveCustomer(customer);

    //Bookings
    Booking booking = new Booking();
    booking.setBookingDate(LocalDate.now());
    booking.setCreationDate(LocalDate.now());
    booking.setContenderAmount(4);
    booking.setCustomer(customer);


    Booking booking2 = new Booking();
    booking2.setBookingDate(LocalDate.now());
    booking2.setCreationDate(LocalDate.now());
    booking2.setContenderAmount(4);
    booking2.setCustomer(customer);


    //BookingLines
    BookingLine bookingLine = new BookingLine();
    bookingLine.setActivity(activity);

    BookingLine bookingLine2 = new BookingLine();
    bookingLine2.setActivity(activity);

    BookingLine bookingLine3 = new BookingLine();
    bookingLine3.setActivity(activity);


    BookingLine bookingLine4 = new BookingLine();
    bookingLine4.setActivity(activity);

    List<BookingLine> lines = new ArrayList<>();
    lines.add(bookingLine);
    lines.add(bookingLine2);
    lines.add(bookingLine3);


    bookingLineService.saveBookingLine(bookingLine);
    bookingLineService.saveBookingLine(bookingLine2);
    bookingLineService.saveBookingLine(bookingLine3);
    bookingLineService.saveBookingLine(bookingLine4);

    System.out.println(bookingLine.getBookingLineId());

    booking.setBookingLines(lines);
    bookingService.saveBooking(booking);
    bookingService.saveBooking(booking2);
  }

}
