package com.example.restfullapi.controllers;

import javax.print.attribute.SetOfIntegerSyntax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfullapi.dao.EmpRegis;
import com.example.restfullapi.entities.Emp;
@ComponentScan("com.example.restfullapi.dao")
@RestController
public class MyControllers {
	
	@Autowired
	EmpRegis empRegis;
	
	@GetMapping("/")
	public String temp() {
		return "this is the hello spring boot tutorial!";
	}
	
	@PostMapping("/send")
	public String sending(@RequestBody Emp emp) {
		Emp e=new Emp();
	     e.setName(emp.getName());
	     empRegis.save(e);
		return "sending process done!";
	}

}
