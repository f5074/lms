package lms.lms.common.domain;

import java.sql.Date;

public class Attendance {
/*
  	ATTENDANCE_NO 	NUMBER, 입퇴실번호 
	USER_NO 		NUMBER, 회원번호 
	CHECKIN_TIME 	DATE,  	입실시간 
	CHECKOUT_TIME 	DATE, 	퇴실시간 
	
*/
	private int attendanceNo;
	private int userNo;
	private Date checkInTime;
	private Date checkOutTime;
	private String checkInSMS;
	private String checkOutSMS;
	
	public int getAttendanceNo() {
		return attendanceNo;
	}
	public void setAttendanceNo(int attendanceNo) {
		this.attendanceNo = attendanceNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public Date getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}
	public Date getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(Date checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public String getCheckInSMS() {
		return checkInSMS;
	}
	public void setCheckInSMS(String checkInSMS) {
		this.checkInSMS = checkInSMS;
	}
	public String getCheckOutSMS() {
		return checkOutSMS;
	}
	public void setCheckOutSMS(String checkOutSMS) {
		this.checkOutSMS = checkOutSMS;
	}
	
	
}
