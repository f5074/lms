package lms.lms.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import lms.lms.attendance.service.AttendanceService;
import lms.lms.common.domain.Attendance;
import lms.lms.common.domain.UserDetail;
import lms.lms.userDetail.service.UserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AndroidController {
	@Autowired private UserDetailService userDetailService;
	@Autowired private AttendanceService attendanceService;
	
	//안드로이드로 휴대폰뒷자리4자리 받고 입실데이터 받기
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
		result.put("data2", userDetail.get(0).getUserName());	
		result.put("data3", userDetail.get(0).getUserPhone());
		/*result.put("data4", userDetail.get(0).getUserParentNumber());*/
		
		return result;
	}
	
	//안드로이드로 입실데이터 받고 입실 시키기
	@RequestMapping("/android4")
	@ResponseBody
	public Map<String, String> androidTestWithRequestAndResponse2(HttpServletRequest request) {
		System.out.println(request.getParameter("userNo"));
		System.out.println(request.getParameter("userPhone"));

		int userNo = Integer.parseInt(request.getParameter("userNo"));
		int userPhone = Integer.parseInt(request.getParameter("userPhone"));
		
		//입실 입력 후 입실시간 입력
		attendanceService.checkInTime(userNo);
		
		//입실문자체크가 0일때 1로 변경
/*		attendanceService.checkInSMS(userNo);*/
		
		//입실한 정보 가져오기
		List<Attendance> checkINSMS2 = attendanceService.checkInSMS2(userNo);
		
		
		
		Map<String, String> result = new HashMap<String, String>();
		
		   for (int i = 0; i<checkINSMS2.size(); i++) {
	            System.out.println(i + " : " + checkINSMS2.get(i).getUserNo());
	        }
		
		result.put("data1", String.valueOf(checkINSMS2.get(0).getUserNo()));
		result.put("data2", checkINSMS2.get(0).getCheckInSMS());	
		
		return result;
	}

}
