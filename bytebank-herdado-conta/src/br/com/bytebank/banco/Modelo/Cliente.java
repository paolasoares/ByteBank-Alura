package br.com.bytebank.banco.Modelo;

/*
 * Classe que representa um cliente no bytebank
 * 
 * @author Paola
 * @version 0.1
 */

public class Cliente extends Object {
	
	private String nome;
	private String cpf;
	private String profissao;

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

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
