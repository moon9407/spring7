package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 모든 url 주소는 controller 주소로 들어오게됨.
public class FrontController {
	
	@Autowired
	Product product; // interface 타입으로 선언
	
	@GetMapping("/index") // url 주소 매핑 : http://localhost:8181/index
	public String index() {
		System.out.println("스프링 자동 di : "+product.getName());
		TV2 tv2 = new TV2();
		System.out.println("객체선언 : "+tv2.getName());
		
		Member member = new Member();
		member.setId("aaa");
		System.out.println(member.getId());
		member.setPw("1111");
		System.out.println(member.getPw());
		return "index"; // index.jsp
	}
	
	@GetMapping("/member") // url 주소 매핑 : http://localhost:8181/member
	public String member() {
		System.out.println("test member");
		return "member"; // member.jsp
	}

}
