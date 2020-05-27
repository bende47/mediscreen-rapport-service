package com.mediscreen.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Rapport {	
	@Id
	private String id;
	private String idPatient;
	private int age;
	private String risque;
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
	 * @return the idPatient
	 */
	public String getIdPatient() {
		return idPatient;
	}
	/**
	 * @param idPatient the idPatient to set
	 */
	public void setIdPatient(String idPatient) {
		this.idPatient = idPatient;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the risque
	 */
	public String getRisque() {
		return risque;
	}
	/**
	 * @param risque the risque to set
	 */
	public void setRisque(String risque) {
		this.risque = risque;
	}
	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation!= null ? (Date) dateCreation.clone() : null;
	}
	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation != null ? (Date) dateCreation.clone() : null;
	}
	/**
	 * 
	 */
	public Rapport() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idPatient
	 * @param age
	 * @param risque
	 */
	public Rapport(String idPatient, int age, String risque) {
		super();
		this.idPatient = idPatient;
		this.age = age;
		this.risque = risque;
	}
	
	@Override
	public String toString() {
		return "Rapport [id=" + id + ", idPatient=" + idPatient + ", age=" + age + ", risque=" + risque
				+ ", dateCreation=" + dateCreation + "]";
	}	
	
	
	
	
}
