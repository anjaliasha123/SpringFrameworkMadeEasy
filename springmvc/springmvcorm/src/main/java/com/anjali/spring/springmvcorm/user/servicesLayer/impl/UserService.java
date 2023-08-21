package com.anjali.spring.springmvcorm.user.servicesLayer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anjali.spring.springmvcorm.user.dao.UserDao;
import com.anjali.spring.springmvcorm.user.servicesLayer.UserServices;

@Service
public class UserService implements UserServices {
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
}
