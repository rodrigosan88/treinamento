package br.jus.cnj.pje.cepservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.cnj.pje.cepservice.model.entities.Estado;
import br.jus.cnj.pje.cepservice.repositories.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService{

	@Autowired
	private EstadoRepository estadoRepository;
	
	@Override
	public Estado criarNovoEstado(Estado estado) {
		return this.estadoRepository.save(estado);
	}

	@Override
	public List<Estado> recuperarEstados() {
		List<Estado> listaEstados = this.estadoRepository.findAll();
		if(listaEstados == null || listaEstados.isEmpty()){
			listaEstados = new ArrayList<Estado>();
		}
		return listaEstados;
	}

	@Override
	public Estado recuperarEstadoPorIdEstado(Integer idEstado) {
		return this.estadoRepository.findOne(idEstado);
	}
}
