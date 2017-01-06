package lms.lms.userDetail.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lms.lms.common.domain.UserDetail;

public interface UserDetailService {

	//회원관리 리스트 출력
	List<UserDetail> userDetailList();

	// 안드로이드에서 받은 전화번호로 유저정보받아오기 
	List<UserDetail> sendSMS(@Param("userNo") int userNo, @Param("userPhone") String userPhone);
	
	//회원넘버로 회원정보 받기
	List<UserDetail> userDetailView(@Param("userNo") int userNo, @Param("userPhone") String userPhone);
	
	//회원정보 추가하기
	int userDetailInsert(UserDetail userDetail);

}
