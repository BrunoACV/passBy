package br.ucsal.bes20211.poo.passby.persistence;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.bes20211.poo.passby.domain.Ocorrencia;

public class LogBookDAO {
	
	private static List<Ocorrencia>	logbook = new ArrayList<>(); 
	
	
	public static void persistir(Ocorrencia oc) {
		logbook.add(oc);
	}
	
	public static List<Ocorrencia> listarOcorrencias() {
		List<Ocorrencia> list = logbook;
		return list;		
	}


}
