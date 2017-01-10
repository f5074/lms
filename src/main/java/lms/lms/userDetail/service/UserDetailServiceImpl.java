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
	public int userDetailInsert(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return userDetailDao.userDetailInsert(userDetail);
	}



	@Override
	public List<UserDetail> sendSMS(int userNo, String userPhone) {
		// TODO Auto-generated method stub
		return userDetailDao.sendSMS(userNo, userPhone);
	}



	@Override
	public List<UserDetail> userDetailView(int userNo, String userPhone) {
		// TODO Auto-generated method stub
		return userDetailDao.userDetailView(userNo, userPhone);
	}



	@Override
	public List<UserDetail> userDetailView2(String userName, String userPhone) {
		// TODO Auto-generated method stub
		return userDetailDao.userDetailView2(userName, userPhone);
	}



	@Override
	public int userNoSearch(String userName, String userPhone) {
		// TODO Auto-generated method stub
		return userDetailDao.userNoSearch(userName, userPhone);
	}

}
