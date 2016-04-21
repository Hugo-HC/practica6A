package edu.uacm.test.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.uacm.Application;
import edu.uacm.domain.Vehiculo;
import edu.uacm.domain.VehiculoRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class VehiculoTest {
	
	@Autowired
	VehiculoRepository vehiculoRepository;
	
	//@Test
	public void guardarVehiculoTest(){
		Vehiculo auto = new Vehiculo();
		auto.setModelo("hugohernandez");
		
		vehiculoRepository.save(auto);
	}

	@Test
	public void obtenerPrimerRegistro(){
		long id=1;
		Vehiculo auto = vehiculoRepository.findOne( new Long(id)) ;
		Assert.assertNotNull(auto);
		//auto.getModelo();
	}
}
