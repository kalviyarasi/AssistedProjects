package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
@Autowired
	EmployeeDAO dao;

@RequestMapping("/")
public ModelAndView intializerpage(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("index.jsp");
	return mv;
}

@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEmpname(request.getParameter("empname"));
		e.setPhono(request.getParameter("empphono"));
		e.setAge(Integer.parseInt(request.getParameter("empage")));
		Employee ep=dao.insert(e);
		if(ep!=null) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}
	

@RequestMapping("/getall")
public ModelAndView retrieve(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	List<Employee> list=dao.getall();
	mv.setViewName("displayresu.jsp");
	mv.addObject("list",list);
	return mv;
}
	
@RequestMapping("/updateByName")
public ModelAndView update(HttpServletRequest request,HttpServletResponse reponse) {
	ModelAndView mv=new ModelAndView();
	Employee e=new Employee();
	e.setEmpname(request.getParameter("empname"));
	Employee ep=dao.updateByName(e);
	if(ep!=null) {
		System.out.println("Updation successful");
	}
	return mv;
}


@RequestMapping("/delete")
public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	dao.delete(Integer.parseInt(request.getParameter("empno")));
	return mv;
}
}

