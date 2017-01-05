package lms.lms.common.domain;

public class Seat {
/*
 	SEAT_NO 		NUMBER,  	좌석번호 
	SEAT_CHECK 		NUMBER,  	입실유무
*/
	private int seatNo;
	private int userNo;
	private int attendanceNo;
	private int seatCheck;
	
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getAttendanceNo() {
		return attendanceNo;
	}
	public void setAttendanceNo(int attendanceNo) {
		this.attendanceNo = attendanceNo;
	}
	public int getSeatCheck() {
		return seatCheck;
	}
	public void setSeatCheck(int seatCheck) {
		this.seatCheck = seatCheck;
	}
	
}
