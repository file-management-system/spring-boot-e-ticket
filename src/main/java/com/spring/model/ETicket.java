package com.spring.model;

public class ETicket {
private int id;
private String name;
private String city ;
private double fair;
private String sms;
private String ticketavailable;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getFair() {
	return fair;
}
public void setFair(double fair) {
	this.fair = fair;
}
public String getSms() {
	return sms;
}
public void setSms(String sms) {
	this.sms = sms;
}
public String getTicketavailable() {
	return ticketavailable;
}
public void setTicketavailable(String ticketavailable) {
	this.ticketavailable = ticketavailable;
}
}


