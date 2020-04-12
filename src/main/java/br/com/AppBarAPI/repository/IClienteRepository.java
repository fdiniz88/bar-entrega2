package br.com.bar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bar.negocio.Cliente;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer> {

}