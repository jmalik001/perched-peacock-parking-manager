package com.sg.assesment.parkingmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.assesment.parkingmanager.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
