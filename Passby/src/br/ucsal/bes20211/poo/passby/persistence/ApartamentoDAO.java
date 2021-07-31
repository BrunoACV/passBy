package br.ucsal.bes20211.poo.passby.persistence;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.ucsal.bes20211.poo.passby.domain.Apartamento;

public class ApartamentoDAO {

	private static final Apartamento[] apartamentos = new Apartamento[120];

	private static int contador() {
		int index = 0;
		for (int i = 0; i < apartamentos.length; i++) {
			if (apartamentos[i] != null) {
				index++;
			}
		}
		return index;
	}

	public static boolean persistir(Apartamento ap) throws Exception {
		int posicao = contador();
		if (apartamentos.length == posicao) {
			return false;
		} else {
			verificarDuplicidade(ap);
			apartamentos[posicao] = ap;
			return true;
		}
	}

	private static void verificarDuplicidade(Apartamento ap) throws Exception {
		for (int i = 0; i < apartamentos.length; i++) {
			if(apartamentos[i] != null) {
				if(apartamentos[i].getBloco().equals(ap.getBloco()) && apartamentos[i].getNumeroApartamento().equals(ap.getNumeroApartamento())) {
					throw new Exception("Apartamento já cadastrado");
				}				
			}
		}		
	}

	public static Apartamento[] getApartamentos() {
		return apartamentos;
	}

	public static List<Apartamento> listaApartamentos() {
		List<Apartamento> list = new ArrayList<>();
		for (int i = 0; i < ApartamentoDAO.apartamentos.length; i++) {
			if (ApartamentoDAO.apartamentos[i] != null)
				list.add(apartamentos[i]);
		}
		list.sort(Comparator.comparing(Apartamento::getBloco).thenComparing(Apartamento::getNumeroApartamento));
		return list;
	}

}
