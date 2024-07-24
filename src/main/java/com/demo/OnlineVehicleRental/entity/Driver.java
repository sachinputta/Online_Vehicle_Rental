package com.demo.OnlineVehicleRental.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Driver {
	
	
	@Id
	private int driverid;
	private String firstname;
	private String lastname;
	private String address;
	private long mobileno;
	private String email;
	private String licenseno;
	
//	@OneToOne
//	private Vehicle vehicle;
	

}
