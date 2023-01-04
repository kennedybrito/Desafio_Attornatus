package br.com.attornatus.projeto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.attornatus.projeto.entity.Pessoa;
import br.com.attornatus.projeto.repositories.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	// Classe de teste para popular o Banco de dados H2
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public void run(String... args) throws Exception {
		// metodo run do commandLineRunner, para executar primeiro antes da aplicação
		
		Pessoa p1 = new Pessoa(null, "Jaqueline Torres", "17-05-1999");
		Pessoa p2 = new Pessoa(null, "Firmino Torres", "20-05-1990");
		Pessoa p3 = new Pessoa(null, "Antonio Nunes Alves", "18-10-1980");
		
		pessoaRepository.saveAll(Arrays.asList(p1,p2,p3));
	}

}
