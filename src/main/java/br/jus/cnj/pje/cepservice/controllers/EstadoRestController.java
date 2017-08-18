package br.jus.cnj.pje.cepservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.jus.cnj.pje.cepservice.services.EstadoService;

@RestController
public class EstadoRestController {
	
	@Autowired
	private EstadoService estadoService;
	
}
