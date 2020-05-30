package com.mediscreen;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.mediscreen.dao.RapportRepository;
import com.mediscreen.entities.Rapport;

@SpringBootTest
@TestPropertySource(locations = "classpath:bootstrap.properties")
class RapportServiceTest {

	@Autowired
	private RapportRepository rapportRepository;

	private static Rapport rapport;

	@BeforeAll
	public static void setup() {
		rapport = new Rapport("test", 30, "fumeur");
	}

	@Test
	public void addRapportTest() {
		rapport = rapportRepository.save(rapport);
		assertEquals(30, rapport.getAge());
		assertEquals("test", rapport.getIdPatient());
	}

	
	@Test
	public void findRapportPatientTest() {
		rapport = rapportRepository.save(rapport);
		String id = rapport.getIdPatient();
		Rapport rapport = rapportRepository.findByIdRapport(id);
		assertEquals(30, rapport.getAge());
		rapportRepository.delete(rapport);
	}

}
