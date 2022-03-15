package com.example.actionparkbackend.service;

import com.example.actionparkbackend.entity.Activity;
import com.example.actionparkbackend.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActivityService {

  @Autowired
  ActivityRepository activityRepository;

}
