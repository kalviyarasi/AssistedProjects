package com.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Reg;
import com.demo.RegDAO;
import com.demo.RegRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegController {
	@Autowired 
	RegDAO dao;
	@Autowired
	RegRepo repo;

	@RequestMapping("/")
	public ModelAndView Ftpage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Register.html");
		return mv;
		
	}
	@RequestMapping("/Register")
	public ModelAndView userRegister(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Reg r=new Reg();
		r.setUsername(request.getParameter("username"));
		r.setPassword(request.getParameter("pass"));
		r.setEmail(request.getParameter("email"));
		Reg rg=dao.insert(r);
		if(rg!=null) {
			mv.setViewName("Login.html");
		}

		return mv; 
		
		
		
	}
	@RequestMapping("/Login")
	public ModelAndView userLogin(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String user= request.getParameter("username");
		if((repo.findByName(user)!=null)&&(repo.findBypassword(request.getParameter("pass"))!=null)) {
		if(repo.findByName(user).equals(repo.findBypassword(request.getParameter("pass"))))
		{
			mv.setViewName("done.html");
		}
		}
		else {
			mv.setViewName("log.html");
		}
		
		return mv;

	}
}
