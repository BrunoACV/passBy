package br.ucsal.bes20211.poo.passby.tui;

import java.util.Scanner;

public class MenuTUI {
	
	private static Scanner SCANNER = new Scanner(System.in);

	public static void executar() {
		MenuOpcoesEnum opcaoSelecionada;
		do {
			exibir();
			opcaoSelecionada = obterOpcaoDeseja();
			if (opcaoSelecionada == null)
				opcaoSelecionada = MenuOpcoesEnum.DEFAULT;
			executarOpcaoDesejada(opcaoSelecionada);

		} while (!opcaoSelecionada.equals(MenuOpcoesEnum.SAIR));		
	}
	
	private static void exibir() {
		System.out.println("\n################# MENU ################# ");
		for (MenuOpcoesEnum menuOpcao : MenuOpcoesEnum.values()) {
			if(menuOpcao.getCodigo() != 14)
			System.out.println(menuOpcao.obterDescricaoCompleta());
			else
				continue;
		}
	}

	private static MenuOpcoesEnum obterOpcaoDeseja() {
		System.out.print("Informe o código da ação desejada: ");
		Integer opcaoInteger = SCANNER.nextInt();	
		return MenuOpcoesEnum.valueOfCodigo(opcaoInteger);
	}
	
	private static void executarOpcaoDesejada(MenuOpcoesEnum opcaoSelecionada) {
		switch (opcaoSelecionada) {
		case CADASTRAR_APARTAMENTO:			
			ApartamentoTUI.cadastrarApartamento();
			break;
		case CADASTRAR_RESIDENTE:
			ResidenteTUI.cadastroResidente();
			break;
		case CADASTRAR_FUNCIONARIO:
			FuncionarioTUI.cadastroFuncionario();
			break;	
		case CADASTRAR_OCORRENCIA:
			LogBookTUI.cadastrarOcorrencia();
			break;
		case CADASTRAR_VISITANTE:
			VisitanteTUI.cadastroVisitante();
			break;
		case REMOVER_VISITANTE:
			VisitanteTUI.removerVisitante();
			break;
		case REMOVER_RESIDENTE:
			ResidenteTUI.removerResidente();
			break;
		case REMOVER_FUNCIONARIO:
			FuncionarioTUI.removerFuncionario();
			break;
		case LISTAR_APARTAMENTOS:
			ApartamentoTUI.listarApartamento();
			break;
		case LISTAR_FUNCIONARIOS:
			FuncionarioTUI.listarFuncionarios();
			break;
		case LISTAR_OCORRENCIAS:
			LogBookTUI.listarOcorrencias();
			break;
		case LISTAR_VAGAS_VISITANTES:
			VagasVisitanteTUI.listarVagas();
			break;
		case SAIR:
			System.out.println("Até a próxima...");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}

}
