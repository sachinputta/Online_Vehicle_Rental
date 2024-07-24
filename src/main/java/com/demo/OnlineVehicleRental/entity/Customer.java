package com.demo.OnlineVehicleRental.entity;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Customer  {
	
	@Id
	private int customerid;
	private String firstname;
	private String lastname;
	private String email;
	private long mobileno;
	private String address;
	
	
	@OneToOne
	private User user;
	
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,
			mappedBy = "customer")
	private Set<Booking> booking;
	
	

}
