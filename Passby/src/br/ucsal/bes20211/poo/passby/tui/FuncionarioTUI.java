package br.ucsal.bes20211.poo.passby.tui;

import java.util.Scanner;

import br.ucsal.bes20211.poo.passby.business.PessoaBO;
import br.ucsal.bes20211.poo.passby.domain.Funcionario;
import br.ucsal.bes20211.poo.passby.domain.Enums.Cargo;
import br.ucsal.bes20211.poo.passby.domain.Enums.Sexo;

public class FuncionarioTUI {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void cadastroFuncionario() {
		System.out.print("Informe o nome do funcion�rio: ");
		String nome = sc.nextLine();
		System.out.print("Informe a data de nascimento do funcion�rio: ");
		String dataNascimento = sc.nextLine();
		System.out.print("Informe a RG do funcion�rio: ");
		String rg = sc.nextLine();
		System.out.print("Informe a telefone do funcion�rio: ");
		String telefone = sc.nextLine();
		System.out.println("Informe a sexo do funcion�rio: \n1 - para Masculino \n2 - para Feminino");
		int sexo = sc.nextInt();
		Sexo s = Sexo.valueOfCodigo(sexo);
		System.out.println("Informe o cargo do funcion�rio: \n1 - para Porteiro \n2 - para Zelador \n3 - para Administrador");
		int cargo = sc.nextInt();
		Cargo c = Cargo.valueOfCodigo(cargo);
		sc.nextLine();
		Funcionario obj = new Funcionario(nome, dataNascimento, rg, telefone, s,c);
		System.out.println(PessoaBO.iserirPessoa(obj));
	}
	
	public static void removerFuncionario() {
		System.out.print("Informe o RG do funcion�rio para remo��o: ");
		String rg = sc.nextLine();
		System.out.println(PessoaBO.removerPessoa(rg) ? "Pessoa removida com sucesso": "Erro ao remover");
	}
	
	public static void listarFuncionarios() {
		System.out.println(PessoaBO.listarFuncionarios());
	}

}
