package br.ucsal.bes20211.poo.passby.domain;

import br.ucsal.bes20211.poo.passby.domain.Enums.Sexo;

public class Visitante extends Pessoa {

	private Apartamento apartamento;
	private String check_in;
	private String check_out;
	

	public Visitante() {

	}

	public Visitante(String nome, String dataNascimento, String rg, String telefone, Sexo sexo, Apartamento apartamento,
			String check_in, String check_out) {
		super(nome, dataNascimento, rg, telefone, sexo);
		this.apartamento = apartamento;
		this.check_in = check_in;
		this.check_out = check_out;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public String getCheck_in() {
		return check_in;
	}

	public void setCheck_in(String check_in) {
		this.check_in = check_in;
	}

	public String getCheck_out() {
		return check_out;
	}

	public void setCheck_out(String check_out) {
		this.check_out = check_out;
	}

	@Override
	public String toString() {
		return "Visitante: " + getNome() + ", apartamento: " + apartamento + ", check_in: " + check_in + ", check_out:" + check_out;
	}

}
