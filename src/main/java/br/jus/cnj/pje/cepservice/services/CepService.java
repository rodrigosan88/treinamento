package br.jus.cnj.pje.cepservice.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.jus.cnj.pje.cepservice.model.entities.Cep;

public interface CepService {
	public Cep criarNovoCep(Cep cep);
	public Page<Cep> recuperarCepsPorPagina(Pageable pageable);
	public Cep alterarCep(Cep cep);
	public Integer excluirCep(Integer cep);
	public Cep recuperarCepPorIdCep(Integer idCep);
}
