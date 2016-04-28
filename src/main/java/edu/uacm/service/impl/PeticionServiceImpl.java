package edu.uacm.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import edu.uacm.domain.User;
import edu.uacm.service.PeticionService;

@Service
public class PeticionServiceImpl implements PeticionService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void recibirPeticion(User user) {
		
		log.debug("entre a recibirPeticion(User user)");
		log.debug(user.toString());

	}
	public List<User> obtenerUsuario(){
		List<User> usuarios = new ArrayList<User>();
		for(int i=0; i<5; i++){
			User usuario=new User();
			usuario.setEdad(i);
			usuario.setNombre("pedro");
			usuarios.add(usuario);
		}
		return usuarios;
	}
	public List<User> obtenerUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
