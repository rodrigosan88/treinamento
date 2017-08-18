package br.jus.cnj.pje.cepservice.services;

import java.util.List;

import br.jus.cnj.pje.cepservice.model.entities.Estado;
import br.jus.cnj.pje.cepservice.model.entities.Municipio;

public interface MunicipioService {
	public Municipio criarNovoMunicipio(Municipio municipio);
	public List<Municipio> recuperarMunicipiosPorEstado(Estado estado);
	public List<Municipio> recuperarMunicipios();
	public Municipio recuperarMunicipioPorId(Integer idMunicipio);
}
