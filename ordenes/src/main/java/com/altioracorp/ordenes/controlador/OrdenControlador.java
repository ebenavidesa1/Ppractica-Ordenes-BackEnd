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
import com.altioracorp.ordenes.model.Orden;
import com.altioracorp.ordenes.serv.IClienteService;
import com.altioracorp.ordenes.serv.IOrdenService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/ordenes/orden" })
public class OrdenControlador {

	@Autowired
	IOrdenService ordenservice;

	
	@PostMapping
	public Orden agregar(@RequestBody Orden orden) {
		return ordenservice.add(orden);
	}

	@GetMapping(path = { "/{id}" })
	public Orden listarId(@PathVariable("id") int id) {
		return ordenservice.listarPorId(id);

	}
	
	
	

}
