package br.jus.cnj.pje.cepservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jus.cnj.pje.cepservice.model.entities.Cep;
import br.jus.cnj.pje.cepservice.services.CepService;

@RestController
public class CepRestController {

	@Autowired
	private CepService cepService;
	
	@RequestMapping(method=RequestMethod.POST, path="/ceps", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Cep criarNovoCep(@RequestBody Cep cep){
		return this.cepService.criarNovoCep(cep);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/ceps", produces=MediaType.APPLICATION_JSON_VALUE)
	public Page<Cep> recuperarCepsPorPagina(Pageable pagina){
		return this.cepService.recuperarCepsPorPagina(pagina);
	}
	
	@RequestMapping(method=RequestMethod.PATCH, path="/ceps", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Cep alterarCep(@RequestBody Cep cep){
		Cep cepAtual = new Cep();
		
		if(cep.getIdCep() != null){
			cepAtual = this.cepService.recuperarCepPorIdCep(cep.getIdCep());
			if(cepAtual != null){
				cep = this.cepService.alterarCep(cep);
			}
		} else {
			cep = new Cep();
		}
		
		return cep;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/ceps/{idCep}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Integer excluirCep(@PathVariable("idCep") Integer idCep){
		return this.cepService.excluirCep(idCep);
	}
}
