package lms.lms.common.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommonController {
	
	private Logger logger =  Logger.getLogger(CommonController.class);
	
	@RequestMapping("/")
	public String home(){
		return "/index";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "/index";
	}
	
	//로그아웃
	@RequestMapping(value="/logout",method = RequestMethod.POST)
	@ResponseBody
	public String logout(HttpSession session){
		
		logger.debug(session.getAttribute("sid") + " 로그아웃");
		session.invalidate();
		return "/index";
	}
}
