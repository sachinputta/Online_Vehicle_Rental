package com.demo.OnlineVehicleRental.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.demo.OnlineVehicleRental.entity.User;
import com.demo.OnlineVehicleRental.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		User add_user = userService.addUser(user);
		return add_user;
	}
	
	@DeleteMapping("/removeUser")

	public String removeUser(@RequestParam String userid) {
		String delete_user = userService.removeUser(userid);

		return delete_user;
	}
	

}
