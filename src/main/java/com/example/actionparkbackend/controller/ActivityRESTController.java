package com.example.actionparkbackend.controller;


import com.example.actionparkbackend.entity.Activity;
import com.example.actionparkbackend.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivityRESTController {

  @Autowired
  ActivityService activityService;

  @GetMapping("/getActivities")
  public List<Activity> getAllActivities() {
    return activityService.getAllActivities();
  }

  @GetMapping("/getActivity/{id}")
  public Activity getActivity(@PathVariable int id) {
    return activityService.getActivityById(id);
  }

}
