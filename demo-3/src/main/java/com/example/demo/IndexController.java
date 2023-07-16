package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	// http://localhost:8080/std
	@Autowired
	StudentDB studentDB;
	
	ResponseEntity<Student> re;
	@GetMapping("std")
	  public ModelAndView index()
	  {
//		System.out.println("*** "+ st);
//		System.out.println(st.getStudentName());
//		System.out.println(st.getRollNo());
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("siva.jsp");
	    return mv; 
	  }
	//api
	@RequestMapping("api_learning")
	  public ResponseEntity<Student> api_data(@RequestBody Student st)
	  {
	    System.out.println(st.getStudentName());
	    ModelAndView mv = new ModelAndView(); 
	    mv.addObject("student", st);
	    mv.setViewName("mukilan.jsp");
//	    return new ResponseEntity(HttpStatus.INSUFFICIENT_STORAGE);
//	    return new ResponseEntity("Insufficient Balance",HttpStatus.INTERNAL_SERVER_ERROR);
	    return new ResponseEntity<Student>(st,HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	
	@GetMapping("addStudent") 
	  public ModelAndView add(Student stud)
	  {
		 System.out.println(  stud.getRollNo()); 
		  System.out.println(stud.getStudentName());
		  ModelAndView mv = new ModelAndView(); 
		  studentDB.save(stud);
		  mv.addObject("studentDetails", stud);
		  mv.setViewName("added.jsp");
		  return mv; 
	  }
	
	@GetMapping("deleteStudent")
	  public ModelAndView delete(Student stud)
	  {
	  System.out.println(  stud.getRollNo()); 
	  System.out.println(stud.getStudentName());
	  ModelAndView mv = new ModelAndView(); 
	  
	  studentDB.deleteById(stud.getRollNo());
	  mv.addObject("studentDetails", stud);
	  mv.setViewName("deleted.jsp");
	  return mv; 
	  }
	
	@GetMapping("updateStudent")
	  public ModelAndView update(Student stud)
	  {
	  ModelAndView mv = new ModelAndView(); 
	  studentDB.updateStudent(stud.getStudentName(), stud.getRollNo());
	  mv.addObject("studentDetails", stud);
	  mv.setViewName("updated.jsp");
	  return mv; 
	  }
	
	@GetMapping("viewStudent")
	  public ModelAndView display(Student stud)
	  {
	  Optional<Student> op = studentDB.findById(stud.getRollNo());
	  Student student  =     op.get();
	  
	  ModelAndView mv = new ModelAndView(); 
	  mv.addObject("studentDetails", student);
	  mv.setViewName("display.jsp");
	  return mv; 
	    
	  }

}
