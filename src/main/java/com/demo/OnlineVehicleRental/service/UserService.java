package com.demo.OnlineVehicleRental.service;

import com.demo.OnlineVehicleRental.entity.User;

public interface UserService {

	public User addUser(User user);
	
	public String removeUser(String userid);
}


