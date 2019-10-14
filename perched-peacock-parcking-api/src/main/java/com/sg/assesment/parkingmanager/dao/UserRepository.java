package com.sg.assesment.parkingmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.assesment.parkingmanager.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
