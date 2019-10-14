package com.sg.assesment.parkingmanager.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sg.assesment.parkingmanager.dao.UserRepository;
import com.sg.assesment.parkingmanager.model.Parking;
import com.sg.assesment.parkingmanager.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController()
@Api(value = "Parking Management System", description = "Operations pertaining to User in Parking Management System")
public class UserController {
	@Autowired
	UserRepository userDao;
	
	@ApiOperation(value = "View a list of available users", response = List.class)
	@ApiResponses (value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	@GetMapping("/users")
	public List<User> getUsers(){
		return userDao.findAll();
		
	}
	
	

}
