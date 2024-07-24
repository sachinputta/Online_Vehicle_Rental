package com.demo.OnlineVehicleRental.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.OnlineVehicleRental.entity.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	List<Booking> findByCustomerCustomerid(int customerid);

	List<Booking> findByBookingdate(LocalDate bookingdate);

	List<Booking> findByVehicleLocation(String location);

	List<Booking> findByVehicleType(String type);

	void deleteByVehicleVehicleid(int vehicleid);








	
	

	

}
