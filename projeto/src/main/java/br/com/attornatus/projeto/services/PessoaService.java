package br.com.attornatus.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.attornatus.projeto.entity.Pessoa;
import br.com.attornatus.projeto.repositories.PessoaRepository;

@Service
public class PessoaService  {

	@Autowired
	private PessoaRepository repository;
	
	// buscando todas as pessoas
	public List<Pessoa> findAll(){
		return repository.findAll();
	}
	
	// buscando as pessoas por ID
	public Pessoa findById(long id) {
		Optional<Pessoa> objeto =  repository.findById(id);
		return objeto.get();
	}
	
	// inserir pessoa
	public Pessoa insert (Pessoa obj) {
		return repository.save(obj);		
	}
	
	// deletar pessoa
	public void delete (Long id) {
		repository.deleteById(id);
	}
}
