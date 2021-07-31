package br.ucsal.bes20211.poo.passby.domain;

import br.ucsal.bes20211.poo.passby.domain.Enums.Cargo;
import br.ucsal.bes20211.poo.passby.domain.Enums.Sexo;

public class Funcionario extends Pessoa{
	
	private Cargo cargo;
	
	public Funcionario() {
	}

	public Funcionario(String nome, String dataNascimento, String rg, String telefone, Sexo sexo, Cargo cargo) {
		super(nome, dataNascimento, rg, telefone, sexo);
		this.cargo = cargo;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcioanário: " + getNome() + ", RG: " + getRg() + ", telefone: " + getTelefone() + ", cargo: " + cargo ;
	}
	
}
