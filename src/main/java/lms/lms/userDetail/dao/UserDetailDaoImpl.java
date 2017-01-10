package lms.lms.userDetail.dao;

import java.util.List;

import lms.lms.common.domain.UserDetail;
import lms.lms.userDetail.dao.mapper.UserDetailMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDetailDaoImpl implements UserDetailDao{
	@Autowired private UserDetailMapper userDetailMapper;

	@Override
	public List<UserDetail> userDetailList() {
		// TODO Auto-generated method stub
		return userDetailMapper.userDetailList();
	}



	@Override
	public int userDetailInsert(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return userDetailMapper.userDetailInsert(userDetail);
	}



	@Override
	public List<UserDetail> sendSMS(int userNo, String userPhone) {
		// TODO Auto-generated method stub
		return userDetailMapper.sendSMS(userNo, userPhone);
	}



	@Override
	public List<UserDetail> userDetailView(int userNo, String userPhone) {
		// TODO Auto-generated method stub
		return userDetailMapper.userDetailView(userNo, userPhone);
	}



	@Override
	public List<UserDetail> userDetailView2(String userName, String userPhone) {
		// TODO Auto-generated method stub
		return userDetailMapper.userDetailView2(userName, userPhone);
	}



	@Override
	public int userNoSearch(String userName, String userPhone) {
		// TODO Auto-generated method stub
		return userDetailMapper.userNoSearch(userName, userPhone);
	}

}
