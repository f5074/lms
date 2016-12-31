package lms.lms.userDetail.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lms.lms.common.domain.UserDetail;

public interface UserDetailMapper {
	int userDetailInsert(UserDetail userDetail);
	int userDetailUpddate(UserDetail userDetail);
	int userDetailDelete(UserDetail userDetail);
	List<UserDetail> userDetailList();
	UserDetail userDetailView(UserDetail userDetail);
	// 안드로이드에서 받은 전화번호로 유저정보받아오기 
	List<UserDetail> sendSMS(@Param("userNo") int userNo, @Param("userPhone") int userPhone);

}
