package lms.lms.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lms.lms.common.domain.Payment;
import lms.lms.payment.dao.PaymentDao;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired private PaymentDao paymentDao; 

	@Override
	public List<Payment> paymentList() {
		// TODO Auto-generated method stub
		return paymentDao.paymentList();
	}

	@Override
	public int paymentInsert(Payment payment) {
		// TODO Auto-generated method stub
		return paymentDao.paymentInsert(payment);
	}

}
