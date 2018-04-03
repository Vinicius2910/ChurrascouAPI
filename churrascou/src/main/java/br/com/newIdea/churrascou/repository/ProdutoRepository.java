/**
 * 
 */
package br.com.newIdea.churrascou.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.newIdea.churrascou.model.Produto;

/**
 * @author ViniciusVicentedeMel
 *
 */
public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
