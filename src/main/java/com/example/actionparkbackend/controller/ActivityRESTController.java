package com.example.actionparkbackend.controller;


import com.example.actionparkbackend.entity.Activity;
import com.example.actionparkbackend.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/activity")
public class ActivityRESTController {

  @Autowired
  ActivityService activityService;

  @GetMapping("/all-activities")
  public List<Activity> getAllActivities() {
    return activityService.getAllActivities();
  }

  @GetMapping("/{id}")
  public Activity getActivity(@PathVariable int id) {
    return activityService.getActivityById(id);
  }

  @PostMapping("/add")
  @ResponseStatus(HttpStatus.CREATED)
  public Activity postActivity(@RequestBody Activity activity) {
    return activityService.postNewActivity(activity);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Activity> updateActivity(@PathVariable int id, @RequestBody Activity activity) {
    Optional<Activity> optionalActivity = activityService.findById(id);
    if (optionalActivity.isPresent()) {
      activityService.saveActivity(activity);
      return new ResponseEntity<>(activity, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(activity, HttpStatus.NOT_FOUND);
    }
  }

  //Bør man kunne slette en aktivitet, hvis ja - hvad gør vi med alle de records
  // der connected så de ikke blir forældreløse :(
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteActivity(@PathVariable int id) {
    try {
      activityService.deleteActivity(id);
      return new ResponseEntity<>("Activity delete with id: " + id, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
  }
}
