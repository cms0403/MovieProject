package com.proejct2.movieproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/userLogin")
	public String userLogin() {
		
		return "user/userLogin";
	}
	
	@GetMapping("/userRegist")
	public String userRegist() {
		
		return "user/userRegist";
	}
	
	@GetMapping("/userMypage")
	public String userMypage() {
		
		return "user/userMypage";
	}
	
	@GetMapping("/userQnaRegist")
	public String userQnaRegist() {
		
		return "user/userQnaRegist";
	}
}
