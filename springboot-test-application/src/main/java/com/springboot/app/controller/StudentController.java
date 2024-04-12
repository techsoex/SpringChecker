package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.entities.Student;
import com.springboot.app.repository.Studentrepo;
 
@RestController
public class StudentController {
	
	@Autowired
	Studentrepo repo;
	
	//get all the students 
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		List<Student> students= repo.findAll();
		return students;
	}

}
