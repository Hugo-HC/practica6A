package edu.uacm.domain;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String nombre;
	private Integer edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNombre() + " : " + this.getEdad();
	}
}
