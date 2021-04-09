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

import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.model.Detalleorden;
import com.altioracorp.ordenes.model.Orden;
import com.altioracorp.ordenes.serv.IClienteService;
import com.altioracorp.ordenes.serv.IDetalleOrdenService;
import com.altioracorp.ordenes.serv.IOrdenService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/ordenes/detalle" })
public class DetalleControlador {

	@Autowired
	IDetalleOrdenService detservice;

	
	@PostMapping
	public Detalleorden agregar(@RequestBody Detalleorden detalle) {
		return detservice.add(detalle);
	}
	
	@GetMapping(path = { "/{orden}" })
	public List<Detalleorden> listarOrden(@PathVariable("orden") int orden) {
		System.out.println("COmprobando id "+orden);
		return detservice.listarPorOrden(orden);

	}
	
	
	@GetMapping(path = { "/stock/{codigo}" })
	public Detalleorden mostrarCant(@PathVariable("codigo") int codigo) {
		return detservice.mostrarCantidad(codigo);

	}

}
