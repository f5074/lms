package lms.lms.payment.controller;

import java.util.List;

import lms.lms.common.domain.Payment;
import lms.lms.payment.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PaymentController {
	@Autowired private PaymentService paymentService;
	
	//결제목록보기
/*	@RequestMapping("/user/payment/paymentView")
	public String payment(Model model){
		List<Payment> payment = paymentService.paymentList();
		model.addAttribute("payment", payment);
		return "/user/payment/paymentView";
	}*/
	
	@RequestMapping(value="/user/payment/paymentView", method=RequestMethod.GET)
	@ResponseBody
	public List<Payment> paymentList(){
		return paymentService.paymentList();
	}
	
	
	
}
