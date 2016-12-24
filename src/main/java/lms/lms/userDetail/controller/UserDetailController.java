package lms.lms.userDetail.controller;

import java.util.List;

import lms.lms.common.domain.UserDetail;
import lms.lms.userDetail.service.UserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserDetailController {
	@Autowired private UserDetailService userDetailService;
		
	@RequestMapping("/userDetail")
	public String userDetail(Model model){
		List<UserDetail> userDetail = userDetailService.userDetailList();
		model.addAttribute("userDetail",userDetail);
		return "/userDetail/userDetail";
	}
	
		
		
	
}
