package lms.lms.payment.service;

import java.util.List;

import lms.lms.common.domain.Payment;

public interface PaymentService {
	int paymentInsert(Payment payment);
	int paymentUpdate(Payment payment);
	int paymentDelete(Payment payment);
	List<Payment> paymentList();
	Payment paymentView(Payment payment);
}
