package com.demo.OnlineVehicleRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.OnlineVehicleRental.entity.Customer;
import com.demo.OnlineVehicleRental.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	public CustomerService customerService;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestParam String userid,String password, String role, @RequestBody Customer customer) {

		Customer person = customerService.addCustomer(userid,password, role,customer);
		return person;
	}
	
	@DeleteMapping("/removeCustomer")

	public String removeCustomer(@RequestParam int customerid) {
		String delete_customer = customerService.removeCustomer(customerid);

		return delete_customer;
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestParam int customerid, @RequestBody Customer customer){

		Customer customer_update = customerService.updateCustomer(customerid, customer);
		return customer_update;
	}
	
	@GetMapping("/viewCustomer")
	public Customer viewCustomer( @RequestParam     @RequestBody  Integer customerid) {
		Customer h1 = customerService.viewCustomer(customerid);
		return h1;
	}
	
	@GetMapping("/viewAllCustomers")
	public List<Customer> ViewAllCustomers(@RequestParam String type){
		
		List<Customer> t1 = customerService.ViewAllCustomers(type);
		return t1;
		
	}
	
	@GetMapping("/viewAllCustomerByLocation")
	public List<Customer> ViewAllCustomerByLocation(@RequestParam String location){
		
		List<Customer> t2 = customerService.ViewAllCustomerByLocation(location);
		return t2;
		
	}
	
}
