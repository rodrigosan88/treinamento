package br.jus.cnj.pje.cepservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jus.cnj.pje.cepservice.model.entities.Estado;
import br.jus.cnj.pje.cepservice.services.EstadoService;

@RestController
public class EstadoRestController {
	
	@Autowired
	private EstadoService estadoService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/estados", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Estado> recuperarEstados(){
		return this.estadoService.recuperarEstados();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/estados/{idEstado}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Estado recuperarEstadoPorIdEstado(@PathVariable("idEstado") Integer idEstado){
		return this.estadoService.recuperarEstadoPorIdEstado(idEstado);
	}	
	
	@RequestMapping(method=RequestMethod.POST, path="/estados", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Estado criarNovoEstado(@RequestBody Estado estado){
		return this.estadoService.criarNovoEstado(estado);
	}
}
