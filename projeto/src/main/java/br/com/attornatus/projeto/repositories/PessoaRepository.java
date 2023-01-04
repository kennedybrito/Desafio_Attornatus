package br.com.attornatus.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.attornatus.projeto.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
