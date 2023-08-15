package com.anjali.spring.jdbc.springjdbc_project.employee.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.anjali.spring.jdbc.springjdbc_project.employee.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
		return emp;
	}

}
