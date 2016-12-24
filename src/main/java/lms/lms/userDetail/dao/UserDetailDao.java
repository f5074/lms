package lms.lms.userDetail.dao;

import java.util.List;

import lms.lms.common.domain.UserDetail;

public interface UserDetailDao {
	int userDetailInsert(UserDetail userDetail);
	int userDetailUpddate(UserDetail userDetail);
	int userDetailDelete(UserDetail userDetail);
	List<UserDetail> userDetailList();
	UserDetail userDetailView(UserDetail userDetail);

}
