package com.mediscreen.service;

import java.util.List;

import com.mediscreen.entities.Declencheurs;

public interface DeclencheursService {

	/**
	 * 
	 * @param declencheurs
	 * @return Declencheur ajouté
	 */
	public Declencheurs add(Declencheurs declencheurs);
	
	/**
	 * 
	 * @param declencheurs
	 * @param id
	 * @return Declencheur modifié
	 */
	public Declencheurs update(Declencheurs declencheurs,String id);
	
	/**
	 * 
	 * @param id
	 * @return Declencheur à partir de son id
	 */
	public Declencheurs find(String id);
	
	/**
	 * 
	 * @return La liste des declencheurs
	 */
	public List<Declencheurs> all();
	
	/**
	 * 
	 * @param id
	 * Supprimer un declencheur à partir de son id
	 */
	public void delete(String id);
}
