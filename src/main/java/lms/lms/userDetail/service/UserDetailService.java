package lms.lms.userDetail.service;

import java.util.List;

import lms.lms.common.domain.UserDetail;

public interface UserDetailService {
	int userDetailInsert(UserDetail userDetail);
	int userDetailUpddate(UserDetail userDetail);
	int userDetailDelete(UserDetail userDetail);
	List<UserDetail> userDetailList();
	UserDetail userDetailView(UserDetail userDetail);

}
