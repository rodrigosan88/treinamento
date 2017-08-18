package br.jus.cnj.pje.cepservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	@Override
	public Page<Cep> recuperarCepsPorPagina(Pageable pageable) {
		return this.cepRepository.findAll(pageable);
	}

	@Override
	public Cep alterarCep(Cep cep) {
		return this.criarNovoCep(cep);
	}

	@Override
	public Integer excluirCep(Integer idCep) {
		this.cepRepository.deleteByIdCep(idCep);
		return idCep;
	}

	@Override
	public Cep recuperarCepPorIdCep(Integer idCep) {
		return this.cepRepository.findOne(idCep);
	}
	
}
