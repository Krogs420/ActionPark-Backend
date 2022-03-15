package com.example.actionparkbackend.repository;

import com.example.actionparkbackend.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}
