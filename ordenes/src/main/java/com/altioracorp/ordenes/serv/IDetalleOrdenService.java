package com.altioracorp.ordenes.serv;

import java.util.List;

import com.altioracorp.ordenes.model.Detalleorden;

public interface IDetalleOrdenService {

	Detalleorden add(Detalleorden detalle);

	List<Detalleorden> listarPorOrden(int idorden);

}
