package lms.lms.common.domain;

public class UserDetail {
/*	
  	USER_NO 		NUMBER, 	 	 회원번호 
	USER_ID 		VARCHAR2(20),	 아이디 
	USER_NAME 		VARCHAR2(20), 	 성명 
	USER_HOMENUMBER VARCHAR2(50), 	 연락처_집 
	USER_PHONE 		VARCHAR2(50), 	 연락처_휴대폰 
	USER_SCHOOL 	VARCHAR2(20), 	 학교명(소속) 
	USER_GRADE 		NUMBER, 		 학년 
	USER_ADDRESS 	VARCHAR2(50) 	 주소 
*/
	private int userNo;
	private String userId;
	private String userName;
	private String userHomeNumber;
	private String userPhone;
	private String userSchool;
	private String userGrade;
	private String userAddress;
	private String userParentPhone;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserHomeNumber() {
		return userHomeNumber;
	}
	public void setUserHomeNumber(String userHomeNumber) {
		this.userHomeNumber = userHomeNumber;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserSchool() {
		return userSchool;
	}
	public void setUserSchool(String userSchool) {
		this.userSchool = userSchool;
	}
	public String getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserParentPhone() {
		return userParentPhone;
	}
	public void setUserParentPhone(String userParentPhone) {
		this.userParentPhone = userParentPhone;
	}


	
	
}
