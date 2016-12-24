package lms.lms.common.domain;

import java.sql.Date;

public class Payment {	
/*
 	PAYMENT_NO 		NUMBER, 		결제번호 
	USER_NO 		NUMBER, 		회원번호 
	SEAT_NUMBER 	NUMBER, 		좌석번호 
	STARTING_DATE	DATE, 			등록시작일 
	ENDING_DATE 	DATE, 			등록종료일 
	PAYMENT_COST 	NUMBER, 		이용요금 
	PAYMENT_PLAN 	VARCHAR2(20) 	결제방식 
*/
	private int paymentNo;
	private int userNo;
	private int seatNumber;
	private Date startingDate;
	private Date endingDate;
	private int paymentCost;
	private String paymentPlan;	
	
	public int getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Date getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	public Date getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	public int getPaymentCost() {
		return paymentCost;
	}
	public void setPaymentCost(int paymentCost) {
		this.paymentCost = paymentCost;
	}
	public String getPaymentPlan() {
		return paymentPlan;
	}
	public void setPaymentPlan(String paymentPlan) {
		this.paymentPlan = paymentPlan;
	}
}
