package br.com.bar.negocio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name = "TSobremesa")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Sobremesa extends Produto {

	
	private Date validade;
	private String tamanho;
	private boolean isFeitoHone;
	
	public Sobremesa() {	
	}
	
	public Sobremesa(Integer id, String nome, Integer quantidade, float preco, Date validade, String tamanho, boolean isFeitoHone) {
		super(id, nome, quantidade, preco);
		this.setNome(nome);
		this.setQuantidade(quantidade);
		this.setPreco(preco);		
		this.validade = validade;
		this.tamanho = tamanho;
		this.isFeitoHone = isFeitoHone;
	}
	
	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isFeitoHone() {
		return isFeitoHone;
	}

	public void setFeitoHone(boolean isFeitoHone) {
		this.isFeitoHone = isFeitoHone;
	}	

	@Override
	public String toString() {
		return "Sobremesa -> nome=" + this.getNome() 
				+ ", quantidade=" + this.getQuantidade() 
				+ ", pre�o=" + this.getPreco()
				+ ", tamanho=" + this.getTamanho() 
				+ ", validade="	+ this.getValidade() 
				+ ", feito hoje=" + this.isFeitoHone;
	}
}
