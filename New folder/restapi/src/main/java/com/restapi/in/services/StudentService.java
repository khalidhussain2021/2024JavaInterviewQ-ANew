package com.restapi.in.services;

import java.util.List;

import com.restapi.in.entities.Student;

public interface StudentService {

	public Student save(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Long id);
	
	public Student update(Student student,Long id);
	
	public void deleteById(Long id);
}
