package com.demo.OnlineVehicleRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.OnlineVehicleRental.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
