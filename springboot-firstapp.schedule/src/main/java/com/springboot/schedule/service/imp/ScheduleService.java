package com.springboot.schedule.service.imp;

import java.util.List;


import com.springboot.schedule.model.Schedule;

public interface ScheduleService {
	//save
	Schedule saveSchedule(Schedule schedule);
	//findAll
	List<Schedule> getAllSchedule();
	//find
	Schedule getScheduleById(long id);
	//update
	Schedule updateSchedule(Schedule schedule,long id);
	//delete
	void deleteSchedule(long id);

}
