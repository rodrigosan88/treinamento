package br.jus.cnj.pje.cepservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.cnj.pje.cepservice.model.entities.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
}
