package com.anjali.spring.core.springcoreproject;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.core.convert.Property;

public class Employee {
	
	private int id;
	private String name;
	private List<String> departments;
	private Set<String> managers;
	private Map<String, String> deptRoleMap;
	private Properties countryAndLanguages;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	public Set<String> getManagers() {
		return managers;
	}
	public void setManagers(Set<String> managers) {
		this.managers = managers;
	}
	public Map<String, String> getDeptRoleMap() {
		return deptRoleMap;
	}
	public void setDeptRoleMap(Map<String, String> deptRoleMap) {
		this.deptRoleMap = deptRoleMap;
	}
	public Properties getCountryAndLanguages() {
		return countryAndLanguages;
	}
	public void setCountryAndLanguages(Properties countryAndLanguages) {
		this.countryAndLanguages = countryAndLanguages;
	}
	

}
