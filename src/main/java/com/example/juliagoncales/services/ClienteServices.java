package com.example.juliagoncales.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.juliagoncales.entities.cliente;
import com.example.juliagoncales.repositories.ClienteRepository;

@Service
public class ClienteServices {
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteServices (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public cliente saveCliente(cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public cliente getClienteById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}
	
	public List<cliente> getAllCliente(){
		return clienteRepository.findAll();
	}
	
	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}
}
