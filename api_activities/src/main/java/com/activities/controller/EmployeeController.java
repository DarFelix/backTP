package com.activities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.activities.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PutMapping("/attempts/{idEmployee}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateAttempts(@PathVariable int idEmployee) {
		employeeService.updateAttempts(idEmployee);
	}
}
