package com.demo.OnlineVehicleRental.serviceImplementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.OnlineVehicleRental.entity.Admin;
import com.demo.OnlineVehicleRental.entity.Driver;
import com.demo.OnlineVehicleRental.entity.Vehicle;
import com.demo.OnlineVehicleRental.exception.ResourceNotFoundException;
import com.demo.OnlineVehicleRental.repository.AdminRepository;
import com.demo.OnlineVehicleRental.repository.BookingRepository;
import com.demo.OnlineVehicleRental.repository.DriverRepository;
import com.demo.OnlineVehicleRental.repository.VehicleRepository;
import com.demo.OnlineVehicleRental.service.VehicleService;

import jakarta.transaction.Transactional;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	public VehicleRepository vehicleRepository;
	
	@Autowired
	public AdminRepository adminRepository;
	
	@Autowired
	public DriverRepository driverRepository;
	
	@Autowired
	public BookingRepository bookingRepository;

//	public Vehicle addVehicle(int adminid,Vehicle vehicle) {
//		Admin admin= adminRepository.findById(adminid).orElseThrow(()-> new 
//				ResourceNotFoundException("Admin-ID is not found...!!" + adminid));
//	
//		Vehicle v2 = vehicleRepository.save( vehicle);
//		v2.setAdmin(admin);	
//		return vehicleRepository.save(v2); 
//	}

	public String removeVehicle(int vehicleid) {
		Vehicle d1= vehicleRepository.findById(vehicleid).orElseThrow(()-> new 
				ResourceNotFoundException("Vehicle-ID is not found...!! :" + vehicleid));

		vehicleRepository.delete(d1);
		
		return "Vehicle Deleted Succesfully....!!!";
	
	
	}

	@Override
	public Vehicle addDriver(int vehicleid, Driver driver) {
		Vehicle d1= vehicleRepository.findById(vehicleid).orElseThrow(()-> new 
				ResourceNotFoundException("Vehicle-ID is not found...!! :" + vehicleid));
		Driver c1= driverRepository.save(driver);
		d1.setDriver(c1);
		return vehicleRepository.save(d1);
	}


	


}
