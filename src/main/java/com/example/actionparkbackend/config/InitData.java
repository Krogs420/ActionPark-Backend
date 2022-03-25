package com.example.actionparkbackend.config;

import com.example.actionparkbackend.entity.*;
import com.example.actionparkbackend.service.*;
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
    @Autowired
    InstructorService instructorService;


    @Override
    public void run(String... args) throws Exception {
/*
    //Activity
    Activity activity = new Activity();
    activity.setActivityName("Mini Golf");
    activity.setActivityPrice(100.0);
    activity.setActivityDescription("Mega nice Mini golf for familien");
    activity.setActivityImageHref("https://github.com/Krogs420/ActionPark-Frontend/blob/main/images/unnamed.png?raw=true");

    Activity activity2 = new Activity();
    activity2.setActivityName("Go-cart");
    activity2.setActivityPrice(100.0);
    activity2.setActivityDescription("Mega nice Go-cart for dig og drengene");
    activity2.setActivityImageHref("https://github.com/Krogs420/ActionPark-Frontend/blob/main/images/header_gokart-e1424087434508-1024x468.jpg?raw=true");

    Activity activity3 = new Activity();
    activity3.setActivityName("Paintball");
    activity3.setActivityPrice(100.0);
    activity3.setActivityDescription("Mega nice PaintBall for familien");
    activity3.setActivityImageHref("https://github.com/Krogs420/ActionPark-Frontend/blob/main/images/Paintball2.jpg?raw=true");


    Activity activity4 = new Activity();
    activity4.setActivityName("Sumo Wrestling");
    activity4.setActivityPrice(100.0);
    activity4.setActivityDescription("Mega nice Sumo wrestling for familien");
    activity4.setActivityImageHref("https://github.com/Krogs420/ActionPark-Frontend/blob/main/images/Sumo-Wrestling_Players3_960x720.jpg?raw=true");


    Activity activity5 = new Activity();
    activity5.setActivityName("Bumper Ball");
    activity5.setActivityPrice(100.0);
    activity5.setActivityDescription("Mega nice Bumper Ball for familien");
    activity5.setActivityImageHref("https://github.com/Krogs420/ActionPark-Frontend/blob/main/images/1522811_249040721886379_5028558434686202985_o.jpg?raw=true");


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

    //Instructors
    Instructor instructor = new Instructor();
    instructor.setInstructorName("Jens");
    instructor.setInstructorPhoneNum("12343678");
    Instructor instructor1 = new Instructor();
    instructor1.setInstructorName("Kurt");
    instructor1.setInstructorPhoneNum("12343678");
    Instructor instructor2 = new Instructor();
    instructor2.setInstructorName("Alfred");
    instructor2.setInstructorPhoneNum("12343678");
    Instructor instructor3 = new Instructor();
    instructor3.setInstructorName("Svend Aage");
    instructor3.setInstructorPhoneNum("12343678");




    //BookingLines
    BookingLine bookingLine = new BookingLine();
    bookingLine.setActivity(activity);
    bookingLine.setInstructor(instructor);

    BookingLine bookingLine2 = new BookingLine();
    bookingLine2.setActivity(activity);


    BookingLine bookingLine3 = new BookingLine();
    bookingLine3.setActivity(activity);


    BookingLine bookingLine4 = new BookingLine();
    bookingLine4.setActivity(activity);
    bookingLine4.setActivityTime("18:00");

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

    instructorService.saveInstructor(instructor);
    instructorService.saveInstructor(instructor1);
    instructorService.saveInstructor(instructor2);
    instructorService.saveInstructor(instructor3);
 */
    }


}
