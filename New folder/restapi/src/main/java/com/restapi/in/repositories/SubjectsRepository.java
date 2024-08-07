package com.restapi.in.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.in.entities.Subjects;
@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Long> {

}
