package com.example.actionparkbackend.config;

import com.example.actionparkbackend.entity.Activity;
import com.example.actionparkbackend.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

  @Autowired
  ActivityService activityService;

  @Override
  public void run(String... args) throws Exception {

    Activity activity = new Activity();
    activity.setActivityName("Mini Gold");
    activity.setActivityPrice(100.0);
    activity.setActivityDescription("Mega nice Mini golf for familien");

    activityService.saveActivity(activity);

    customer

  }
}
