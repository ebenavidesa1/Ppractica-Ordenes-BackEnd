package com.altioracorp.ordenes.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.serv.IArticuloService;


@CrossOrigin(origins="http://localhost:4200", maxAge =3600)
@RestController
@RequestMapping({"/ordenes/articulos"})
public class ArticuloControlador {	
	
	@Autowired
	IArticuloService artservice;
	
	@GetMapping
	public List<Articulo>listar(){
		return artservice.listar();
	}
	
	@PostMapping
	public Articulo agregar(@RequestBody Articulo articulo){
		return artservice.add(articulo);
	}
	
	@GetMapping(path = { "/{codigo}" })
	public Articulo listarCodigo(@PathVariable("codigo") String codigo) {
		return artservice.listarPorCodigo(codigo);

	}
	
}
