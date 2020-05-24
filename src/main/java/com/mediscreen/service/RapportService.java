package com.mediscreen.service;

import java.util.List;

import com.mediscreen.entities.Rapport;

public interface RapportService {

	/**
	 * 
	 * @param rapport
	 * @return Rapport patient
	 */
	public Rapport add(String idPatient,int age, String risque);
	
	/**
	 * 
	 * @param idPatient
	 * @return liste des rapports d'un patient
	 */
	public List<Rapport> allRapportPatient(String idPatient);
	
	
	/**
	 * 
	 * @param rapport
	 * @return Rapport patient a partir de l'id patient
	 */
	public Rapport findRapportPatient(String  idPatient);
	
}
