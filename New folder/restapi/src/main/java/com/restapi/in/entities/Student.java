package com.restapi.in.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	
	private String city;
	
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
	private List<Subjects> subjects;
}
