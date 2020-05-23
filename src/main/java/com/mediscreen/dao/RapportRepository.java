package com.mediscreen.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mediscreen.entities.Rapport;

@Repository
public interface RapportRepository extends MongoRepository<Rapport, String>{
	@Query("{ 'idPatient' : ?0 },{ 'risque' : ?0 }")
	Rapport findByRapportLibelle(String idPatient, String risque);
	
	@Query(value="{ idPatient : ?0 }", sort = "{id : -1}")
	List<Rapport> findRapportByOrderByIdDesc(String idpatient);
}
