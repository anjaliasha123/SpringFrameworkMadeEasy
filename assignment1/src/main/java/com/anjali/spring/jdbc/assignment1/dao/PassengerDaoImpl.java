package com.anjali.spring.jdbc.assignment1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.anjali.spring.jdbc.assignment1.dao.rowMapper.PassengerRowMapper;
import com.anjali.spring.jdbc.assignment1.dto.Passenger;

@Component("passengerDaoImpl")
public class PassengerDaoImpl implements PassengerDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int createPassenger(Passenger passenger) {
		String sql = "insert into passenger values(?,?,?)";
		int result = this.jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
		return result;
	}

	@Override
	public int updatePassengerInfo(Passenger passenger) {
		String sql = "update passenger set lastName=? where id=?";
		int result = this.jdbcTemplate.update(sql,  passenger.getLastName(), passenger.getId());
		return result;
	}

	@Override
	public int deletePassenger(int id) {
		String sql = "delete from passenger where id=?";
		int result = this.jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public List<Passenger> getAllPassengers() {
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		String sql = "select * from passenger";
		List<Passenger> list = this.jdbcTemplate.query(sql,rowMapper);
		return list;
	}

}
