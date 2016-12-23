package lms.lms.login.service;

import lms.lms.common.domain.User;
import lms.lms.login.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired private UserDao userDao;

	@Override
	public User loginCheck(User user) {
		// TODO Auto-generated method stub
		return userDao.loginCheck(user);
	}
	


}
