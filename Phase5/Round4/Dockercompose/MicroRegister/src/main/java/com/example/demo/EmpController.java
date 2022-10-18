package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
@Autowired
EmpRepo repo;
Logger log=Logger.getAnonymousLogger();
@ResponseBody
@RequestMapping("/register-user/{user}/{password}/{email}")
public String registermicroservicelogic(HttpServletRequest request,HttpServletResponse response,@PathVariable("user") String user,@PathVariable("password") String password,@PathVariable("email") String email) {
	log.info("inside register ms ");
	Employee e=new Employee();
	e.setEmail(email);
	e.setPassword(password);
	e.setUser(user);
	Employee ee=repo.save(e);
	if(ee!=null) {
		return "registered successfully";
	}
	else {
		return "not registered";
	}
	}
}
