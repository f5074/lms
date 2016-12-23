package lms.lms.attendance.controller;

import java.util.List;

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
	@RequestMapping("/attendance")
	public String attendance(Model model){
		List<Attendance> attendance = attendanceService.attendanceList();
		model.addAttribute("attendance",attendance);
		return "/attendance/attendance";
		
	}
	
	
	
}
