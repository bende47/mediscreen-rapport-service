package com.mediscreen.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Declencheurs {
	
	@Id
	private String id;
	private String libelle;
	private Date dateCreation;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation != null ? (Date) dateCreation.clone() : null;
	}
	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation!= null ? (Date) dateCreation.clone() : null;
	}
	/**
	 * 
	 */
	public Declencheurs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param libelle
	 */
	public Declencheurs(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	@Override
	public String toString() {
		return "Declencheurs [id=" + id + ", libelle=" + libelle + ", dateCreation=" + dateCreation + "]";
	}	
	
	
	
	
}
