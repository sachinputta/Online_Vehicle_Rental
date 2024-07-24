package com.demo.OnlineVehicleRental.entity;



import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Vehicle {

	@Id
	private int vehicleid;
	private String vehicleno;
	private String type;
	private String category;
	private String description;
	private String location;
	private int capacity;
	private double chargesperkm;
	private double fixedcharges;
	
	@OneToOne	
	private Driver driver;
	
//	@ManyToOne
//	private Admin admin;
	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,
//			mappedBy = "vehicle")
//	private List<Admin> admin;
	
	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,
//			mappedBy = "vehicle")
//	private Set<Booking> booking;
	

	
	

	
	
	
}
