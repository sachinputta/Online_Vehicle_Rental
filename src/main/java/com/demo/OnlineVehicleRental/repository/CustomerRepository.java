package com.demo.OnlineVehicleRental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.OnlineVehicleRental.entity.Booking;
import com.demo.OnlineVehicleRental.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	

	

	

}
