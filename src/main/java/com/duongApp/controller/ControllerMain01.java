package com.duongApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.duongApp.entity.Student;
import com.duongApp.service.ReportingStudentService;

@Controller
public class ControllerMain01 {
	@Autowired
	ReportingStudentService reportingStudentService;
	
	@GetMapping("main01")
	public String welcomeMain01(Model model) {
		List<Student> result = reportingStudentService.getAllStudentByName("Adam");
		
		model.addAttribute("test01", "truyen sads");
		
		return "main01";
		
	}
	
	@GetMapping("login")
	public String login(Model model, @RequestParam(required = false, name = "error") String error) {
		if (error!=null) {
			model.addAttribute("isError", true);
		}
		
		return "login";
		
	}
}
