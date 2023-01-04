package br.com.attornatus.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.attornatus.projeto.entity.Endereco;
import br.com.attornatus.projeto.repositories.EnderecoRepository;

@Service
public class EnderecoService  {

	@Autowired
	private EnderecoRepository repository;
	
	// buscando todas os Enderecos
	public List<Endereco> findAll(){
		return repository.findAll();
	}
	

	
}
