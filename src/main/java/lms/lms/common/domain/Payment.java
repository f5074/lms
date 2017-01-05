package lms.lms.common.domain;

import java.sql.Date;

public class Payment {	

	private int paymentNo;
	private int userNo;
	private int seatNo;
	private Date paymentStart;
	private Date paymentEnd;
	private int paymentCost;
	private String paymentPlan;	
	private String paymentMemo;
	
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
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public Date getPaymentStart() {
		return paymentStart;
	}
	public void setPaymentStart(Date paymentStart) {
		this.paymentStart = paymentStart;
	}
	public Date getPaymentEnd() {
		return paymentEnd;
	}
	public void setPaymentEnd(Date paymentEnd) {
		this.paymentEnd = paymentEnd;
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
	public String getPaymentMemo() {
		return paymentMemo;
	}
	public void setPaymentMemo(String paymentMemo) {
		this.paymentMemo = paymentMemo;
	}
	
	
	

}
