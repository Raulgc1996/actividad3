package org.gonicollazo.exam04.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
private long id;
private String name;
private Date date;
private List<Passenger> passenger = new ArrayList<Passenger>();
public Flight(String name, Date date) {
	this.name = name;
	this.date = date;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public List<Passenger> getPassenger() {
	return passenger;
}
public void setPassenger(List<Passenger> passenger) {
	this.passenger = passenger;
}
public void addPass(Passenger pas){
	this.passenger.add(pas);
}
}
