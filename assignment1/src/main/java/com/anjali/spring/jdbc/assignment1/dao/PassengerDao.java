package com.anjali.spring.jdbc.assignment1.dao;

import java.util.List;

import com.anjali.spring.jdbc.assignment1.dto.Passenger;

public interface PassengerDao {
	int createPassenger(Passenger passenger);
	int updatePassengerInfo(Passenger passenger);
	int deletePassenger(int id);
	List<Passenger> getAllPassengers();
}
