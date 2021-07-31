package br.ucsal.bes20211.poo.passby.domain;

import java.util.ArrayList;
import java.util.List;

public class Apartamento {

	private Character bloco;
	private String numeroApartamento;
	private List<Residente> residentes = new ArrayList<>();
	private List<Visitante> visitantes = new ArrayList<>();

	public Apartamento() {
	}

	public Apartamento(Character bloco, String numeroApartamento) {
		super();
		this.bloco = bloco;
		this.numeroApartamento = numeroApartamento;
	}

	public Character getBloco() {
		return bloco;
	}

	public void setBloco(Character bloco) {
		this.bloco = bloco;
	}

	public String getNumeroApartamento() {
		return numeroApartamento;
	}

	public void setNumeroApartamento(String numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}

	public List<Residente> getResidentes() {
		return residentes;
	}

	public void adicionarResidente(Residente residentes) {
		this.residentes.add(residentes);
	}

	public void adicionarVisitante(Visitante visitante) {
		this.visitantes.add(visitante);
	}
	
	public void removerResidente(Residente residentes) {
		this.residentes.remove(residentes);
	}

	public void removerVisitante(Visitante visitante) {
		this.visitantes.remove(visitante);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nApartamento bloco: " + bloco + ", numero: " + numeroApartamento);
		sb.append("\nResidentes:\n");
		
		for (Residente residente : residentes) {
			sb.append(residente.getNome() + "\n");
		}
		
		sb.append("\nVisitantes:\n");
		
		for (Visitante visitante : visitantes) {
			sb.append(visitante.getNome() + "\n");
		}
		
		return sb.toString();
	}

}
