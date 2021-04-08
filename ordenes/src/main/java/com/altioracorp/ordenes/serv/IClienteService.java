package com.altioracorp.ordenes.serv;

import java.util.List;

import com.altioracorp.ordenes.model.Cliente;


public interface IClienteService {
	List<Cliente>listar();
	
	Cliente listarPorId(int idcliente);

	Cliente add(Cliente cliente);
	
	Cliente edit(Cliente cliente);

	Cliente delete(int idcliente);
	
	Cliente listarPorIdentificacion(String identificacion);
	

}
