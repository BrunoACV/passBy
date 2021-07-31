package br.ucsal.bes20211.poo.passby.tui;

import java.util.Scanner;

import br.ucsal.bes20211.poo.passby.business.PessoaBO;
import br.ucsal.bes20211.poo.passby.business.VagasVisitanteBO;
import br.ucsal.bes20211.poo.passby.domain.Apartamento;
import br.ucsal.bes20211.poo.passby.domain.Visitante;
import br.ucsal.bes20211.poo.passby.domain.Enums.Sexo;
import br.ucsal.bes20211.poo.passby.persistence.ApartamentoDAO;

public class VisitanteTUI {
	
	private static Scanner sc = new Scanner(System.in);
	public static void cadastroVisitante() {
		
		System.out.print("Informe o nome do visitante: ");
		String nome = sc.nextLine();
		System.out.print("Informe a data de nascimento do visitante: ");
		String dataNascimento = sc.nextLine();
		System.out.print("Informe a RG do visitante: ");
		String rg = sc.nextLine();
		System.out.print("Informe a telefone do visitante: ");
		String telefone = sc.nextLine();
		System.out.println("Informe a sexo do visitante: \n1 - para Masculino \n2 - para Feminino");
		int sexo = sc.nextInt();
		Sexo s = Sexo.valueOfCodigo(sexo);
		sc.nextLine();
		System.out.print("Infome o bloco do apartamento do visitante: ");
		char bloco = sc.nextLine().charAt(0);
		System.out.print("Informe o número do apartamento do visitante: ");
		String numeroApartamento = sc.nextLine();
		System.out.println("Informe entrada: ");
		String checkin = sc.nextLine();
		System.out.println("Informe saida: ");
		String checkout = sc.nextLine();
		
		Apartamento[] ap = ApartamentoDAO.getApartamentos(); 
		for (int i = 0; i < ApartamentoDAO.getApartamentos().length; i++) {
			if (ap[i].getNumeroApartamento().equals(numeroApartamento) && ap[i].getBloco() == bloco && ap[i] != null) {
				Visitante v = new Visitante(nome, dataNascimento, rg, telefone, s, ap[i], checkin, checkout);
				if (PessoaBO.iserirPessoa(v).equals("Pessoa cadastrada com sucesso")) {
					ap[i].adicionarVisitante(v);
					System.out.println("Cadastrado com sucesso");
				} else {
					System.out.println("Erro ao cadastrar");
				}
				System.out.println("Quer vaga? S/N");
				char vaga = sc.nextLine().charAt(0);
				if(vaga == 'S') {
					VagasVisitanteBO.inserirVaga(v);
				}
				break;
			}
		}
	}
	
	public static void removerVisitante() {
		System.out.print("Informe o RG do visitante para remoção: ");
		String rg = sc.nextLine();
		System.out.println(PessoaBO.removerPessoa(rg) ? "Pessoa removida com sucesso": "Erro ao remover");
	}

}
