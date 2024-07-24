package com.demo.OnlineVehicleRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.OnlineVehicleRental.entity.Booking;
import com.demo.OnlineVehicleRental.entity.Payment;
import com.demo.OnlineVehicleRental.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	public PaymentService paymentService;
	
	@PostMapping("/addPayment")

	public Payment addPayment(@RequestParam  int bookingid, @RequestBody Payment payment) {

		Payment t2 = paymentService.addPayment(bookingid, payment);
		return t2;

	}
	
	@PutMapping("/cancelPayment")
	public Payment cancelPayment(@RequestParam int paymentid) {
		
		Payment t3= paymentService.cancelPayment(paymentid);
		return t3;
	}
	
	@GetMapping("/viewPayment")
	
	public Payment viewPayment(@RequestParam int bookingid) {
	
		Payment t4 = paymentService.viewPayment(bookingid);
		return t4;
		
	}

}
