package br.com.attornatus.projeto.entity;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	private EnderecoPrincipal enderecoPrincipal;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String logradouro;
	private String cep;
	private String cidade;
	private int numero;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Pessoa cliente;
	
	public Endereco() {
		
	}

	public Endereco(Long id, String logradouro, EnderecoPrincipal enderecoPrincipa , String cep, String cidade, int numero, Pessoa cliente) {
		super();
		Id = id;
		this.logradouro = logradouro;
		this.setEnderecoPrincipal(enderecoPrincipa);
		this.cep = cep;
		this.cidade = cidade;
		this.numero = numero;
		this.cliente = cliente;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(Id, other.Id);
	}

	public EnderecoPrincipal getEnderecoPrincipal() {
		return enderecoPrincipal;
	}

	public void setEnderecoPrincipal(EnderecoPrincipal enderecoPrincipal) {
		this.enderecoPrincipal = enderecoPrincipal;
	}
	
	
}
