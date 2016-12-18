package com.lms.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lms.domain.User;
import com.lms.login.dao.mapper.UserMapper;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired private UserMapper userMapper;

	@Override
	public User loginCheck(User user) {
		// TODO Auto-generated method stub
		return userMapper.loginCheck(user);
	}


	




}
