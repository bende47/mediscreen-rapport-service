package com.mediscreen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.mediscreen.dao.DeclencheursRepository;
import com.mediscreen.entities.Declencheurs;

@SpringBootTest
@TestPropertySource(locations = "classpath:bootstrap.properties")
class DeclencheursServiceTest {

	@Autowired
	private DeclencheursRepository declencheurRepository;

	private static Declencheurs declencheurs;

	@BeforeAll
	public static void setup() {
		declencheurs = new Declencheurs("Paludisme");
	}

	@Test
	public void addDeclencheurTest() {
		declencheurs = declencheurRepository.save(declencheurs);
		assertEquals("Malaria", declencheurs.getLibelle());
		declencheurRepository.delete(declencheurs);

	}

	@Test
	public void updateDeclencheurTest() {
		declencheurs.setLibelle("Malaria");
		declencheurs = declencheurRepository.save(declencheurs);
		assertEquals("Malaria", declencheurs.getLibelle());
	}

	@Test
	public void findTest() {
		declencheurs = declencheurRepository.save(declencheurs);
		String id = declencheurs.getId();
		Optional<Declencheurs> declencheurs = declencheurRepository.findById(id);
		assertTrue(declencheurs.isPresent());
	}

	@Test
	public void allDeclencheursTest() {
		declencheurs = declencheurRepository.save(declencheurs);
		List<Declencheurs> listD = declencheurRepository.findAll();
		assertTrue(listD.size() > 0);
	}

	@Test
	public void deleteDeclencheursTest() {
		declencheurs = declencheurRepository.save(declencheurs);
		String id = declencheurs.getId();
		declencheurRepository.delete(declencheurs);
		Optional<Declencheurs> declencheur = declencheurRepository.findById(id);
		assertFalse(declencheur.isPresent());
	}
}
