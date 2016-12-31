package lms.lms.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import lms.lms.common.domain.UserDetail;
import lms.lms.userDetail.service.UserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AndroidController {
	@Autowired private UserDetailService userDetailService;
	
	@RequestMapping("/android3")
	@ResponseBody
	public Map<String, String> androidTestWithRequestAndResponse(HttpServletRequest request) {
		System.out.println(request.getParameter("userNo"));
		System.out.println(request.getParameter("userPhone"));

		int userNo = Integer.parseInt(request.getParameter("userNo"));
		int userPhone = Integer.parseInt(request.getParameter("userPhone"));
		
		List<UserDetail> userDetail = userDetailService.sendSMS(userNo, userPhone);
		
		Map<String, String> result = new HashMap<String, String>();
		
		   for (int i = 0; i<userDetail.size(); i++) {
	            System.out.println(i + " : " + userDetail.get(i).getUserPhone());
	        }
		
		result.put("data1", String.valueOf(userDetail.get(0).getUserNo()));
		result.put("data2", userDetail.get(0).getUserPhone());	
		
		return result;
	}

}
