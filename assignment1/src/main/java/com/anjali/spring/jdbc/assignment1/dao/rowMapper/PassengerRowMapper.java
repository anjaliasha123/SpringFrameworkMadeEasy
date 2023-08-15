package com.anjali.spring.jdbc.assignment1.dao.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.anjali.spring.jdbc.assignment1.dto.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger p = new Passenger(rs.getInt(1), rs.getString(2), rs.getString(3));
		return p;
	}

}
