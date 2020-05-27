package com.mediscreen.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediscreen.dao.DeclencheursRepository;
import com.mediscreen.entities.Declencheurs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DeclencheursServiceImpl implements DeclencheursService {

	@Autowired
	private DeclencheursRepository declencheursRepository;

	@Override
	public Declencheurs add(Declencheurs declencheurs) {
		try {

			Declencheurs declencheurs2 = declencheursRepository.findByLibelle(declencheurs.getLibelle());

			if (declencheurs2 == null) {
				declencheurs.setDateCreation(new Date());
				return declencheursRepository.save(declencheurs);
			} else {
				return null;
			}

		} catch (Exception e) {
			log.error("Erreur lors d'ajout d'un declencheur:" + e.toString());
			return null;
		}
	}

	@Override
	public Declencheurs update(Declencheurs declencheurs, String id) {
		try {
			Declencheurs declencheurs2 = declencheursRepository.findDeclencheurById(id);

			if (declencheurs2 != null) {
				declencheurs2.setLibelle(declencheurs.getLibelle());
				declencheursRepository.save(declencheurs2);
				log.info("Declencheur modififé avec succès:" + declencheurs2.toString());
			}
			return declencheurs2;

		} catch (Exception e) {
			log.error("Erreur lors de la modification d'un declencheur:" + e.toString());
			return null;
		}
	}

	@Override
	public Declencheurs find(String id) {
		Declencheurs declencheurs2 = declencheursRepository.findDeclencheurById(id);

		log.info("Declencheur = " + declencheurs2.toString());
		return declencheurs2;
	}

	@Override
	public List<Declencheurs> all() {
		try {
			return declencheursRepository.findAll();
		} catch (Exception e) {
			log.info("Erreur lors de recuperation de la liste " + e);
			return null;
		}
	}

	@Override
	public void delete(String id) {
		Declencheurs declencheurs2 = declencheursRepository.findDeclencheurById(id);
		log.info("Declencheur supprimé succès : " + declencheurs2.getLibelle());
		declencheursRepository.delete(declencheurs2);
	}

}
