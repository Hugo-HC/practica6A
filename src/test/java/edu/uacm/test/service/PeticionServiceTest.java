package edu.uacm.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import edu.uacm.service.impl.PeticionServiceImpl;

import edu.uacm.Application;
import edu.uacm.domain.User;
import edu.uacm.service.PeticionService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class PeticionServiceTest {

	@Autowired
	PeticionService peticionService;
	
	@Test
	public void recibirPeticionTest() {
		
		User user = new User();
		user.setEdad(30);
		user.setNombre("Gerardo");
		
		peticionService.recibirPeticion(user);
	}

}
