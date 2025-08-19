package com.example.project01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ProjectController {
	@RequestMapping("")
	public String home() {
		return "메인화면입니다.";
	}
	
}
