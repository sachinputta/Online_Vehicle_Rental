package com.demo.OnlineVehicleRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.OnlineVehicleRental.entity.Admin;
import com.demo.OnlineVehicleRental.entity.Vehicle;
import com.demo.OnlineVehicleRental.service.AdminService;
import com.demo.OnlineVehicleRental.service.UserService;

@RestController
public class AdminController {

	@Autowired
	public AdminService adminService;

	@Autowired
	public UserService userService;

	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestParam String userid,String password, String role, @RequestBody Admin admin) {

		Admin t1 = adminService.addAdmin(userid,password,role, admin);

		return t1;
	}

	@DeleteMapping("/removeAdmin")
	public String removeAdmin(@RequestParam int adminid) {
		String delete_admin = adminService.removeAdmin(adminid);

		return delete_admin;
	}

	@PutMapping("/updateAdmin")
	public Admin updateAdmin(@RequestParam int adminid, @RequestBody Admin admin) {

		Admin admin_update = adminService.updateAdmin(adminid, admin);
		return admin_update;
	}

	@GetMapping("/viewAdmin")
	public Admin viewAdmin(@RequestParam @RequestBody Integer adminid) {
		Admin h1 = adminService.viewAdmin(adminid);
		return h1;
	}
	
	@PostMapping("/addVehicle")

	public Admin addVehicle(@RequestParam int adminid, @RequestBody Vehicle vehicle) {

		Admin t2 = adminService.addVehicle(adminid, vehicle);
		return t2;

	}
	
//	@DeleteMapping("/removeVehicle")
//	public String removeVehicle(@RequestParam int vehicleid) {
//		String delete_vehicle = adminService.removeVehicle(vehicleid);
//
//		return delete_vehicle;
//	}

}
