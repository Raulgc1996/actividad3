package org.gonicollazo.exam04.models;

public class Passenger {
private long id;
private String name;
private String phone;
public Passenger(String name, String phone) {
	this.name = name;
	this.phone = phone;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}
