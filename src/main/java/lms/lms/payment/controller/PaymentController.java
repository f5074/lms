package lms.lms.payment.controller;

import java.util.List;

import lms.lms.common.domain.Payment;
import lms.lms.payment.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {
	@Autowired private PaymentService paymentService;
	
	//결제목록보기
	@RequestMapping("/payment")
	public String payment(Model model){
		List<Payment> payment = paymentService.paymentList();
		model.addAttribute("payment", payment);
		return "/payment/payment";
	}
	
}
