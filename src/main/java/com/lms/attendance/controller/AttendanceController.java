package com.lms.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lms.attendance.service.AttendanceService;
import com.lms.domain.Attendance;

@Controller
public class AttendanceController {
	@Autowired private AttendanceService attendanceService;
	
	//결제 목록보기
	@RequestMapping("attendance")
	public String attendance(Model model){
		List<Attendance> attendance = attendanceService.attendanceList();
		model.addAttribute("attendance",attendance);
		return "/attendance/attendance";
		
	}
	
	
	
}
