package br.com.bar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bar.negocio.Bebida;


@Repository
public interface IBebidaRepository extends CrudRepository<Bebida, Integer> {

}