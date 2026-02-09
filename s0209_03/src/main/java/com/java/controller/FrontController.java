package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
	
	@GetMapping("/") //장고에서 urlpatterns = [path('', views.index, name='index')]랑 같음
	public String index() { // index() 함수는 장고에서 views.index랑 같음
		return "index";
	}

}
