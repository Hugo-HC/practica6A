package edu.uacm.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="vehiculo")

public class Vehiculo {
	@Id
	@GeneratedValue
	//@Column (name= "id")
	private Long id;
	
	@NotNull
	private String modelo;

	@OneToMany(mappedBy="vehiculo")
	private List<Accesorio> listaAccesorios;

	public Long getId() {
		return id;
	}

	public List<Accesorio> getListaAccesorios() {
		return listaAccesorios;
	}

	public void setListaAccesorios(List<Accesorio> listaAccesorios) {
		this.listaAccesorios = listaAccesorios;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	

}
