package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpRepo extends JpaRepository<Employee, String>{

	@Query("select employee from Employee employee where employee.user=?1")
	public Employee findByuser(String name);
	
	@Query("select employee from Employee employee where employee.password=?1")
	public Employee findBypassword(String name);
	
}
