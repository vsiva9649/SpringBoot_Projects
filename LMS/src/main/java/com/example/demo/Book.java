package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Book {
private String bname;
private String aname;
private String category;
private String pname;
private int edition;
private int pages;
@Id
private int isbn;
public String getBname() {
  return bname;
}
public void setBname(String bname) {
  this.bname = bname;
}
public String getAname() {
  return aname;
}
public void setAname(String aname) {
  this.aname = aname;
}
public String getCategory() {
  return category;
}
public void setCategory(String category) {
  this.category = category;
}
public String getPname() {
  return pname;
}
public void setPname(String pname) {
  this.pname = pname;
}
public int getEdition() {
  return edition;
}
public void setEdition(int edition) {
  this.edition = edition;
}
public int getPages() {
  return pages;
}
public void setPages(int pages) {
  this.pages = pages;
}
public int getIsbn() {
  return isbn;
}
public void setIsbn(int isbn) {
  this.isbn = isbn;
}


}