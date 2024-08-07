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

import com.restapi.in.entities.Subjects;
import com.restapi.in.services.SubjectsService;

@RestController
@RequestMapping("/subjects")
public class SubjectsController {

	
	@Autowired
	private SubjectsService subjectsService;
	
	@PostMapping("/save")
	public Subjects save(@RequestBody Subjects Subjects) {
		
		return subjectsService.save(Subjects);
	}
	
	@GetMapping("/getAll")
	public  List<Subjects> getAllSubjects(){
		return subjectsService.getAllSubjects();
		}
	
	@GetMapping("/{id}")
	public Subjects getSubjectsById(@PathVariable Long id) {
		
		return subjectsService.getSubjectsById(id);
		
	}
	
	@PutMapping("/{id}")
	public Subjects update(@RequestBody Subjects Subjects, @PathVariable   Long id) {
		  Subjects.setSid(id);
		  
		return subjectsService.save(Subjects);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById( @PathVariable Long id) {
		subjectsService.deleteById(id);
	}
	
}
