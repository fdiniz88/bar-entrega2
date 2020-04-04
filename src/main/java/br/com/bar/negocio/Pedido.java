package br.com.bar.negocio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "TPedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "descricao")
	private String descricao;
	
	@OneToOne(
			fetch = FetchType.EAGER,
			cascade = CascadeType.PERSIST
			)
	@JoinColumn(name = "idCliente")	
	
	private Cliente cliente;
	
	@OneToMany(
			mappedBy = "pedido",
			fetch = FetchType.EAGER,
			cascade = CascadeType.PERSIST
			)		

    @JsonManagedReference
	private List<Produto> produtos;
	
	public Pedido(){
	}
	
	public Pedido(Integer id, String descricao) {
		this();
		this.id = id;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format(this.getCliente() + ", produtos=" + this.getProdutos());
	}	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
