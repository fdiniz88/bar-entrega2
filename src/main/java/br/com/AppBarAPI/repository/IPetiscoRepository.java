package br.com.bar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bar.negocio.Petisco;

@Repository
public interface IPetiscoRepository extends CrudRepository<Petisco, Integer> {

}