package lms.lms.userDetail.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lms.lms.common.domain.UserDetail;

public interface UserDetailDao {

	//회원관리 리스트 출력
	List<UserDetail> userDetailList();

	// 안드로이드에서 받은 전화번호로 유저정보받아오기 
	List<UserDetail> sendSMS(@Param("userNo") int userNo, @Param("userPhone") String userPhone);
	
	//회원넘버로 회원정보 받기
	List<UserDetail> userDetailView(@Param("userNo") int userNo, @Param("userPhone") String userPhone);
	
	//회원이름과 회원 연락처 로 회원정보 받기
	List<UserDetail> userDetailView2(@Param("userName") String userName, @Param("userPhone") String userPhone);
	
	//이름과 전화로 userNo찾기
	int userNoSearch(@Param("userName") String userName, @Param("userPhone") String userPhone);
	
	//회원정보 추가하기
	int userDetailInsert(UserDetail userDetail);

}
