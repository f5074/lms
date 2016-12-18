package com.lms.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.domain.User;
import com.lms.login.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	@Autowired private UserDao userDao;

	@Override
	public User loginCheck(User user) {
		// TODO Auto-generated method stub
		return userDao.loginCheck(user);
	}
	


}
