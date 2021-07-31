package br.ucsal.bes20211.poo.passby.persistence;

import br.ucsal.bes20211.poo.passby.domain.Pessoa;

public class VagasVisitanteDAO {
	
	public static Pessoa[] vagasVisitante = new Pessoa[20];
	
	public static boolean preencherVaga(Pessoa v) {
		boolean b = false;
		for (int i = 0; i < vagasVisitante.length; i++) {
			if (vagasVisitante[i] == null) {
				vagasVisitante[i] = v;
				b = true;
				break;
			} 
		}
		return b;		
	}
	
	public static boolean removerVaga(Pessoa v){
		
		for (int i = 0; i < vagasVisitante.length; i++) {
			if (vagasVisitante[i].equals(v)) {
				vagasVisitante[i] = null;
				return true;
			}
		}
		
		return false;
	}

	public static Pessoa[] getVagasVisitante() {
		return vagasVisitante;
	}
	
	
	
}
