package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	private String studentName; 
	@Id
	  private int rollNo; 
	  
	  public int getRollNo() {
	    return rollNo;
	  }
	  public void setRollNo(int rollNo) {
	    this.rollNo = rollNo;
	  }
	  public String getStudentName() {
	    return studentName;
	  }
	  public void setStudentName(String studentName) {
	    this.studentName = studentName;
	  }

}
