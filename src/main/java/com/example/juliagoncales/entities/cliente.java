package com.example.juliagoncales.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "cliente")
	private String ncliente;
	
	@Column(name = "fone")
	private String fone;
	
	public Long getIdcCliente() {
		return idcCliente;
	}
	public void setIdcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	public String getCliente() {
		return ncliente;
	}
	public void setCliente(String cliente) {
		this.ncliente = cliente;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
}