package com.sg.assesment.parkingmanager.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "All details about the User of Parking. ")
public class User {
	
public User(){
	
}
public User(String firstname, String lastname, String contact, String vehicleNumber, String vehicleType,
			String vehicleWeight, String username, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.vehicleWeight = vehicleWeight;
		this.username = username;
		this.password = password;
	}

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@ApiModelProperty(notes = "The database generated user ID")
private long id;
@Column
private String firstname;
@Column
private String lastname;
@Column(name = "contact_number")
private String contact;
@Column(name = "vehicle_number")
private String vehicleNumber;
@Column(name = "vehicle_type")
private String vehicleType;
@Column(name = "vehicle_weight")
private String vehicleWeight;
@Column private String username;
@JsonIgnore
@Column private String password;

@OneToOne(cascade= CascadeType.ALL)
@JoinColumn(name = "bookingid")
private Booking booking;


public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public String getVehicleWeight() {
	return vehicleWeight;
}
public void setVehicleWeight(String vehicleWeight) {
	this.vehicleWeight = vehicleWeight;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Booking getBooking() {
	return booking;
}
public void setBooking(Booking booking) {
	this.booking = booking;
}

}
