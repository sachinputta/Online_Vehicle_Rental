package com.demo.OnlineVehicleRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.OnlineVehicleRental.entity.Admin;
import com.demo.OnlineVehicleRental.entity.Driver;
import com.demo.OnlineVehicleRental.entity.Vehicle;
import com.demo.OnlineVehicleRental.service.AdminService;
import com.demo.OnlineVehicleRental.service.DriverService;
import com.demo.OnlineVehicleRental.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	public VehicleService vehicleService;
	@Autowired
	public AdminService adminService;

	@Autowired
	public DriverService driverService;

//	@PostMapping("/addVehicle")

//	public Vehicle addVehicle(@RequestParam int adminid, @RequestBody Vehicle vehicle) {
//
//		Vehicle t2 = vehicleService.addVehicle(adminid, vehicle);
//		return t2;
//
//	}

//	@DeleteMapping("/removeVehicle")
//	public String removeVehicle(@RequestParam int vehicleid) {
//		String delete_vehicle = vehicleService.removeVehicle(vehicleid);
//
//		return delete_vehicle;
//	}
	
	@PostMapping("/addDriver")

	public Vehicle addDriver(@RequestParam int vehicleid, @RequestBody Driver driver) {

		Vehicle t2 = vehicleService.addDriver(vehicleid, driver);
		return t2;

	}

//	@DeleteMapping("/removeDriver")
//	public String removeVehicle(@RequestParam int driverid) {
//		String delete_driver = vehicleService.removeDriver(driverid);
//
//		return delete_driver;
//	}


}
