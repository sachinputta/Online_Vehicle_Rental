
package com.demo.OnlineVehicleRental.serviceImplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.OnlineVehicleRental.entity.Booking;
import com.demo.OnlineVehicleRental.entity.Customer;
import com.demo.OnlineVehicleRental.entity.Payment;
import com.demo.OnlineVehicleRental.exception.ResourceNotFoundException;
import com.demo.OnlineVehicleRental.repository.BookingRepository;
import com.demo.OnlineVehicleRental.repository.PaymentRepsoitory;
import com.demo.OnlineVehicleRental.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	public PaymentRepsoitory paymentRepsoitory;

	@Autowired
	public BookingRepository bookingRepository;

	@Override
	public Payment addPayment(int bookingid, Payment payment) {
		Booking b1 = bookingRepository.findById(bookingid)
				.orElseThrow(() -> new ResourceNotFoundException("Booking-ID is not found...!! : " + bookingid));
		Payment p1 = paymentRepsoitory.save(payment);
		p1.setBooking(b1);
		return paymentRepsoitory.save(p1);
	}

	@Override
	public Payment cancelPayment(int paymentid) {
		Payment p2 = paymentRepsoitory.findById(paymentid)
				.orElseThrow(() -> new ResourceNotFoundException("Payment-Id not found"));
		p2.setPaymentstatus("CANCELLED");
		return paymentRepsoitory.save(p2);
	}

	@Override
	public Payment viewPayment(int bookingid) {
		Booking b1 = bookingRepository.findById(bookingid)
				.orElseThrow(() -> new ResourceNotFoundException("Booking-ID is not found...!! : " + bookingid));
		Payment p3= paymentRepsoitory.findByBookingBookingid(b1.getBookingid());
		return p3;
	}

	

}
