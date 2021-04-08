package com.altioracorp.ordenes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.repository.ClienteRepository;
import com.altioracorp.ordenes.serv.IClienteService;


@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public Cliente listarPorId(int idcliente) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(idcliente);
	}

	@Override
	public Cliente add(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente edit(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}
//
	@Override
	public Cliente delete(int idcliente) {

		Cliente cliente=clienteRepository.findById(idcliente);
		if(cliente!=null) {
			clienteRepository.delete(cliente);
		}
		return cliente;
	}
	
	@Override
	public Cliente listarPorIdentificacion(String identificacion) {
		// TODO Auto-generated method stub
		return clienteRepository.findByIdentificacion(identificacion);
	}

}
