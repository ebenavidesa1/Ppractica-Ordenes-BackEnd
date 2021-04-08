package com.altioracorp.ordenes.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.serv.IClienteService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/ordenes/clientes" })
public class ClienteControlador {

	@Autowired
	IClienteService clienteservice;

	@GetMapping
	public List<Cliente>listar() {
		return clienteservice.listar();
	}

	@PostMapping
	public Cliente agregar(@RequestBody Cliente cliente) {
		return clienteservice.add(cliente);
	}

	@GetMapping(path = { "/{id}" })
	public Cliente listarId(@PathVariable("id") int id) {
		return clienteservice.listarPorId(id);

	}

	@PutMapping(path = { "/{id}" })
	public Cliente editar(@RequestBody Cliente cliente, @PathVariable("id") int id) {
		cliente.setIdcliente(id);
		return clienteservice.edit(cliente);
	}

	@DeleteMapping(path = { "/{id}" })
	public Cliente eliminar(@PathVariable("id") int id) {
		return clienteservice.delete(id);

	}

	@GetMapping(path = { "/identificacion/{identificacion}" })
	public Cliente listarIdentificacion(@PathVariable("identificacion") String identificacion) {
		return clienteservice.listarPorIdentificacion(identificacion);

	}

}
