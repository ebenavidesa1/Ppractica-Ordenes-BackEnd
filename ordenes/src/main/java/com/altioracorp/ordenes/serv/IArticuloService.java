package com.altioracorp.ordenes.serv;

import java.util.List;

import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.model.Cliente;


public interface IArticuloService {
	List<Articulo>listar();
	
	Articulo add(Articulo articulo);
	
	Articulo listarPorCodigo(String codigo);

	

}
