package com.springboot.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.schedule.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{

}
