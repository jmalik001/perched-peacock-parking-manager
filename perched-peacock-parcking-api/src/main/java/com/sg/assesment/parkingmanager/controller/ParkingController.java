package com.sg.assesment.parkingmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.assesment.parkingmanager.dao.ParkingRepository;
import com.sg.assesment.parkingmanager.model.Parking;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user/parking")
public class ParkingController {

	@Autowired
	private ParkingRepository parkingRepo;
	
	@ApiOperation(value = "Search Parking")
    @GetMapping("/available/{area}")
	public ResponseEntity<List<Parking>> findAvailableParkingSolts( @PathVariable(value = "area") String area){
		List<Parking> availableParkings = parkingRepo.findByAreaContaining(area);
			    //.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		return ResponseEntity.ok().body(availableParkings);
		
	}
	
}
