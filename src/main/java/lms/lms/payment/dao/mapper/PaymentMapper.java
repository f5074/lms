package lms.lms.payment.dao.mapper;

import java.util.List;

import lms.lms.common.domain.Payment;

public interface PaymentMapper {
	
	//결제관리 리스트 출력
	List<Payment> paymentList();

}
