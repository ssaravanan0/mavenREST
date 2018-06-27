package com.saran.rest.controller;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MyController {
	
	@GetMapping(value= "/wish", produces= { MediaType.APPLICATION_JSON_VALUE })
	public String getAllArticles() {
		return "This is the ultimatix workstation";
	}
}
