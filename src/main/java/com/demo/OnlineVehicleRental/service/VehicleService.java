package com.demo.OnlineVehicleRental.service;


import com.demo.OnlineVehicleRental.entity.Driver;
import com.demo.OnlineVehicleRental.entity.Vehicle;

public interface VehicleService {

//	public Vehicle addVehicle(int adminid, Vehicle vehicle);

//	public String removeVehicle(int vehicleid);
	

	public Vehicle addDriver(int vehicleid, Driver driver);
	
//	public String removeDriver(int driverid);

	

}
