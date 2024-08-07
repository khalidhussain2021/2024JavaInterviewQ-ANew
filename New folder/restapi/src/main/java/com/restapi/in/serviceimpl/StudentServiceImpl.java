package com.restapi.in.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.in.entities.Student;
import com.restapi.in.repositories.StudentRepository;
import com.restapi.in.services.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student update(Student student,Long id) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteById(Long id) {
		studentRepository.deleteById(id);
	}

}
