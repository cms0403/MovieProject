package com.proejct2.movieproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class MovieController {

	@GetMapping("/movieComment")
	public void movieComment() {
		
	}
	
	@GetMapping("/movieDetail")
	public void movieDetail() {
		
	}
	
	@GetMapping("/movieList")
	public void movieList() {
		
	}
}
