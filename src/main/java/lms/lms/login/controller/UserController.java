package lms.lms.login.controller;

import javax.servlet.http.HttpSession;

import lms.lms.attendance.service.AttendanceService;
import lms.lms.common.domain.Attendance;
import lms.lms.common.domain.User;
import lms.lms.login.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@Autowired private UserService userService;
	@Autowired private AttendanceService attendanceService;
	
	@RequestMapping("/")
	public String home(){
		return "/index";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "/index";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String getUser(User user, HttpSession session, Model model){
		user = userService.loginCheck(user);
		if(user == null){
			model.addAttribute("msg", "일치하는 회원정보 없음");
			return "/login";
		} else if(user.getUserId().equals("admin")){
			session.setAttribute("sid", user.getUserId());
			return "/login";
		} else {
			session.setAttribute("sid", user.getUserId());
			String userId= user.getUserId();
			attendanceService.attendanceInsert(userId);
			return "/login";
		}
	}
	
	

}
