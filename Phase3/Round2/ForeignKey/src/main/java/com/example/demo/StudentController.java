package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired
	StudentRepo repo;
	
@GetMapping("/student/{id}")
public Student getbystudentid(@PathVariable int id) {
	return repo.findById(id).get();
}
@PostMapping("/insert")
public Student createStudent(@RequestBody Student s) {
	Passport passport=new Passport();
	passport.setId(1);
	passport.setNumber("DXSP123");
	passport.setStudent(s);
	s.setPassport(passport);
	return repo.save(s);
}
	
}

