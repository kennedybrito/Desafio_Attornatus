package br.com.attornatus.projeto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.attornatus.projeto.entity.Endereco;
import br.com.attornatus.projeto.services.EnderecoService;



@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {
	
	@Autowired
	private EnderecoService service;
		
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
		List<Endereco> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

	
}
