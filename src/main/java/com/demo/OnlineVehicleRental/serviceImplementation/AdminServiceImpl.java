package com.demo.OnlineVehicleRental.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.OnlineVehicleRental.entity.Admin;
import com.demo.OnlineVehicleRental.entity.Customer;
import com.demo.OnlineVehicleRental.entity.User;
import com.demo.OnlineVehicleRental.entity.Vehicle;
import com.demo.OnlineVehicleRental.exception.ResourceNotFoundException;
import com.demo.OnlineVehicleRental.repository.AdminRepository;
import com.demo.OnlineVehicleRental.repository.BookingRepository;
import com.demo.OnlineVehicleRental.repository.UserRepository;
import com.demo.OnlineVehicleRental.repository.VehicleRepository;
import com.demo.OnlineVehicleRental.service.AdminService;

import jakarta.transaction.Transactional;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	public AdminRepository adminRepository;
	
	@Autowired
	public UserRepository userRepository;

	@Autowired
	public VehicleRepository vehicleRepository;
	
	@Autowired
	public BookingRepository bookingRepository;

//	@Override
//	public Admin addAdmin(String userid,Admin admin) {
//		User u1= userRepository.findById(userid).orElseThrow(()-> new 
//				ResourceNotFoundException("User-ID is not found...!!" + userid));
//		Admin a1 = adminRepository.save(admin);
//		a1.setUser(u1);
//		
//		return adminRepository.save(a1);
//	}
	
	
	@Override
	public Admin addAdmin(String userid,String password, String role,Admin admin) {
		
		 int userIdInt = Integer.parseInt(userid);
		 
		// Create and save User entity
			User user = new User();
			user.setUserid(userid);
			user.setPassword(password);
			user.setRole("ROLE_ADMIN");
			userRepository.save(user);
		 
		  // Create and save Admin entity
	        Admin a1 = new Admin();
	        a1.setAdminid(userIdInt);
	        a1.setFirstname(admin.getFirstname());
	        a1.setLastname(admin.getLastname());
	        a1.setEmail(admin.getEmail());
	        a1.setMobileno(admin.getMobileno());
	        a1.setAddress(admin.getAddress());
//	        a1.setUser(u1);
	        a1.setUser(user);
	     
	      return adminRepository.save(a1);
		 

	}

	@Override
	public String removeAdmin(int adminid) {
		Admin d1= adminRepository.findById(adminid).orElseThrow(()-> new 
				ResourceNotFoundException("Admin-ID is not found...!!" + adminid));
		adminRepository.delete(d1);
		return "Record Deleted Succesfully....!!!";
	}

	@Override
	public Admin updateAdmin(int adminid, Admin admin) {
		Admin t1= adminRepository.findById(adminid).orElseThrow(()-> new 
				ResourceNotFoundException("Admin-ID is not found...!!" + adminid));
		t1.setMobileno(admin.getMobileno());
		t1.setAddress(admin.getAddress());
		t1.setEmail(admin.getEmail());
		return adminRepository.save(t1) ;
		
	}

	@Override
	public Admin viewAdmin(int adminid) {
		  Admin c1 = adminRepository.findById(adminid).orElseThrow(()-> new 
				   ResourceNotFoundException("Admin-ID is not found...!!" + adminid));
		    return c1;
	}

	@Override
	public Admin addVehicle(int adminid, Vehicle vehicle) {
		Admin a1= adminRepository.findById(adminid).orElseThrow(()-> new 
				ResourceNotFoundException("Admin-ID is not found...!!" + adminid));
		Vehicle v2 = vehicleRepository.save( vehicle);
		a1.setVehicle(v2);
	
		
		return adminRepository.save(a1);
	}

//	@Transactional
//	@Override
//	public String removeVehicle(int vehicleid) {
//		Vehicle d1= vehicleRepository.findById(vehicleid).orElseThrow(()-> new 
//				ResourceNotFoundException("Vehicle-ID is not found...!! :" + vehicleid));
//
//		bookingRepository.deleteByVehicleVehicleid(vehicleid);
//		
//		vehicleRepository.delete(d1);
//		
//		return "Vehicle Deleted Succesfully....!!!";
//	}

	
}
