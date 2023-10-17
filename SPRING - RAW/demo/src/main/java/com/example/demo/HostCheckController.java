package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostCheckController {

	@GetMapping("/hostcheck")
	public String checkHost() {
		return "ok";
	}
	
}