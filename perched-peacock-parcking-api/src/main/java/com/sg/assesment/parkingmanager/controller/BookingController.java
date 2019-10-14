package com.sg.assesment.parkingmanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.assesment.parkingmanager.dao.BookingRepository;
import com.sg.assesment.parkingmanager.model.Booking;

@RestController
@RequestMapping("/user/booking")
public class BookingController {

	@Autowired 
	BookingRepository bookingRepo;
	
	@PostMapping("/book")
	public ResponseEntity<Booking> bookParking(@Valid @RequestBody Booking bookingetails ){
		Booking booking= bookingRepo.save(bookingetails);
		return ResponseEntity.ok().body(booking);
		
	}
}
