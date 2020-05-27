package com.mediscreen.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mediscreen.entities.Declencheurs;

public interface DeclencheursRepository extends MongoRepository<Declencheurs, String>{
	@Query("{ 'libelle' : ?0 }")
	Declencheurs findByLibelle(String libelle);
	
	@Query("{ 'id' : ?0 }")
	Declencheurs findDeclencheurById(String id);
}
