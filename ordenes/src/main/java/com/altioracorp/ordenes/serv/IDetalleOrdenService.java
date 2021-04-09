package com.altioracorp.ordenes.serv;

import java.util.List;

import com.altioracorp.ordenes.model.Detalleorden;

public interface IDetalleOrdenService {

	Detalleorden add(Detalleorden detalle);

	List<Detalleorden> listarPorOrden(int idorden);
	
	Detalleorden listarPorArt(int idArticulo);

	Detalleorden mostrarCantidad(int codigo);
	
	
}
