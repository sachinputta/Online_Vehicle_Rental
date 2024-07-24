package com.demo.OnlineVehicleRental.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.OnlineVehicleRental.entity.Customer;
import com.demo.OnlineVehicleRental.entity.Driver;
import com.demo.OnlineVehicleRental.entity.User;
import com.demo.OnlineVehicleRental.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	

	

	void deleteByDriverDriverid(int driverid);

	



}
