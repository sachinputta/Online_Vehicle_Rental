package com.demo.OnlineVehicleRental.service;

import java.time.LocalDate;
import java.util.List;

import com.demo.OnlineVehicleRental.entity.Booking;

public interface BookingService {


	public Booking addBooking(int customerid,int vehicleid, Booking booking);
	
	public Booking updateBooking(int bookingid, Booking booking);
	
	public String cancelBooking(int bookingid, Booking booking);
	
	public Booking viewBooking(int bookingid);
	
	public List<Booking> viewAllBooking(int customerid);
	
	public List<Booking> viewAllByDate(LocalDate bookingdate);
	
	
}
