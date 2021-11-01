package br.com.java.modelo;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String endereco;
	private Date nascido;
	
	public Pessoa() {

	}
	
	public Pessoa(String nome, String cpf, String endereco, Date nascido) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.nascido = nascido;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getNascido() {
		return nascido;
	}

	public void setNascido(Date nascido) {
		this.nascido = nascido;
	}
}
