package lms.lms.payment.service;

import java.util.List;

import lms.lms.common.domain.Payment;

public interface PaymentService {
	//결제관리 리스트 출력
	List<Payment> paymentList();
	
	//결제 정보 추가
	int paymentInsert(Payment payment);
}
