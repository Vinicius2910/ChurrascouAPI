/**
 * 
 */
package br.com.newIdea.churrascou.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

/**
 * @author ViniciusVicentedeMel
 *
 */

@Entity
public class Produto {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private double preco;
	
	private Double quantidade;
	private Double total;
	private Double totalPessoa;
	
	
	public Double getTotalPessoa() {
		return totalPessoa;
	}

	public void setTotalPessoa(Double totalPessoa) {
		this.totalPessoa = totalPessoa;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
