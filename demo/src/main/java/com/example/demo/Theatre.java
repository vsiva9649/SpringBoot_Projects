package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Theatre {
	@Autowired
	private Viewer v;
	
	public void watch()
	  {
		v.payAndWatch();
	    System.out.println("Watching Movies");
	  }
}
