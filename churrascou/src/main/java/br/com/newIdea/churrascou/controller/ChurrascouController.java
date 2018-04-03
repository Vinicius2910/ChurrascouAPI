/**
 * 
 */
package br.com.newIdea.churrascou.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.newIdea.churrascou.model.Pessoa;
import br.com.newIdea.churrascou.model.Produto;
import br.com.newIdea.churrascou.repository.PessoaRepository;
import br.com.newIdea.churrascou.repository.ProdutoRepository;

/**
 * @author ViniciusVicentedeMel
 *
 */
@RestController
@CrossOrigin("${origem-permitida}")
public class ChurrascouController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping("/itens")
	public List<Produto> listar(){
		return produtoRepository.findAll();
	}
	
	@PostMapping("/itens")
	public Produto adicionar(@RequestBody @Valid Produto produto ){
		return produtoRepository.save(produto);
	}
	
	@PostMapping("/pessoa")
	public Pessoa adicionar(@RequestBody @Valid Pessoa pessoa){
		List <Produto> produto = new ArrayList<Produto>();
		produto.addAll(produtoRepository.findAll());
		Double numberP = Double.parseDouble(""+ pessoa.getnPessoas()/2);
		System.out.println("O valor:"+numberP);
		
		for(int i=0; i<produto.size(); i++){
			produto.get(i).setQuantidade(numberP);
			produto.get(i).setTotal(numberP* produto.get(i).getPreco());
			Double totalPorPessoa =  produto.get(i).getTotal()/pessoa.getnPessoas();
			produto.get(i).setTotalPessoa(totalPorPessoa);
			produtoRepository.save(produto.get(i));
		}
		
	return pessoaRepository.save(pessoa);
		
	}

}
