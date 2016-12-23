package lms.lms.login.dao;

import lms.lms.common.domain.User;
import lms.lms.login.dao.mapper.LoginMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired private LoginMapper userMapper;

	@Override
	public User loginCheck(User user) {
		// TODO Auto-generated method stub
		return userMapper.loginCheck(user);
	}


	




}
