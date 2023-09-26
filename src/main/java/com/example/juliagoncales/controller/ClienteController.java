package com.example.juliagoncales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.juliagoncales.services.ClienteServices;
import com.example.juliagoncales.entities.cliente;

@RestController
@RequestMapping("/client")

public class ClienteController {
	private final ClienteServices ClienteServices;
	
	@Autowired
	public ClienteController(ClienteServices ClienteServices) {
		this.ClienteServices = ClienteServices;
	}
	
	@PostMapping
	public cliente creatcliente(@RequestBody cliente cliente) {
		return ClienteServices.saveCliente(cliente);
	}
	
	@GetMapping("/(idcCliente)")
	public cliente getCliente(@PathVariable Long idcCliente) {
		return ClienteServices.getClienteById(idcCliente);
	}
	
	@GetMapping
	public List<cliente>getAllCliente(){
		return ClienteServices.getAllCliente();
	}
	
	@DeleteMapping("/(id)")
	public void deleteCliente (@PathVariable Long idcCliente) {
		ClienteServices.deleteCliente(idcCliente);
	}
}