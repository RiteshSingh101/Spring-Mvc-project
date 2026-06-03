package com.mca;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestConroller {
	
	@RequestMapping("/greet")
	public String greet() {
		System.out.println("Good Afternoon mca");
		return "hello.jsp";
	}
	
	@RequestMapping("/msg")
	public String msg() {
		System.out.println("Wlc to spring mvc");
		return "register.jsp";
	}
	
	@RequestMapping(value="/register", method= RequestMethod.POST)
	public String registerData(UserData user) {
		
		System.out.println(user.getUsername());
		System.out.println(user.getEmail());
		System.out.println(user.getPhone());
		System.out.println(user.getPwd());
		
		//System.out.println(user);
		return "Success.jsp	";
	}
}
