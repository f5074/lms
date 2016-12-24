package lms.lms.payment.dao;

import java.util.List;

import lms.lms.common.domain.Payment;

public interface PaymentDao {
	int paymentInsert(Payment payment);
	int paymentUpdate(Payment payment);
	int paymentDelete(Payment payment);
	List<Payment> paymentList();
	Payment paymentView(Payment payment);
}
