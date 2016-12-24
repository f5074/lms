package lms.lms.payment.dao;

import java.util.List;

import lms.lms.common.domain.Payment;
import lms.lms.payment.dao.mapper.PaymentMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDaoImpl implements PaymentDao{
	@Autowired private PaymentMapper paymentMapper;

	@Override
	public int paymentInsert(Payment payment) {
		// TODO Auto-generated method stub
		return paymentMapper.paymentInsert(payment);
	}

	@Override
	public int paymentUpdate(Payment payment) {
		// TODO Auto-generated method stub
		return paymentMapper.paymentUpdate(payment);
	}

	@Override
	public int paymentDelete(Payment payment) {
		// TODO Auto-generated method stub
		return paymentMapper.paymentDelete(payment);
	}

	@Override
	public List<Payment> paymentList() {
		// TODO Auto-generated method stub
		return paymentMapper.paymentList();
	}

	@Override
	public Payment paymentView(Payment payment) {
		// TODO Auto-generated method stub
		return paymentMapper.paymentView(payment);
	}

}
