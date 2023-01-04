package br.com.attornatus.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.attornatus.projeto.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
