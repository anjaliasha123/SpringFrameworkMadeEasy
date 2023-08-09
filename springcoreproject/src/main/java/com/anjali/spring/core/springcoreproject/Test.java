package com.anjali.spring.core.springcoreproject;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.Property;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anjali/spring/core/springcoreproject/config.xml");
		Employee e = (Employee)ctx.getBean("emp");
		System.out.println("Employee name:"+e.getName()+" and id: "+e.getId());
		List<String> dep = e.getDepartments();
		for(String d: dep) {
			System.out.println("Department name: "+d);
		}
		Set<String> managersName = e.getManagers();
		for(String name: managersName) {
			System.out.println("Manager: "+name);
		}
		Map<String, String> map = e.getDeptRoleMap();
		for(String key: map.keySet()) {
			System.out.println("key: "+key+" role: "+map.get(key));
		}
		Properties cl = e.getCountryAndLanguages();
		System.out.println(cl);
	}

}
