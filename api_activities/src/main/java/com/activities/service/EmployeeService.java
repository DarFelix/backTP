package com.activities.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activities.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public void updateAttempts(int idEmployee) {
		employeeRepository.updateAttempts(idEmployee);
	}

}
