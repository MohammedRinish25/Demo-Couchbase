package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

import com.example.demo.service.IStudentService;

@RestController
@RequestMapping("student-api")
public class StudentController {
	
	    @Autowired
	    private IStudentService studentService;
	    
	    @RequestMapping("/")
	    public String index() {
	        return "Welcome to the CRUD application!!";
	    }
	    
	    @PostMapping("/students")
	    public Student addStudent(@RequestBody Student student) {
	        return studentService.save(student);
	    }
	    
	    @GetMapping("/students")
	    public 	List<Student> getStudents() {
	         return studentService.findAll();
	        
	    }

}
