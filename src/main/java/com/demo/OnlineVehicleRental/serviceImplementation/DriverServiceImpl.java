package com.demo.OnlineVehicleRental.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.OnlineVehicleRental.entity.Driver;
import com.demo.OnlineVehicleRental.entity.Vehicle;
import com.demo.OnlineVehicleRental.exception.ResourceNotFoundException;
import com.demo.OnlineVehicleRental.repository.DriverRepository;
import com.demo.OnlineVehicleRental.repository.VehicleRepository;
import com.demo.OnlineVehicleRental.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {
	@Autowired
	public DriverRepository driverRepository;

	@Autowired
	public VehicleRepository vehicleRepository;

//	@Override
//	public Driver addDriver(int vehicleid, Driver driver) {
//		Vehicle z1= vehicleRepository.findById(vehicleid).orElseThrow(()-> new 
//				ResourceNotFoundException("Vehicle-ID is not found...!!" + vehicleid));
//		Driver d1 = driverRepository.save(driver);
////		d1.setVehicle(z1);
//		z1.setDriver(d1);
//		
//		return driverRepository.save(d1);
//	}

//	@Override
//	public String removeDriver(int driverid) {
//		Driver d1= driverRepository.findById(driverid).orElseThrow(()-> new 
//				ResourceNotFoundException("Driver-ID is not found...!!" + driverid));
//		driverRepository.delete(d1);
//		return "Vehicle Deleted Succesfully....!!!";
//	}
//	

}
