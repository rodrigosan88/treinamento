package br.jus.cnj.pje.cepservice.services;

import java.util.List;

import br.jus.cnj.pje.cepservice.model.entities.Estado;

public interface EstadoService {
	public Estado criarNovoEstado(Estado estado);
	public List<Estado> recuperarEstados();
	public Estado recuperarEstadoPorIdEstado(Integer idEstado);
}
