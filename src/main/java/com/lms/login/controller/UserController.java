package com.lms.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lms.domain.User;
import com.lms.login.service.UserService;

@Controller
public class UserController {
	@Autowired private UserService userService;
	
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
			model.addAttribute("msg", "일칳하는 회원정보 없음");
			return "/login";
		} else if(user.getUserId().equals("admin")){
			session.setAttribute("sid", user.getUserId());
			return "/login";
		} else {
			session.setAttribute("sid", user.getUserId());
			return "/login";
		}
	}
	
	

}
