package lms.lms.login.controller;

import javax.servlet.http.HttpSession;

import lms.lms.common.domain.User;
import lms.lms.login.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@Autowired private LoginService userService;
	
	@RequestMapping("/login/login")
	public String login(Model model) {
		return "login/login";
	}
	
	@RequestMapping(value="/login/login", method=RequestMethod.POST)
	public String getUser(User user, HttpSession session, Model model){
		user = userService.loginCheck(user);
		if(user == null){
			model.addAttribute("msg", "일치하는 회원정보 없음");
			return "/login/login";
		} else if(user.getUserId().equals("admin")){
			session.setAttribute("sid", user.getUserId());
			return "/login/login";
		} else {
			session.setAttribute("sid", user.getUserId());
			return "/login/login";
		}
	}
	
	

}
