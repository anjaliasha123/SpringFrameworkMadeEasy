package com.anjali.spring.jdbc.springjdbc_project.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.anjali.spring.jdbc.springjdbc_project.employee.dao.EmployeeDao;
import com.anjali.spring.jdbc.springjdbc_project.employee.dao.implementation.EmployeeDaoImpl;
import com.anjali.spring.jdbc.springjdbc_project.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/anjali/spring/jdbc/springjdbc_project/employee/test/config.xml");
		EmployeeDao obj = (EmployeeDao) ctx.getBean("employeeDaoImpl");
//		int result = obj.create(new Employee(1, "Varsha","Karun"));
//		System.out.println("Number of records updated: "+result);
//		result = obj.create(new Employee(2, "Baji","Tarun"));
//		result = obj.create(new Employee(3, "Asha","Anna"));
//		int result = obj.updateRow(new Employee(1, "Varun", "Karun"));
//		System.out.println("Updated row:"+result);
//		int result = obj.deleteRow(new Employee(1,"Varun","Karun"));
//		System.out.println("Number of rows deleted: "+ result);
//		Employee emp = (Employee) obj.read(1);
//		System.out.println("EMP first name: "+emp.getFirstName()+" last name: "+emp.getLastName());
		List<Employee> emp = obj.getAll(); 
		for(Employee e: emp) {
			System.out.print("emp id: "+e.getId()+" name: "+e.getFirstName()+" "+e.getLastName());
			System.out.println();
		}
	}

}
