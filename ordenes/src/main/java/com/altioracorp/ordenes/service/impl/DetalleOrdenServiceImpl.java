package com.altioracorp.ordenes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altioracorp.ordenes.model.Detalleorden;
import com.altioracorp.ordenes.model.Orden;
import com.altioracorp.ordenes.repository.DetalleOrdenRepository;
import com.altioracorp.ordenes.repository.OrdenRepository;
import com.altioracorp.ordenes.serv.IDetalleOrdenService;


@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService {
	
	@Autowired
	private DetalleOrdenRepository detalleRepository;
	@Autowired
	private OrdenRepository ordenRepository;

	
	@Override
	public Detalleorden add(Detalleorden detalle) {
		// TODO Auto-generated method stub
		return detalleRepository.save(detalle);
	}


	@Override
	public List<Detalleorden> listarPorOrden(int idorden) {
		
		Orden orden=ordenRepository.findByIdorden(idorden);
		
		return detalleRepository.findByOrden(orden);
	}

	
	


	

}
