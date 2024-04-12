
 package com.springboot.app.repository;
  
 import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.entities.Student;
 
 public interface Studentrepo extends JpaRepository<Student, Integer>{
  
  }
