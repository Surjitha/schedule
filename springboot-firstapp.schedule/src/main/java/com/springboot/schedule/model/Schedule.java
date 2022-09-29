package com.springboot.schedule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="source_Air")
	private String sourceAirport;
	@Column(name="dest_Air")
	private String destAirport;
	@Column(name="arr_Time")
	private String arrTime;
	@Column(name="dep_Time")
	private String depTime;
	public Schedule(long id, String sourceAirport, String destAirport, String arrTime, String depTime) {
		super();
		this.id = id;
		this.sourceAirport = sourceAirport;
		this.destAirport = destAirport;
		this.arrTime = arrTime;
		this.depTime = depTime;
	}
	public Schedule() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestAirport() {
		return destAirport;
	}
	public void setDestAirport(String destAirport) {
		this.destAirport = destAirport;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	

}
