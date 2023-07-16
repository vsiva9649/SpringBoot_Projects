package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface BookDB extends CrudRepository<Book, Integer> {
  @Transactional
    @Modifying
    @Query("update Book bk set bk.bname=?1,bk.aname=?2,bk.category=?3,bk.pname=?4,bk.edition=?5,bk.pages=?6 where bk.isbn=?7")
  void updateBook(String bname,String aname,
		  				String category,String pname,
		  				int edition,int pages,int isbn);
  

}