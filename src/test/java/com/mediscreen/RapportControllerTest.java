package com.mediscreen;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class RapportControllerTest {

	@Autowired
	private MockMvc mvc;	
	
	@Test
	public void addRapportTestC() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.get("/addRapport/add/test/30/fumeur")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());
		this.mvc.perform(MockMvcRequestBuilders.delete("/rapport/deleteRapport/test")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	}	
	
	@Test
	public void findRapportTestC() throws Exception {	
		this.mvc.perform(MockMvcRequestBuilders.get("/addRapport/add/test/30/fumeur")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());
		
		this.mvc.perform(MockMvcRequestBuilders.get("/rapport/find/test")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	}
	
	@Test
	public void deleteRapportTestC() throws Exception {	
		
		this.mvc.perform(MockMvcRequestBuilders.get("/addRapport/add/test1/30/fumeur")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());

		
		this.mvc.perform(MockMvcRequestBuilders.delete("/rapport/deleteRapport/test1")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	}
	
	
	@Test
	public void addDeclencheurTestC() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.post("/declencheur/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\": \"test1\",\"libelle\": \"Malaria\"}")
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());

	}	
	
	@Test
	public void findDeclencheurTestC() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.post("/declencheur/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\": \"test1\",\"libelle\": \"Malaria\"}")
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());
		
		this.mvc.perform(MockMvcRequestBuilders.get("/declencheur/find/test1")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	}
	
	@Test
	public void allDeclencheurTestC() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.get("/declencheur/all")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	}
	
	@Test
	public void updateDeclencheurTestC() throws Exception {
		
		this.mvc.perform(MockMvcRequestBuilders.post("/declencheur/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\": \"test\",\"libelle\": \"Malaria\"}")
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());
		
		this.mvc.perform(MockMvcRequestBuilders.put("/declencheur/update/test")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\": \"test\",\"libelle\": \"Malaria1\"}")
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());	
		
		this.mvc.perform(MockMvcRequestBuilders.delete("/declencheur/delete/test")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());
		
	}
	
	@Test
	public void deleteDeclencheurTestC() throws Exception {		
		this.mvc.perform(MockMvcRequestBuilders.delete("/declencheur/delete/test1")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());
	
	}
	
	
	

}
