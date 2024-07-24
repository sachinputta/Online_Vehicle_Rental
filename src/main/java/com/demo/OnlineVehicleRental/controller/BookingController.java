package com.demo.OnlineVehicleRental.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.OnlineVehicleRental.entity.Booking;

import com.demo.OnlineVehicleRental.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	public BookingService bookingService;
	
	@PostMapping("/addBooking")

	public Booking addBooking(@RequestParam  int customerid,int vehicleid, @RequestBody Booking booking) {

		Booking t2 = bookingService.addBooking(customerid,vehicleid, booking);
		return t2;

	}
	
	@PutMapping("/updateBooking")

	public Booking updateBooking(@RequestParam  int bookingid, @RequestBody Booking booking) {

		Booking t2 = bookingService.updateBooking(bookingid, booking);
		return t2;

	}
	
	@DeleteMapping("/cancelBooking")
	
	public String cancelBooking(@RequestParam  int bookingid ,Booking booking ) {
		String t3 = bookingService.cancelBooking(bookingid,booking);
		return t3;
	}
	
	@GetMapping("/viewBooking")
	
	public Booking viewBooking(@RequestParam int bookingid) {
	
		Booking t4 = bookingService.viewBooking(bookingid);
		return t4;
		
	}
	
	
	@GetMapping("/viewAllBooking")
	public List<Booking> viewAllBooking(@RequestParam int customerid){
		
		List<Booking> t1 = bookingService.viewAllBooking(customerid);
		return t1;
	}
	
	@GetMapping("/viewAllByDate")
	public List<Booking> viewAllByDate(@RequestParam LocalDate bookingdate){
		
		List<Booking> t1 = bookingService.viewAllByDate(bookingdate);
		return t1;
	}
	
	
}
