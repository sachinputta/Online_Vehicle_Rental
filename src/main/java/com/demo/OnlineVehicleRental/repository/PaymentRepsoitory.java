package com.demo.OnlineVehicleRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.OnlineVehicleRental.entity.Payment;

@Repository
public interface PaymentRepsoitory extends JpaRepository<Payment, Integer> {

	Payment findByBookingBookingid(int bookingid);

	void deleteByBookingBookingid(int bookingid);

}
