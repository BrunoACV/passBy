package br.ucsal.bes20211.poo.passby.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ocorrencia {

	private Date dataOcorrencia;
	private String descricao;

	public Ocorrencia() {

	}
	public Ocorrencia(Date dataOcorrencia, String descricao){
		super();
		this.dataOcorrencia=dataOcorrencia;
		this.descricao=descricao;
	}
	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}
	public void setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return "Ocorrencia: Data da ocorrência:" + sdf.format(dataOcorrencia) + ", Descricao:" + descricao;
	}	
	
	
}
