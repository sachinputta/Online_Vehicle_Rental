package com.demo.OnlineVehicleRental.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingid;
	private LocalDate bookingdate;
	private LocalDate bookedtilldate;
	private String bookingdescription;
	private double totalcost;
	private double totaldistance;

//	@OneToOne
//	private Vehicle vehicle;

//	@OneToOne
//	private Customer customer;

	@ManyToOne
	private Vehicle vehicle;

	@ManyToOne
	private Customer customer;
	
	@OneToOne
	private Payment payment;

}
