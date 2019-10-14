package com.sg.assesment.parkingmanager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.assesment.parkingmanager.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Long>{

	List<Parking> findByAreaContaining(String area);
	
}
