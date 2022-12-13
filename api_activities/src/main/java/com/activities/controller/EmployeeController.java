package com.activities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.activities.domain.Employee;
import com.activities.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PutMapping("/attempts/{idEmployee}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateAttempts(@PathVariable int idEmployee) {
		employeeService.updateAttempts(idEmployee);
	}

	@GetMapping("/{idEmployee}")
	public ResponseEntity<?> findEmployee(@PathVariable int idEmployee) throws Exception {
		try {
			Employee employee = employeeService.findEmployee(idEmployee);
			if(employee != null) {
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
			}else {
			return new ResponseEntity<Object>(employee, HttpStatus.NO_CONTENT);	
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
