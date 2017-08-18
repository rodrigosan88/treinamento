package br.jus.cnj.pje.cepservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.jus.cnj.pje.cepservice.services.MunicipioService;

@RestController
public class MunicipioRestController {
	
	@Autowired
	private MunicipioService municipioService;
	
}
