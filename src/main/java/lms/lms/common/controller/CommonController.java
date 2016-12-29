package lms.lms.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	
	@RequestMapping("/")
	public String home(){
		return "/index";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "/index";
	}
	
	 @RequestMapping("/android")
	    public String android(){
	        System.out.println("android");
	        return "/android";
	    }


}
