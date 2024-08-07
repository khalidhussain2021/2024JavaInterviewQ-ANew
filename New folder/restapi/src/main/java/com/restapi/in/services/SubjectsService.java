package com.restapi.in.services;

import java.util.List;

import com.restapi.in.entities.Subjects;

public interface SubjectsService {


	public Subjects save(Subjects Subjects);
	
	public List<Subjects> getAllSubjects();
	
	public Subjects getSubjectsById(Long id);
	
	public Subjects update(Subjects subjects,Long id);
	
	public void deleteById(Long id);
}
