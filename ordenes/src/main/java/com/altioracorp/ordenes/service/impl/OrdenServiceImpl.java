package com.altioracorp.ordenes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.model.Orden;
import com.altioracorp.ordenes.repository.ClienteRepository;
import com.altioracorp.ordenes.repository.OrdenRepository;
import com.altioracorp.ordenes.serv.IClienteService;
import com.altioracorp.ordenes.serv.IOrdenService;


@Service
public class OrdenServiceImpl implements IOrdenService {
	
	@Autowired
	private OrdenRepository ordenRepository;

	
	@Override
	public Orden add(Orden orden) {
		// TODO Auto-generated method stub
		return ordenRepository.save(orden);
	}
	
	@Override
	public Orden listarPorId(int idOrden) {
		// TODO Auto-generated method stub
		return ordenRepository.findByIdorden(idOrden);
	}


	

}
