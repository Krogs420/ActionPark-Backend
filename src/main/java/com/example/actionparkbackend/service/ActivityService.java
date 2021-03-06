package com.example.actionparkbackend.service;

import com.example.actionparkbackend.entity.Activity;
import com.example.actionparkbackend.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ActivityService {

  @Autowired
  ActivityRepository activityRepository;

  public List<Activity> getAllActivities() {
    return activityRepository.findAll();
  }

  public void saveActivity(Activity activity) {
    activityRepository.save(activity);

  }

  public Activity getActivityById(int id) {
    return activityRepository.findById(id).get();
  }

  public Activity postNewActivity(Activity activity) {
    return activityRepository.save(activity);
  }

  public Optional<Activity> findById(int id) {
    return activityRepository.findById(id);
  }

  public void deleteActivity(int id) {
    activityRepository.deleteById(id);
  }
}
