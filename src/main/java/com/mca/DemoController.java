package com.mca;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/fetch")
	public String fetch(@RequestParam(name = "pname") String name,
			@RequestParam(required = false, defaultValue = "20") Integer age) {
		System.out.println(name);
		System.out.println(age);
		return name+" ,"+age;
	}
	
	@PostMapping("/save")
	public UserData save(@RequestBody UserData user) {
		System.out.println(user);
		return user;
	}
	
	@PutMapping("/update/{name}/{age}")
	public String update(@PathVariable String name, @PathVariable int age) {
		System.out.println(name);
		System.out.println(age);
		return name + " , " + age;
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String name,@RequestHeader int age) {
		System.out.println(name);
		System.out.println(age);
		return name+" , "+age;
	}
}
