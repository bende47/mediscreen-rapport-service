package com.mediscreen.service;


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
	 * @param rapport
	 * @return Rapport patient a partir de l'id patient
	 */
	public Rapport findRapportPatient(String  idPatient);


	void deleteRapportPatient(String idPatient);
	
}
