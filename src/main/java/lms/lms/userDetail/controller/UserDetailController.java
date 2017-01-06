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
		
	@RequestMapping("/user/userDetail")
	public String userDetail(Model model){
		List<UserDetail> userDetail = userDetailService.userDetailList();
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
		
	@RequestMapping("/user/userDetail/userDetailInsert")
	public String userDetailInsert(Model model, UserDetail userDetail){
			
			userDetail.setUserId("user1");
			userDetail.setUserName("김삼번");
			userDetail.setUserPhone("01024245555");
			userDetail.setUserSchool("고척대");
			userDetail.setUserGrade("2학년");
			userDetail.setUserAddress("구로구 고척동 하이시티 byc 1505-가호");
			userDetail.setUserParentPhone("01044245074");

			int userDetailInsert = userDetailService.userDetailInsert(userDetail);
			System.out.println(userDetailInsert);
			model.addAttribute("userDetailInsert",userDetailInsert);
		return "/index";
	}
}
