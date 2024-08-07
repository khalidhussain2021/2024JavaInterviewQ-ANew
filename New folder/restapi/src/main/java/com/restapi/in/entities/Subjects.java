package com.restapi.in.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Subjects {

	@Id
	@GeneratedValue
	private long sid;
	
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
}
