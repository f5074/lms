package lms.lms.payment.dao;

import java.util.List;

import lms.lms.common.domain.Payment;

public interface PaymentDao {
	//결제관리 리스트 출력
	List<Payment> paymentList();
}
