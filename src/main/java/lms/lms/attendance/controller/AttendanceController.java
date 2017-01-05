package lms.lms.attendance.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import lms.lms.attendance.service.AttendanceService;
import lms.lms.common.domain.Attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AttendanceController {
	@Autowired private AttendanceService attendanceService;
	
	//출석 목록보기
	@RequestMapping("/user/attendance")
	public String attendance(Model model){
		List<Attendance> attendance = attendanceService.attendanceList();
		model.addAttribute("attendance",attendance);
		return "/user/attendance/attendance";
	}
	
	//입실 시 입실 시간 추가 
	@RequestMapping("/user/attendanceInsert")
	public String attendanceInsert(HttpSession session, Model model){
		int userNo= Integer.parseInt((String)session.getAttribute("userNo"));
		attendanceService.checkInTime(userNo);	
		return "/index";	
	}
	
	
}
