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
	public int userDetailInsert(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return userDetailMapper.userDetailInsert(userDetail);
	}

	@Override
	public int userDetailUpddate(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return userDetailMapper.userDetailUpddate(userDetail);
	}

	@Override
	public int userDetailDelete(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return userDetailMapper.userDetailDelete(userDetail);
	}

	@Override
	public List<UserDetail> userDetailList() {
		// TODO Auto-generated method stub
		return userDetailMapper.userDetailList();
	}

	@Override
	public UserDetail userDetailView(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return userDetailMapper.userDetailView(userDetail);
	}

	@Override
	public List<UserDetail> sendSMS(int userNo, int userPhone) {
		// TODO Auto-generated method stub
		return userDetailMapper.sendSMS(userNo, userPhone);
	}

}
