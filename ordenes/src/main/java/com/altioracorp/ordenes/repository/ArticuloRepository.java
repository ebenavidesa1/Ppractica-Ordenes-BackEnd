package com.altioracorp.ordenes.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.model.Cliente;

public interface ArticuloRepository extends Repository<Articulo, Integer>{
	
	List<Articulo>findAll();
		
	Articulo save(Articulo articulo);

	Articulo findByCodigo(String codigo);

}
