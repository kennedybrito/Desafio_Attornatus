package br.com.attornatus.projeto.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.attornatus.projeto.entity.Pessoa;



@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {
	
	@GetMapping
	public ResponseEntity<Pessoa> findAll(){
		Pessoa p = new Pessoa(1l, "maria", "17-11-12");
		return ResponseEntity.ok().body(p);
		
	}
}
