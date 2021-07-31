package br.ucsal.bes20211.poo.passby.persistence;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.bes20211.poo.passby.domain.Pessoa;

public class PessoaDAO {
	
	private static List<Pessoa> pessoas = new ArrayList<>();
	
	public static void persistirPessoa(Pessoa p) throws Exception {
		verificarDuplicidade(p);
		pessoas.add(p);
	}
	
	private static void verificarDuplicidade(Pessoa p) throws Exception {
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getRg().equals(p.getRg())) {
				throw new Exception("RG duplicado");
			}
		}
		
	}

	public static Pessoa procuraRg(String Rg) {
		Pessoa pe = null;
		for (Pessoa p : pessoas) {
			if(p.getRg().equals(Rg)) {
				pe = p;
				break;
			}
		}
		return pe;
	}
	
	public static void remove(Pessoa p) {
		pessoas.remove(p);
	}
	
	public static List<Pessoa> listaPessoas(){
		List<Pessoa> lista = pessoas;
		return lista;
	}
	
}
