package br.com.bar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bar.negocio.Pedido;
import br.com.bar.service.PedidoService;


@RestController
@RequestMapping("/api/pedido/")
public class PedidoController {

	@Autowired
	private PedidoService service;
	
	@RequestMapping
	public List<Pedido> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Pedido> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Pedido Pedido) 
	{
		service.incluir(Pedido);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public PedidoService getService() {
		return service;
	}
	
	public void setService(PedidoService service) {
		this.service = service;
	}
}