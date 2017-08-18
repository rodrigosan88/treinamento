package br.jus.cnj.pje.cepservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.cnj.pje.cepservice.model.entities.Estado;
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

	@Override
	public List<Municipio> recuperarMunicipiosPorEstado(Estado estado) {
		return this.municipioRepository.findByEstado(estado);
	}

	@Override
	public List<Municipio> recuperarMunicipios() {
		return this.municipioRepository.findAll();
	}

	@Override
	public Municipio recuperarMunicipioPorId(Integer idMunicipio) {
		return this.municipioRepository.findOne(idMunicipio);
	}
}
