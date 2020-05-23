package com.mediscreen.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediscreen.dao.RapportRepository;
import com.mediscreen.entities.Rapport;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RapportServiceImpl implements RapportService{
	
	@Autowired
	private RapportRepository rapportRepository;
	
	@Override
	public Rapport add(Rapport rapport) {
		try {
			
			Rapport rap = rapportRepository.findByRapportLibelle(rapport.getIdPatient(), rapport.getRisque());
			
			if(rap==null) {
				rapport.setDateCreation(new Date());
				return rapportRepository.save(rapport);
			}else {
				return null;
			}
			
		} catch (Exception e) {
			log.error("Error ajout rapport:"+e.toString());
			return null;
		}
	}

	@Override
	public List<Rapport> allRapportPatient(String idPatient) {		
		return rapportRepository.findRapportByOrderByIdDesc(idPatient);
	}

	@Override
	public Rapport findRapportPatient(String idPatient) {
		Rapport rapport = rapportRepository.findById(idPatient).orElseThrow(() -> new IllegalArgumentException("Rapport introuvable:" + idPatient));
		log.info("Rapport:"+rapport.toString());
		return rapport;
	}

	

	
	
}
