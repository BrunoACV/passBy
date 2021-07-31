package br.ucsal.bes20211.poo.passby.domain;

import br.ucsal.bes20211.poo.passby.domain.Enums.Sexo;

public abstract class Pessoa {
	
	private String nome;
	private String dataNascimento;
	private String rg;
	private String telefone;
	private Sexo sexo;
	
	public Pessoa() {		
	}

	public Pessoa(String nome, String dataNascimento, String rg, String telefone, Sexo sexo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.telefone = telefone;
		this.sexo = sexo;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public abstract String toString();
	
}
