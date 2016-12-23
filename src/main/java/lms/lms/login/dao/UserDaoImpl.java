package lms.lms.login.dao;

import lms.lms.common.domain.User;
import lms.lms.login.dao.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired private UserMapper userMapper;

	@Override
	public User loginCheck(User user) {
		// TODO Auto-generated method stub
		return userMapper.loginCheck(user);
	}


	




}
