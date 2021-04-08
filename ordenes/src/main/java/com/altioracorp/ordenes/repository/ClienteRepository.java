package com.altioracorp.ordenes.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.altioracorp.ordenes.model.Cliente;

public interface ClienteRepository extends Repository<Cliente, Integer>{
	
	List<Cliente>findAll();
	
	Cliente findById(int id);
	
	Cliente save(Cliente cliente);

	void delete(Cliente cliente);
	
	Cliente findByIdentificacion(String identificacion);
	
	
	

}
