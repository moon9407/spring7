package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FController {
	
	@GetMapping("/") //django에서 urlpatterns = [path('', views.index, name='index')]랑 같음
	public String index() { // index() 함수는 장고에서 views.index랑 같음
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
}
