package com.demo.OnlineVehicleRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.OnlineVehicleRental.entity.Driver;
import com.demo.OnlineVehicleRental.service.DriverService;

@RestController
public class DriverController {
	@Autowired
	public DriverService driverService;
	
//	@PostMapping("/addDriver")
//	
//	public Driver addDriver(@RequestParam int vehicleid, @RequestBody Driver driver) {
//		
//		Driver t2 = driverService.addDriver(vehicleid,driver);
//		return t2;
//		
//	}
	
//	@DeleteMapping("/removeDriver")
//	public String removeVehicle(@RequestParam int driverid) {
//		String delete_driver = driverService.removeDriver(driverid);
//
//		return delete_driver;
//	}

}
