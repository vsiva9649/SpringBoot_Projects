package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	// http://localhost:8080/sk
	@RequestMapping("sk")
	  public ModelAndView index(@RequestParam("name") String st)
	  {
	    ModelAndView mv = new ModelAndView(); 
	    mv.addObject("username", st);
	    mv.setViewName("siva.jsp");
	    return mv; 
//	    System.out.println("*** "+ st + " *** ");
//	    return "siva.jsp";
	  }

}
