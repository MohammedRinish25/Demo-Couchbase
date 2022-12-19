package com.example.demo.service;



import java.util.List;

import com.example.demo.model.Student;

public interface IStudentService {
	

	Student save(Student student);

	List<Student> findAll();

}
