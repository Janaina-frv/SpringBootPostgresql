package com.example.demo.models;

import jakarta.persistence.*;

@Table(name="Cliente")
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clienteId;
	private String nome;
	private String cpf;
	private int idade;
	private String sexo;
	private String profissao;
	private int salario;
	private int patrimonio;
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(int patrimonio) {
		this.patrimonio = patrimonio;
	}
	public Cliente(String nome, String cpf, int idade, String sexo, String profissao, int salario,
			int patrimonio) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.profissao = profissao;
		this.salario = salario;
		this.patrimonio = patrimonio;
	}
	public Cliente() {
		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
