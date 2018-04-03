/**
 * 
 */
package br.com.newIdea.churrascou.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author ViniciusVicentedeMel
 *
 */
@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private int nPessoas;
	
	@NotNull
	private Double valorDisponivel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getnPessoas() {
		return nPessoas;
	}

	public void setnPessoas(int nPessoas) {
		this.nPessoas = nPessoas;
	}

	public Double getValorDisponivel() {
		return valorDisponivel;
	}

	public void setValorDisponivel(Double valorDisponivel) {
		this.valorDisponivel = valorDisponivel;
	}
	
	
}
