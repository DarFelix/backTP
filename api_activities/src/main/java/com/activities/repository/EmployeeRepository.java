package com.activities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.activities.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "{call update_attempts(:id)}", nativeQuery = true)
	void updateAttempts(@Param("id") int idEmployee);
}
