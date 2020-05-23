package com.mediscreen.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mediscreen.entities.Declencheurs;
import com.mediscreen.entities.Rapport;
import com.mediscreen.service.DeclencheursService;
import com.mediscreen.service.RapportService;


@RestController
public class RapportController {

	@Autowired
	private DeclencheursService declencheursService;
	
	@Autowired
	private RapportService rapportService;
	
	/**
	 * Methode permettant d'ajouter un rapport
	 * @throws ParseException 
	 */
	
	@PostMapping(value="addRapport/add")
	public Rapport addRapport(@RequestBody Rapport rapport) {
		return rapportService.add(rapport);
	}
	
	/**
	 * Methode permettant d'afficher la liste des rapports d'un patient
	 */
	
	@GetMapping(value="rapport/all/{id}")
	public List<Rapport> all(@PathVariable("id") String id) {
		return rapportService.allRapportPatient(id);
	}
	
	/**
	 * Methode permettant de rechercher un rapport
	 */
	
	@GetMapping(value="rapport/find/{id}")
	public Rapport findRapport(@PathVariable("id") String id) {
		return  rapportService.findRapportPatient(id);
	}
	
	
	/**
	 * Methode permettant d'ajouter un declencheur
	 * @throws ParseException 
	 */
	
	@PostMapping(value="declencheur/add")
	public Declencheurs add(@RequestBody Declencheurs declencheurs) {
		return declencheursService.add(declencheurs);
	}
	
	/**
	 * Methode permettant de rechercher un declencheur
	 */
	
	@GetMapping(value="declencheur/find/{id}")
	public Declencheurs find(@PathVariable("id") String id) {
		return declencheursService.find(id);
	}
	
	/**
	 * Methode permettant d'afficher la liste des declencheurs
	 */
	
	@GetMapping(value="declencheur/all")
	public List<Declencheurs> all() {
		return declencheursService.all();
	}
	
	/**
	 * Methode permettant de modifier le libellé 
	 */
	
	@PutMapping(value="declencheur/update/{id}")
	public Declencheurs update(@RequestBody Declencheurs declencheurs,@PathVariable("id") String id) {
		return declencheursService.update(declencheurs, id);
	}
	
	/**
	 * Methode permettant de supprimer un declencheur
	 */
	
	@DeleteMapping(value="declencheur/delete/{id}")
	public void delete(@PathVariable("id") String id) {
		 declencheursService.delete(id);
	}
	
	
}
