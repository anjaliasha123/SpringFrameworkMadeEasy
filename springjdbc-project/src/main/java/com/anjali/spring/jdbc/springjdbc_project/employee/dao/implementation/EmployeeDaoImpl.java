package com.anjali.spring.jdbc.springjdbc_project.employee.dao.implementation;

import org.springframework.jdbc.core.JdbcTemplate;

import com.anjali.spring.jdbc.springjdbc_project.employee.dao.EmployeeDao;
import com.anjali.spring.jdbc.springjdbc_project.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = this.jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int updateRow(Employee employee) {
		String sql = "update employee set firstName=? where lastName=?";
		int result = this.jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int deleteRow(Employee employee) {
		String sqlQuery = "delete from employee where lastName=?";
		int result = this.jdbcTemplate.update(sqlQuery, employee.getLastName());
		return result;
	}

}
