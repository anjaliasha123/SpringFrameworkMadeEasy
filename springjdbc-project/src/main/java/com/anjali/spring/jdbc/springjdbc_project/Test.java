package com.anjali.spring.jdbc.springjdbc_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/anjali/spring/jdbc/springjdbc_project/config.xml");
		JdbcTemplate bean = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = bean.update(sql, Integer.parseInt("1"), "Anju","Jake");
		System.out.println("Number of records updated: "+result);
	}

}
