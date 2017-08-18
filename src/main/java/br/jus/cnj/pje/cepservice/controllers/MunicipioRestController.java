package br.jus.cnj.pje.cepservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jus.cnj.pje.cepservice.model.entities.Estado;
import br.jus.cnj.pje.cepservice.model.entities.Municipio;
import br.jus.cnj.pje.cepservice.services.EstadoService;
import br.jus.cnj.pje.cepservice.services.MunicipioService;

@RestController
public class MunicipioRestController {
	
	@Autowired
	private MunicipioService municipioService;
	
	@Autowired
	private EstadoService estadoService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/municipios", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Municipio> recuperarMunicipios(){
		return this.municipioService.recuperarMunicipios();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/municipios/{idMunicipio}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Municipio recuperarMunicipioPorIdMunicipio(@PathVariable("idMunicipio") Integer idMunicipio){
		return this.municipioService.recuperarMunicipioPorId(idMunicipio);
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/municipios", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Municipio criarNovoMunicipio(@RequestBody Municipio municipio){
		return this.municipioService.criarNovoMunicipio(municipio);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/estados/{idEstado}/municipios", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Municipio> recuperarMunicipiosPorIdEstado(@PathVariable("idEstado") Integer idEstado){
		Estado estado = this.estadoService.recuperarEstadoPorIdEstado(idEstado);
		List<Municipio> municipios = new ArrayList<Municipio>();
 		
		if(estado != null){
			municipios = this.municipioService.recuperarMunicipiosPorEstado(estado);
		}
		
		return municipios;
	}
	
}
