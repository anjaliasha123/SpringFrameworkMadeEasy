package com.anjali.spring.jdbc.springjdbc_project.employee.dao;

import java.util.List;

import com.anjali.spring.jdbc.springjdbc_project.employee.dto.Employee;

public interface EmployeeDao {
	int create(Employee employee);
	int updateRow(Employee employee);
	int deleteRow(Employee employee);
	Employee read(int id);
	List<Employee> getAll();
}
