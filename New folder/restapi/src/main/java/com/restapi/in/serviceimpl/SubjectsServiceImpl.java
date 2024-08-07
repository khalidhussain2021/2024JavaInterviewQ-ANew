package com.restapi.in.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.in.entities.Subjects;
import com.restapi.in.repositories.SubjectsRepository;
import com.restapi.in.services.SubjectsService;

@Service
public class SubjectsServiceImpl implements SubjectsService{

	@Autowired
	private SubjectsRepository subRepository;
	@Override
	public Subjects save(Subjects subjects) {
		return subRepository.save(subjects);
	}

	@Override
	public List<Subjects> getAllSubjects() {
		return subRepository.findAll();
	}

	@Override
	public Subjects getSubjectsById(Long id) {
		return subRepository.findById(id).get();
	}

	@Override
	public Subjects update(Subjects subjects, Long id) {
		return subRepository.save(subjects);
	}

	@Override
	public void deleteById(Long id) {
		subRepository.deleteById(id);		
	}

}
