package com.demo.OnlineVehicleRental.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.OnlineVehicleRental.entity.User;
import com.demo.OnlineVehicleRental.exception.ResourceNotFoundException;
import com.demo.OnlineVehicleRental.repository.UserRepository;
import com.demo.OnlineVehicleRental.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public String removeUser(String userid) {
		User d1= userRepository.findById(userid).orElseThrow(()-> new 
				ResourceNotFoundException("User-ID is not found...!!" + userid));
		userRepository.delete(d1);
		return "Record Deleted Succesfully....!!!";
	}

}
