package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@GetMapping("api_demo")
	  public ResponseEntity<Book> display(@RequestBody Book book)
	  {
		
		System.out.println(book.getAuthorName());
		System.out.println(book.getPages());
		//logic :
		
		if(book.getPages()>=100)
		
	    return new ResponseEntity("book not found",HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity("you can lend the book",HttpStatus.ACCEPTED);
	  }

}
