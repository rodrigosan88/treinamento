package br.jus.cnj.pje.cepservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.cnj.pje.cepservice.model.entities.Cep;

public interface CepRepository extends JpaRepository<Cep, Integer>{

}
