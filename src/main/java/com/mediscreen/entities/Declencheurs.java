package com.mediscreen.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Declencheurs {
	
	@Id
	private String id;
	private String libelle;
	private Date dateCreation;	
	
}
