package com.demo.OnlineVehicleRental.service;


import java.util.List;

import com.demo.OnlineVehicleRental.entity.Payment;

public interface PaymentService {

	public Payment addPayment(int bookingid,Payment payment);
	
	public Payment cancelPayment(int paymentid);
	
	public Payment viewPayment(int bookingid);
	
	
}
