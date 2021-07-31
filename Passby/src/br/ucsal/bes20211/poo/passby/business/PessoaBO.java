package br.ucsal.bes20211.poo.passby.business;

import java.util.List;

import br.ucsal.bes20211.poo.passby.domain.Apartamento;
import br.ucsal.bes20211.poo.passby.domain.Funcionario;
import br.ucsal.bes20211.poo.passby.domain.Pessoa;
import br.ucsal.bes20211.poo.passby.domain.Residente;
import br.ucsal.bes20211.poo.passby.domain.Visitante;
import br.ucsal.bes20211.poo.passby.persistence.ApartamentoDAO;
import br.ucsal.bes20211.poo.passby.persistence.PessoaDAO;
import br.ucsal.bes20211.poo.passby.persistence.VagasVisitanteDAO;

public class PessoaBO {

	public static String iserirPessoa(Residente r) {
		if (r.getNome() != null && r.getDataNascimento() != null && r.getApartamento() != null && r.getRg() != null
				&& r.getSexo() != null && r.getTelefone() != null) {
			try {
				PessoaDAO.persistirPessoa(r);
				return "Pessoa cadastrada com sucesso";
			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Dados incompletos";
		}
	}

	public static String iserirPessoa(Visitante r) {
		if (r.getNome() != null && r.getDataNascimento() != null && r.getApartamento() != null && r.getRg() != null
				&& r.getSexo() != null && r.getTelefone() != null && r.getCheck_in() != null
				&& r.getCheck_out() != null) {
			try {
				PessoaDAO.persistirPessoa(r);
				return "Pessoa cadastrada com sucesso";
			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Dados incompletos";
		}
	}

	public static String iserirPessoa(Funcionario r) {
		if (r.getNome() != null && r.getDataNascimento() != null && r.getRg() != null && r.getSexo() != null
				&& r.getTelefone() != null && r.getCargo() != null) {
			try {
				PessoaDAO.persistirPessoa(r);
				return "Pessoa cadastrada com sucesso";
			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Dados incompletos";
		}
	}

	public static boolean removerPessoa(String rg) {
		if (PessoaDAO.procuraRg(rg) != null) {
			if (PessoaDAO.procuraRg(rg) instanceof Visitante) {
				VagasVisitanteDAO.removerVaga(PessoaDAO.procuraRg(rg));
				Apartamento[] ap = ApartamentoDAO.getApartamentos();
				Visitante v = (Visitante) PessoaDAO.procuraRg(rg);
				for (int i = 0; i < ApartamentoDAO.getApartamentos().length; i++) {
					if (ap[i] != null) {
						if (ap[i].equals(v.getApartamento())) {
							ap[i].removerVisitante(v);
						}
					}
				}
			}
			if (PessoaDAO.procuraRg(rg) instanceof Residente) {
				Apartamento[] ap = ApartamentoDAO.getApartamentos();
				Residente v = (Residente) PessoaDAO.procuraRg(rg);
				for (int i = 0; i < ApartamentoDAO.getApartamentos().length; i++) {
					if (ap[i] != null) {
						if (ap[i].equals(v.getApartamento())) {
							ap[i].removerResidente(v);
						}
					}
				}
			}
			PessoaDAO.remove(PessoaDAO.procuraRg(rg));
			return true;
		}
		return false;
	}

	public static String listarFuncionarios() {
		List<Pessoa> lista = PessoaDAO.listaPessoas();
		StringBuilder sb = new StringBuilder();

		for (Pessoa pessoa : lista) {
			if (pessoa instanceof Funcionario)
				sb.append(pessoa + "\n");
		}

		return sb.toString();

	}

}
