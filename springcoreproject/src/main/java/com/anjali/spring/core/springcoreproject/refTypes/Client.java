package com.anjali.spring.core.springcoreproject.refTypes;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anjali/spring/core/springcoreproject/refTypes/config.xml");
		Student studentObj = (Student)ctx.getBean("student");
		Score scores = studentObj.getScores();
		System.out.println("Student name: "+studentObj.getName());
		System.out.println("Scores physics: "+scores.getPhysics());
		System.out.println("Scores maths: "+scores.getMaths());
		System.out.println("Scores chemistry: "+scores.getChemistry());
	}

}
