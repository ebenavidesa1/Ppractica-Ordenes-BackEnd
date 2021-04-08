package com.altioracorp.ordenes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.repository.ArticuloRepository;
import com.altioracorp.ordenes.repository.ClienteRepository;
import com.altioracorp.ordenes.serv.IArticuloService;
import com.altioracorp.ordenes.serv.IClienteService;


@Service
public class ArticuloServiceImpl implements IArticuloService {
	
	@Autowired
	private ArticuloRepository artRepository;

	@Override
	public List<Articulo> listar() {
		// TODO Auto-generated method stub
		return artRepository.findAll();
	}

	
	@Override
	public Articulo add(Articulo articulo) {
		// TODO Auto-generated method stub
		return artRepository.save(articulo);
	}
	
	@Override
	public Articulo listarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return artRepository.findByCodigo(codigo);
	}

	
}
