package com.demo.OnlineVehicleRental.entity;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Payment {
	
	
	@Id
	private int paymentid;
	private String paymentmode;
	private LocalDate paymentdate;
	private String paymentstatus;
	
	@OneToOne
	private Booking booking;
	
	

}
