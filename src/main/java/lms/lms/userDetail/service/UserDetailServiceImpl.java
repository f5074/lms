package lms.lms.userDetail.service;

import java.util.List;

import lms.lms.common.domain.UserDetail;
import lms.lms.userDetail.dao.UserDetailDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailService{
	@Autowired private UserDetailDao userDetailDao;
	
	@Override
	public List<UserDetail> userDetailList() {
		// TODO Auto-generated method stub
		return userDetailDao.userDetailList();
	}

	@Override
	public List<UserDetail> sendSMS(int userNo, int userPhone) {
		// TODO Auto-generated method stub
		return userDetailDao.sendSMS(userNo, userPhone);
	}

}
