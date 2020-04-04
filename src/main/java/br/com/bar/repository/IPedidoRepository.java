package br.com.bar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bar.negocio.Pedido;

@Repository
public interface IPedidoRepository extends CrudRepository<Pedido, Integer> {

}