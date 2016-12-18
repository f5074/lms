package com.lms.join.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.domain.User;
import com.lms.join.dao.JoinDao;

@Service
public class JoinServiceImpl implements JoinService{
	@Autowired private JoinDao joinDao;
	
	@Override
	public User duplCheck(User user) {
		// TODO Auto-generated method stub
		return joinDao.duplCheck(user);
	}

	@Override
	public int joinUser(User user) {
		// TODO Auto-generated method stub
		return joinDao.joinUser(user);
	}
	

}
