package com.mediscreen.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediscreen.dao.RapportRepository;
import com.mediscreen.entities.Rapport;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RapportServiceImpl implements RapportService {

	@Autowired
	private RapportRepository rapportRepository;

	@Override
	public Rapport add(String idPatient, int age, String risques) {
		try {
			
			Rapport rapport = rapportRepository.findByRapport(idPatient, risques);

			if (rapport != null) {
				rapport.setAge(age);
				rapport.setIdPatient(idPatient);
				rapport.setDateCreation(new Date());
				rapport.setRisque(risques);
				return rapportRepository.save(rapport);
			}
			
				Rapport rap = new Rapport();
				rap.setAge(age);
				rap.setIdPatient(idPatient);
				rap.setDateCreation(new Date());
				rap.setRisque(risques);
				return rapportRepository.save(rap);


		} catch (Exception e) {
			log.error("Error ajout rapport:" + e.toString());
			return null;
		}
	}

	

	@Override
	public Rapport findRapportPatient(String idPatient) {
		Rapport rapport = rapportRepository.findByIdRapport(idPatient);
		log.info("Rapport:" + rapport.toString());
		return rapport;
	}
	
	@Override
	public void deleteRapportPatient(String idPatient) {
		Rapport rapport = rapportRepository.findByIdRapport(idPatient);
		rapportRepository.delete(rapport);
	}

}
