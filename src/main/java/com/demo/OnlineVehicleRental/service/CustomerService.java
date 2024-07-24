package com.demo.OnlineVehicleRental.service;



import java.util.List;


import com.demo.OnlineVehicleRental.entity.Customer;
import com.demo.OnlineVehicleRental.entity.User;

public interface CustomerService {


	public Customer addCustomer(String userid,String password, String role, Customer customer);

	public String removeCustomer(int customerid);
	
	public Customer updateCustomer(int customerid, Customer customer);
	
	public Customer viewCustomer(int customerid) ;
	
	public List<Customer> ViewAllCustomers(String type);
	
	public List<Customer> ViewAllCustomerByLocation(String location);
	
	
	
	

}
