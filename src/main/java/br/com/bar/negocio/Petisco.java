package br.com.bar.negocio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "TPetisco")
@PrimaryKeyJoinColumn(name = "idProduto")

public  class Petisco extends Produto {
	

	private Date validade;
	private String tipo;
	private boolean isFeitoHoje;
		
	public Petisco() {
	}
	
	public Petisco(Integer id, String nome, Integer quantidade, float preco,Date validade, String tipo, boolean isFeitoHoje) {
		super(id,nome, quantidade, preco);		
		this.setNome(nome);
		this.setQuantidade(quantidade);
		this.setPreco(preco);	
		this.validade = validade;
		this.tipo = tipo;
		this.isFeitoHoje = isFeitoHoje;
	}
	
	@Override
	public String toString() {
		return "Petisco -> nome=" + this.getNome() 
				+ ", quantidade=" + this.getQuantidade() 
				+ ", pre�o=" + this.getPreco()
				+ ", tipo=" + this.getTipo() 
				+ ", validade="	+ this.getValidade() 
				+ ", feito hoje=" + this.isFeitoHoje;
	}	
	
	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isFeitoHoje() {
		return isFeitoHoje;
	}

	public void setFeitoHoje(boolean isFeitoHoje) {
		this.isFeitoHoje = isFeitoHoje;
	}	
}
