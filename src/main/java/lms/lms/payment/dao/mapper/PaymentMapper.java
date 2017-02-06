package lms.lms.payment.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lms.lms.common.domain.Payment;

public interface PaymentMapper {
	
	//결제관리 리스트 출력
	List<Payment> paymentList();
	
	//결제 정보 추가
	int paymentInsert(Payment payment);

}
