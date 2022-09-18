package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class DemoController {

	
	@RequestMapping("/add")
public ModelAndView displayadd(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
int result=Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
mv.setViewName("display.jsp");
mv.addObject("sum",result);
return mv;		
	}
	
	@ResponseBody
	@RequestMapping("/sub")
public String displaysub(HttpServletRequest request,HttpServletResponse response) {
int result=Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
return "sub of the numbers are "+ result;		
	}
}

