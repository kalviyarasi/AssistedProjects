package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

	@Autowired
	EmpRepo repo;
	Logger log=Logger.getAnonymousLogger();
	
	@RequestMapping("/")
	public ModelAndView loadpage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login.jsp");
		log.info("login page loaded ");
		return mv;
		
	}
	
	
	@RequestMapping("/login")
	public ModelAndView checklogin(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String user= request.getParameter("user");
		if((repo.findByuser(user)!=null)&&(repo.findBypassword(request.getParameter("pwd"))!=null)) {
		if(repo.findByuser(user).equals(repo.findBypassword(request.getParameter("pwd"))))
		{
			mv.setViewName("display.jsp");
			mv.addObject("userid",user);
		}
		}
		else {
			mv.setViewName("fail.jsp");
		}
		
		return mv;
		
	}
	
	RestTemplate rest=new RestTemplate();
	@ResponseBody
		@RequestMapping("/registermslogic")
		public String registerms(HttpServletRequest request,HttpServletResponse response) {
			//ModelAndView mv=new ModelAndView();
			String user=request.getParameter("user");
			String password=request.getParameter("pwd");
			String email=request.getParameter("email");
			String url="http://final2:8082/register-user/"+user+"/"+password+"/"+email;
			log.info(url);
			rest.getForObject(url,String.class);
			return "registered";
			
		}

	
	
}
