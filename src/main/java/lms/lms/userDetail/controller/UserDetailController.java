package lms.lms.userDetail.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import lms.lms.common.domain.Payment;
import lms.lms.common.domain.UserDetail;
import lms.lms.payment.service.PaymentService;
import lms.lms.userDetail.service.UserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserDetailController {
	@Autowired private UserDetailService userDetailService;
	@Autowired private PaymentService paymentService;
		
	@RequestMapping("/user/userDetail")
	public String userDetail(HttpServletRequest request,  Model model, String userName, String userPhone, String userSearch ){
			try {
				userName = request.getParameter("userSearch");			
				userName = new String(userName.getBytes("8859_1"), "utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		System.out.println(userName);
		
		List<UserDetail> userDetail = userDetailService.userDetailView2(userName,userPhone);
		model.addAttribute("userDetail",userDetail);
		return "/user/userDetail/userDetail";
	}
	
	@RequestMapping("/user/userDetailView")
	public String userDetailView(Model model, int userNo, String userPhone){
		
		List<UserDetail> userDetail = userDetailService.userDetailView(userNo, userPhone);
		model.addAttribute("userDetail",userDetail);
		return "/user/userDetail/userDetail";
	}
	
	@RequestMapping("/user/userDetail/userDetail")
	public String userDetail2(Model model){

		return "/user/userDetail/userDetail";
	}
		
	@RequestMapping(value="/user/userDetail/userDetailInsert", method=RequestMethod.POST)
	@ResponseBody
	public int userDetailInsert(Model model, UserDetail userDetail, Payment payment){
		
			String userName = userDetail.getUserName();
			String userPhone = userDetail.getUserPhone();
			//유저데이터 입력
			int userDetailInsert = userDetailService.userDetailInsert(userDetail);
			
			
			int userNoSearch = userDetailService.userNoSearch(userName, userPhone);
			
			payment.setUserNo(userNoSearch);
			
			//결제 데이터 입력
			int paymentInsert = paymentService.paymentInsert(payment);
			
			int res;
			
			if (userDetailInsert == 1 && paymentInsert == 1 ){
				res = 1;
				System.out.println("res=1");
			} else{
				res = 0;
				System.out.println("res=0");
			}

		return res;
	}
}
