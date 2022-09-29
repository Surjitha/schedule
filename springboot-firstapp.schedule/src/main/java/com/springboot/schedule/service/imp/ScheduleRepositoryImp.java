package com.springboot.schedule.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.schedule.exception.ResourceNotFoundException;
import com.springboot.schedule.model.Schedule;
import com.springboot.schedule.repository.ScheduleRepository;

@Service
public class ScheduleRepositoryImp implements ScheduleService {
	@Autowired
	private ScheduleRepository scheduleRepository;

	public ScheduleRepositoryImp(ScheduleRepository scheduleRepository) {
		super();
		this.scheduleRepository = scheduleRepository;
	}

	@Override
	public Schedule saveSchedule(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

	@Override
	public List<Schedule> getAllSchedule() {
		return scheduleRepository.findAll();
	}

	@Override
	public Schedule getScheduleById(long id) {
		
		return scheduleRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Schedule","Id",id));
	}

	@Override
	public Schedule updateSchedule(Schedule schedule, long id) {
		Schedule fun=scheduleRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Schedule","Id",id));
		
		
		fun.setDestAirport(fun.getDestAirport());
		fun.setSourceAirport(fun.getSourceAirport());
		fun.setArrTime(fun.getArrTime());
		fun.setDepTime(fun.getDepTime());
		scheduleRepository.save(fun);
		return fun;
	}

	@Override
	public void deleteSchedule(long id) {
	   scheduleRepository.findById(id).orElseThrow(()->
			new ResourceNotFoundException("Schedule","Id",id));
			scheduleRepository.deleteById(id);
			
		}
	}

	

	
	


