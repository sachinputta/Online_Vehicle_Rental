package com.demo.OnlineVehicleRental.service;

import com.demo.OnlineVehicleRental.entity.Admin;
import com.demo.OnlineVehicleRental.entity.Vehicle;

public interface AdminService {

	public Admin addAdmin(String userid,String password, String role,Admin admin);

	public String removeAdmin(int adminid);
	
	public Admin updateAdmin(int adminid, Admin admin);
	
	public Admin viewAdmin(int adminid) ;
	
	
	public Admin addVehicle(int adminid, Vehicle vehicle);
	
//	public String removeVehicle(int vehicleid);

	
	
	

}
