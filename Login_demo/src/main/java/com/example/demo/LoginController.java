package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
  
	// http://localhost:8080/test 

	
	@RequestMapping("test")
//	  public ModelAndView index(@RequestParam("name") String st)
	  public ModelAndView index()
	  {
	    ModelAndView mv = new ModelAndView(); 
//	    mv.addObject("username", st);
	    mv.setViewName("Login.html");
	    return mv; 
	  }
  
	  @RequestMapping("/login")
	    public ModelAndView add(Password test)
	    {
	    System.out.println(test.getUsername()); 
	    System.out.println(test.getPassword());
	    ModelAndView mv = new ModelAndView(); 
	    mv.addObject("/login", test);
	    mv.setViewName("Loginchecker.jsp");
	    return mv; 
	    }
 
  

  

  
}