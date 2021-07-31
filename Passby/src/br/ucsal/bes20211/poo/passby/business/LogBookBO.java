package br.ucsal.bes20211.poo.passby.business;

import java.util.List;

import br.ucsal.bes20211.poo.passby.domain.Ocorrencia;
import br.ucsal.bes20211.poo.passby.persistence.LogBookDAO;

public class LogBookBO {
	
	public static boolean inserirOcorrencia(Ocorrencia oc) {
		if(oc.getDescricao() != null && oc.getDataOcorrencia() != null) {
			LogBookDAO.persistir(oc);
			return true;
		}
		return false;
	}
	
	public static String listarOcorrencias() {
		List<Ocorrencia> lista = LogBookDAO.listarOcorrencias();
		StringBuilder sb = new StringBuilder();
		
		for (Ocorrencia ocorrencia : lista) {
			sb.append(ocorrencia + "\n");
		}
		
		return sb.toString();
		
	}

}
