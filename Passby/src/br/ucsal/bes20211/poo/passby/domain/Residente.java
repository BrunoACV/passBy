package br.ucsal.bes20211.poo.passby.domain;

import br.ucsal.bes20211.poo.passby.domain.Enums.Sexo;

public class Residente extends Pessoa {

	private Apartamento apartamento;

	public Residente() {
	}

	public Residente(String nome, String dataNascimento, String rg, String telefone, Sexo sexo,
			Apartamento apartamento) {
		super(nome, dataNascimento, rg, telefone, sexo);
		this.apartamento = apartamento;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	@Override
	public String toString() {
		return "Residente: " + getNome() + ", apartamento: " + apartamento + ", telefone: " + getTelefone();
	}

}
