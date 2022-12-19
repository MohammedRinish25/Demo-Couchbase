package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{
	
	   @Autowired
	   private StudentRepository repository;

		@Override
		public Student save(Student student) {
			return repository.save(student);
		}

		@Override
		public List<Student> findAll() {
			
			return repository.findAll();
		}

//	    //save new employee in the couchbase
//	    public void save(Student student) {
//	        repository.save(student);
//	    }
//
//	   
//
//	    //get all employees from the couchbase
//	    public List<Student> getEmployees() {
//	       
//	    	return repository.findAll();
//	    	//Iterable<Student> studentIterable = repository.findAll();
//	       // return StreamSupport.stream(studentIterable.spliterator(), false).collect(Collectors.toList());
//	    }
//


		


}
