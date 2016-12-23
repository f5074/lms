package lms.lms.login.service;

import lms.lms.common.domain.User;
import lms.lms.login.dao.LoginDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired private LoginDao userDao;

	@Override
	public User loginCheck(User user) {
		// TODO Auto-generated method stub
		return userDao.loginCheck(user);
	}
	


}
