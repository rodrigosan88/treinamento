package br.jus.cnj.pje.cepservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.cnj.pje.cepservice.model.entities.Estado;
import br.jus.cnj.pje.cepservice.model.entities.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer>{
	public List<Municipio> findByEstado(Estado estado);
}
