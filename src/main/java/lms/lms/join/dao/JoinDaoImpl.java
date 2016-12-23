package lms.lms.join.dao;

import lms.lms.common.domain.User;
import lms.lms.join.dao.mapper.JoinMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
