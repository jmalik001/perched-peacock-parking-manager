package com.sg.assesment.parkingmanager.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Parking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated user ID")
	private long id;
	
	private String name;
	
	private String area;
	
	private String lotcount;
	
	@Column(name = "vehicle_type")
	private String vehicletype;

	
	@OneToMany(targetEntity = Rate.class, mappedBy = "rateid", orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<Rate> rates;
	
	@OneToMany(targetEntity = Booking.class, mappedBy = "bookingid", orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<Booking> bookings;
	
	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLotcount() {
		return lotcount;
	}

	public void setLotcount(String lotcount) {
		this.lotcount = lotcount;
	}


	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	public Set<Rate> getRates() {
		return rates;
	}

	public void setRates(Set<Rate> rates) {
		this.rates = rates;
	}

	
	
}
