package lms.lms.join.service;

import lms.lms.common.domain.User;
import lms.lms.join.dao.JoinDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
