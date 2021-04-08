package com.altioracorp.ordenes.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.model.Orden;

public interface OrdenRepository extends Repository<Orden, Integer>{
	
	
	Orden save(Orden orden);
	
	Orden findByIdorden(int id);

	
	

}
