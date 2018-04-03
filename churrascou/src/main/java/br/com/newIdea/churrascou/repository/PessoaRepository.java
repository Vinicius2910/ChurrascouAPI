/**
 * 
 */
package br.com.newIdea.churrascou.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.newIdea.churrascou.model.Pessoa;

/**
 * @author ViniciusVicentedeMel
 *
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
