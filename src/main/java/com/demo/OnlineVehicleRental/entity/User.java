package com.demo.OnlineVehicleRental.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public  class User {

	@Id
	private String userid;
	private String password;
	private String role;
	
	
	
}
