package com.springboot.schedule.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.schedule.model.Schedule;
import com.springboot.schedule.service.imp.ScheduleService;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {
	private ScheduleService scheduleService;

	public ScheduleController(ScheduleService scheduleService) {
		super();
		this.scheduleService = scheduleService;
	}
	@PostMapping
	public ResponseEntity<Schedule>saveSchedule(@RequestBody Schedule schedule){
		return new ResponseEntity<Schedule> (scheduleService.saveSchedule(schedule),HttpStatus.OK);
	}
	@GetMapping
	public List<Schedule>getAllSchedule(){
		return scheduleService.getAllSchedule();
	}
	@GetMapping("{id}")
	public ResponseEntity<Schedule>getScheduleById(@PathVariable("id") long id){
		return new ResponseEntity<Schedule> (scheduleService.getScheduleById(id),
				HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Schedule>updateSchedule(@PathVariable("id") long id,
			@RequestBody Schedule schedule){
		return new ResponseEntity<Schedule> (scheduleService.updateSchedule(schedule, id),
				HttpStatus.OK);
		
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteSchedule(@PathVariable("id") long id){
		scheduleService.deleteSchedule(id);
		return new ResponseEntity<String>("Schedule details deleted successfully...!",HttpStatus.OK);
	
	}
}


