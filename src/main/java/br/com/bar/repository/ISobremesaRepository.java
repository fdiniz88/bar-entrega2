package br.com.bar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bar.negocio.Sobremesa;

@Repository
public interface ISobremesaRepository extends CrudRepository<Sobremesa, Integer> {

}