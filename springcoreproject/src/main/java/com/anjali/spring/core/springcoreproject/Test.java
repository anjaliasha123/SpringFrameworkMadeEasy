package com.anjali.spring.core.springcoreproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anjali/spring/core/springcoreproject/config.xml");
		Employee e = (Employee)ctx.getBean("emp");
		System.out.println("Employee name:"+e.getName()+" and id: "+e.getId());
	}

}
