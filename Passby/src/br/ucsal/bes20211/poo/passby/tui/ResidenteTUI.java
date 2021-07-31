package br.ucsal.bes20211.poo.passby.tui;

import java.util.Scanner;

import br.ucsal.bes20211.poo.passby.business.PessoaBO;
import br.ucsal.bes20211.poo.passby.domain.Apartamento;
import br.ucsal.bes20211.poo.passby.domain.Residente;
import br.ucsal.bes20211.poo.passby.domain.Enums.Sexo;
import br.ucsal.bes20211.poo.passby.persistence.ApartamentoDAO;

public class ResidenteTUI {

	private static Scanner sc = new Scanner(System.in);
	public static void cadastroResidente() {
		Apartamento[] ap = ApartamentoDAO.getApartamentos();

		System.out.print("Infome o nome do residente: ");
		String nome = sc.nextLine();
		System.out.print("Infome a data de nascimento do residente: ");
		String dataNascimento = sc.nextLine();
		System.out.print("Infome a RG do residente: ");
		String rg = sc.nextLine();
		System.out.print("Infome a telefone do residente: ");
		String telefone = sc.nextLine();
		System.out.println("Infome a sexo do residente: \n1 - para Masculino \n2 - para Feminino");
		int sexo = sc.nextInt();
		Sexo s = Sexo.valueOfCodigo(sexo);
		sc.nextLine();
		System.out.print("Infome o bloco do apartamento do residente: ");
		char bloco = sc.nextLine().charAt(0);
		System.out.print("Infome o número do apartamento do residente: ");
		String numeroApartamento = sc.nextLine();

		for (int i = 0; i < ApartamentoDAO.getApartamentos().length; i++) {
			if (ap[i].getNumeroApartamento().equals(numeroApartamento) && ap[i].getBloco() == bloco && ap[i] != null) {
				Residente obj = new Residente(nome, dataNascimento, rg, telefone, s, ap[i]);
				ap[i].adicionarResidente(obj);
				System.out.println(PessoaBO.iserirPessoa(obj));
				break;
			}
		}

	}
	
	public static void removerResidente() {
		System.out.print("Informe o RG do residente para remoção: ");
		String rg = sc.nextLine();
		System.out.println(PessoaBO.removerPessoa(rg) ? "Pessoa removida com sucesso": "Erro ao remover");
	}

}
