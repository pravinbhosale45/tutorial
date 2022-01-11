package com.microservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/")
	public String checkMVC() {
		return "login";
		
	}
	
	@RequestMapping("/Login")
	public String loginHomePage(@RequestParam("userName") String userName, 
	@RequestParam("password") String password,Model model){
		model.addAttribute("UserName", userName);
		return "HomePage";
	}	
   
}
