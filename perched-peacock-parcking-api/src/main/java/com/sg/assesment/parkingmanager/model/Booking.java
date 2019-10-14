package com.sg.assesment.parkingmanager.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated user ID")
	private long bookingid;
	
	private long userid;
	private long pakingid;
	private String duration;
	private String bookingDate;
	private double bookingAmount;
	private boolean paymentStatus;
	
//	@OneToOne(mappedBy = "booking")
//	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parkingid", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Parking parking;  
	
	public long getBookingid() {
		return bookingid;
	}
	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getPakingid() {
		return pakingid;
	}
	public void setPakingid(long pakingid) {
		this.pakingid = pakingid;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public double getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	public Parking getParking() {
		return parking;
	}
	public void setParking(Parking parking) {
		this.parking = parking;
	}
	
}
