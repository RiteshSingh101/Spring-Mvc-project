package com.mca;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


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
		
//		System.out.println(user.getUsername());
//		System.out.println(user.getEmail());
//		System.out.println(user.getPhone());
//		System.out.println(user.getPwd());
		
		System.out.println(user);
		return "Success.jsp	";
	}
	
	@RequestMapping(value = "/send-data")
	public String sendDataUsingModel(Model model) {
		System.out.println("data send");
		
		String personName = "Ritesh";
		int age = 23;
	
		UserData user = new UserData("Hemat","ritesh@gmail.com","234566","");
		model.addAttribute("name",personName);
		model.addAttribute("age",age);
		model.addAttribute("user",user);
		return "display.jsp";
	}
	
	@RequestMapping(value = "send")
	public ModelAndView sendDataUsingMV() {
		System.out.println("Send");
		
		String personName = "Hritek";
		int age = 25;
		
		UserData user = new UserData("Hritek","hritek@gmail.com","123131","");
		
		ModelAndView mv = new ModelAndView("display.jsp");
		
		mv.addObject("name",personName);
		mv.addObject("age",age);
		mv.addObject("user",user);
		
//		mv.setViewName("display.jsp");
		
		return mv;
	}
}
