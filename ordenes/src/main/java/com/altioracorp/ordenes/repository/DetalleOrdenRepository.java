package com.altioracorp.ordenes.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.model.Detalleorden;
import com.altioracorp.ordenes.model.Orden;

public interface DetalleOrdenRepository extends Repository<Detalleorden, Integer>{
	
	
	List<Detalleorden> findByOrden(Orden idOrden);

	Detalleorden save(Detalleorden detalle);
	
	Detalleorden findByArticulo(Articulo art);

	Detalleorden findById(int id);
	
	//Detalleorden findByCantidad(int codigo);
	

}
