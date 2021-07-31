package br.ucsal.bes20211.poo.passby.business;

import br.ucsal.bes20211.poo.passby.domain.Pessoa;
import br.ucsal.bes20211.poo.passby.persistence.VagasVisitanteDAO;

public class VagasVisitanteBO {

	public static boolean inserirVaga(Pessoa v) {
		return VagasVisitanteDAO.preencherVaga(v);
	}
	
	public static String listarVagas() {
		
		Pessoa[] vagasVisitante = VagasVisitanteDAO.getVagasVisitante();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < vagasVisitante.length; i++) {
			if (vagasVisitante[i] == null) {
				sb.append(" Livre ");
			}else{
				sb.append(" " + vagasVisitante[i].getNome() + " ");
			}
		}
		
		return sb.toString();
	}
}
