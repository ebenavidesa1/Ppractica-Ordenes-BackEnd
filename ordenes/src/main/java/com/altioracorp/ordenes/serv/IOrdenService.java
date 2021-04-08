package com.altioracorp.ordenes.serv;

import java.util.List;

import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.model.Orden;


public interface IOrdenService {
	
	Orden add(Orden orden);

	Orden listarPorId(int idOrden);

}
