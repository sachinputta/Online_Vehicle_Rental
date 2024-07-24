package com.demo.OnlineVehicleRental.serviceImplementation;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.OnlineVehicleRental.entity.Booking;
import com.demo.OnlineVehicleRental.entity.Customer;
import com.demo.OnlineVehicleRental.entity.Vehicle;
import com.demo.OnlineVehicleRental.exception.ResourceNotFoundException;
import com.demo.OnlineVehicleRental.repository.BookingRepository;
import com.demo.OnlineVehicleRental.repository.CustomerRepository;
import com.demo.OnlineVehicleRental.repository.PaymentRepsoitory;
import com.demo.OnlineVehicleRental.repository.VehicleRepository;
import com.demo.OnlineVehicleRental.service.BookingService;

import jakarta.transaction.Transactional;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	public BookingRepository bookingRepository;
	
	@Autowired
	public CustomerRepository customerRepository;
	
	@Autowired
	public VehicleRepository vehicleRepository;
	@Autowired
	public PaymentRepsoitory paymentRepsoitory;

	@Override
	public Booking addBooking(int customerid,int vehicleid,Booking booking) {
		Customer d1= customerRepository.findById(customerid).orElseThrow(()-> new 
				ResourceNotFoundException("Customer-ID is not found...!! :" + customerid));
		Vehicle d2= vehicleRepository.findById(vehicleid).orElseThrow(()-> new 
				ResourceNotFoundException("Vehicle-ID is not found...!! :" + vehicleid));
		Booking b1=bookingRepository.save(booking);
		b1.setCustomer(d1);
		b1.setVehicle(d2);
		return bookingRepository.save(b1);
	}
	
	
	@Override
	public Booking updateBooking(int bookingid, Booking booking) {
		Booking b1= bookingRepository.findById(bookingid).orElseThrow(()-> new 
				ResourceNotFoundException("Booking-ID is not found...!! : " + bookingid));

		b1.setBookedtilldate(booking.getBookedtilldate());
		b1.setBookingdate(booking.getBookingdate());
		b1.setBookingdescription(booking.getBookingdescription());
	
		return bookingRepository.save(b1) ;
	}

	
	@Transactional
	@Override
	public String cancelBooking(int bookingid,Booking booking) {
		Booking b2= bookingRepository.findById(bookingid).orElseThrow(()-> new 
				ResourceNotFoundException("Booking-ID is not found...!!" + bookingid));
//		bookingRepository.delete(b2);
//		paymentRepsoitory.deleteByBookingBookingid(bookingid);
		
		Booking p1= bookingRepository.save(booking);
		p1.setBookingdescription("CANCELLED");
		return "Booking Cancelled Succesfully....!!!";
	}

	@Override
	public Booking viewBooking(int bookingid) {
		 Booking c1 = bookingRepository.findById(bookingid).orElseThrow(()-> new 
				   ResourceNotFoundException("Booking-ID is not found...!!" + bookingid));
		    return c1;
	}



	@Override
	public List<Booking> viewAllBooking(int customerid) {
		Customer t1 = customerRepository.findById(customerid).orElseThrow(()-> new 
				ResourceNotFoundException("Customer-Id is not found..!!! : " +customerid));
		List<Booking> list = bookingRepository.findByCustomerCustomerid(t1.getCustomerid());
		return list;
	}



	@Override
	public List<Booking> viewAllByDate(LocalDate bookingdate) {
		List<Booking> list = bookingRepository.findByBookingdate(bookingdate);
		return list;
	}
	

}
