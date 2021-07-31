package br.ucsal.bes20211.poo.passby.business;

import java.util.List;

import br.ucsal.bes20211.poo.passby.domain.Apartamento;
import br.ucsal.bes20211.poo.passby.persistence.ApartamentoDAO;

public class ApartamentoBO {

	public static String incluirApartamento(Apartamento ap) {

		if (ap.getBloco() != null && ap.getNumeroApartamento() != null) {
			try {
				if (ApartamentoDAO.persistir(ap)) {
					return "Cadastrado com sucesso";
				} else {
					return "Não há mais espaço para cadastro de um novo apartamento";
				}
			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Dados incompletros";
		}
	}

	public static String listarApartamentos() {
		List<Apartamento> lista = ApartamentoDAO.listaApartamentos();
		StringBuilder sb = new StringBuilder();

		for (Apartamento apartamento : lista) {
			sb.append(apartamento + "\n");
		}

		return sb.toString();

	}
}
