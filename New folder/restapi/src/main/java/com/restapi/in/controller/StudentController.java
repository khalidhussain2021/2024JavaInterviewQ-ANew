package com.restapi.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.in.entities.Student;
import com.restapi.in.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		
		return studentService.save(student);
	}
	
	@GetMapping("/getAll")
	public  List<Student> getAllStudent(){
		return studentService.getAllStudent();
		}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id) {
		
		return studentService.getStudentById(id);
		
	}
	
	@PutMapping("/{id}")
	public Student update(@RequestBody Student student, @PathVariable   Long id) {
		  student.setId(id);
		  
		return studentService.save(student);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById( @PathVariable Long id) {
		studentService.deleteById(id);
	}
}
