package br.jus.cnj.pje.cepservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.cnj.pje.cepservice.model.entities.Municipio;
import br.jus.cnj.pje.cepservice.repositories.MunicipioRepository;

@Service
public class MunicipioServiceImpl implements MunicipioService{
	
	@Autowired
	private MunicipioRepository municipioRepository;
	
	@Override
	public Municipio criarNovoMunicipio(Municipio municipio) {
		return this.municipioRepository.save(municipio);
	}
}
