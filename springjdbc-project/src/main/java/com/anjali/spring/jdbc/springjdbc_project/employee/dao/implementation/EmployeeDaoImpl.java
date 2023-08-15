package com.anjali.spring.jdbc.springjdbc_project.employee.dao.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.anjali.spring.jdbc.springjdbc_project.employee.dao.EmployeeDao;
import com.anjali.spring.jdbc.springjdbc_project.employee.dto.Employee;
import com.anjali.spring.jdbc.springjdbc_project.employee.rowmapper.EmployeeRowMapper;

@Component(value="employeeImpl")
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
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

	@Override
	public Employee read(int id) {
		String dqlQuery = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee emp = this.jdbcTemplate.queryForObject(dqlQuery,rowMapper, id);
		return emp;
	}

	@Override
	public List<Employee> getAll() {
		String sqlQuery = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> emps = this.jdbcTemplate.query(sqlQuery, rowMapper);
		return emps;
	}

}
