package com.lms.join.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lms.domain.User;
import com.lms.join.dao.mapper.JoinMapper;

@Repository
public class JoinDaoImpl implements JoinDao{
	@Autowired private JoinMapper joinMapper;

	@Override
	public User duplCheck(User user) {
		// TODO Auto-generated method stub
		return joinMapper.duplCheck(user);
	}

	@Override
	public int joinUser(User user) {
		// TODO Auto-generated method stub
		return joinMapper.joinUser(user);
	}
	

}
