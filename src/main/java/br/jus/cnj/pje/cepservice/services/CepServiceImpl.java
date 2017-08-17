package br.jus.cnj.pje.cepservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.cnj.pje.cepservice.model.entities.Cep;
import br.jus.cnj.pje.cepservice.repositories.CepRepository;

@Service
public class CepServiceImpl implements CepService{

	@Autowired
	private CepRepository cepRepository;
	
	@Override
	public Cep criarNovoCep(Cep cep) {
		return this.cepRepository.save(cep);
	}
	
}
