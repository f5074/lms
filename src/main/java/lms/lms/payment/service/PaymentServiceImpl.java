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
	public int paymentInsert(Payment payment) {
		// TODO Auto-generated method stub
		return paymentDao.paymentInsert(payment);
	}

	@Override
	public int paymentUpdate(Payment payment) {
		// TODO Auto-generated method stub
		return paymentDao.paymentUpdate(payment);
	}

	@Override
	public int paymentDelete(Payment payment) {
		// TODO Auto-generated method stub
		return paymentDao.paymentDelete(payment);
	}

	@Override
	public List<Payment> paymentList() {
		// TODO Auto-generated method stub
		return paymentDao.paymentList();
	}

	@Override
	public Payment paymentView(Payment payment) {
		// TODO Auto-generated method stub
		return paymentDao.paymentView(payment);
	}

}
