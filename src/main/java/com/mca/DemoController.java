package com.mca;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/fetch")
	
	public String fetch() {
		return "Data fethed";
	}
	
	@PostMapping("/save")
	public String save() {
		
		return "data saved";
	}
	
	@PutMapping("/update")
	public String update() {
		
		return "data saved";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "delete data";
	}
}
