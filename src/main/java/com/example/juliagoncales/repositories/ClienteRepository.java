package com.example.juliagoncales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.juliagoncales.entities.cliente;
import com.example.juliagoncales.services.ClienteServices;

public interface ClienteRepository extends JpaRepository<cliente, Long>{

	static ClienteServices save(ClienteServices cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}