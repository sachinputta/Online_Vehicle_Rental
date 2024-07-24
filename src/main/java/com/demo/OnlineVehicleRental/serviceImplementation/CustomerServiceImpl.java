package com.demo.OnlineVehicleRental.serviceImplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.OnlineVehicleRental.entity.Booking;
import com.demo.OnlineVehicleRental.entity.Customer;
import com.demo.OnlineVehicleRental.entity.User;
import com.demo.OnlineVehicleRental.exception.ResourceNotFoundException;
import com.demo.OnlineVehicleRental.repository.BookingRepository;
import com.demo.OnlineVehicleRental.repository.CustomerRepository;
import com.demo.OnlineVehicleRental.repository.UserRepository;
import com.demo.OnlineVehicleRental.repository.VehicleRepository;
import com.demo.OnlineVehicleRental.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	public CustomerRepository customerRepository;

	@Autowired
	public UserRepository userRepository;

	@Autowired
	public VehicleRepository vehicleRepository;

	@Autowired
	public BookingRepository bookingRepository;

//	@Override
//	public Customer addCustomer(String userid, Customer customer) {
//		User u1 = userRepository.findById(userid)
//				.orElseThrow(() -> new ResourceNotFoundException("User-ID is not found...!!" + userid));
//		Customer c1 = customerRepository.save(customer);
//		c1.setUser(u1);
//		return customerRepository.save(c1);
//	}

	@Override
	public Customer addCustomer(String userid,String password,String role, Customer customer) {

		int userIdInt = Integer.parseInt(userid);
		
		// Create and save User entity
//		User user = new User();
//		user.setUserid(userid);
//		user.setPassword(password);
//		user.setRole("ROLE_CUSTOMER");
//		userRepository.save(user);
		

		// Create and save Customer entity
		Customer c1 = new Customer();
		c1.setCustomerid(userIdInt);
		c1.setFirstname(customer.getFirstname());
		c1.setLastname(customer.getLastname());
		c1.setEmail(customer.getEmail());
		c1.setMobileno(customer.getMobileno());
		c1.setAddress(customer.getAddress());
//		c1.setUser(u1);

//		c1.setUser(user);
		return customerRepository.save(c1);

	}

	@Override
	public String removeCustomer(int customerid) {
		Customer d1 = customerRepository.findById(customerid)
				.orElseThrow(() -> new ResourceNotFoundException("Customer-ID is not found...!!" + customerid));
		customerRepository.delete(d1);
		return "Record Deleted Successfully....!!!";
	}

	@Override
	public Customer updateCustomer(int customerid, Customer customer) {
		Customer t1 = customerRepository.findById(customerid)
				.orElseThrow(() -> new ResourceNotFoundException("Customer-ID is not found...!!" + customerid));
		t1.setMobileno(customer.getMobileno());
		t1.setAddress(customer.getAddress());
		t1.setEmail(customer.getEmail());

		return customerRepository.save(t1);
	}

	@Override
	public Customer viewCustomer(int customerid) {
		Customer c1 = customerRepository.findById(customerid)
				.orElseThrow(() -> new ResourceNotFoundException("Customer-ID is not found...!!" + customerid));
		return c1;
	}

	@Override
	public List<Customer> ViewAllCustomers(String type) {
		List<Booking> v2 = bookingRepository.findByVehicleType(type);

		List<Customer> customer_1 = v2.stream().map(Booking::getCustomer).distinct().collect(Collectors.toList());
		return customer_1;
	}

	@Override
	public List<Customer> ViewAllCustomerByLocation(String location) {
		List<Booking> v1 = bookingRepository.findByVehicleLocation(location);

		List<Customer> customer = v1.stream().map(Booking::getCustomer).distinct().collect(Collectors.toList());
		return customer;

	}

}
