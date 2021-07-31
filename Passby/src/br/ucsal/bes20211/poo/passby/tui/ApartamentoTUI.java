package br.ucsal.bes20211.poo.passby.tui;

import java.util.Scanner;

import br.ucsal.bes20211.poo.passby.business.ApartamentoBO;
import br.ucsal.bes20211.poo.passby.domain.Apartamento;

public class ApartamentoTUI {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void cadastrarApartamento() {
		
		System.out.print("Informe o bloco do apartamento a ser cadastrado: ");
		char bloco = sc.nextLine().charAt(0);
		System.out.print("Informe o número do apartamento a ser cadastrado: ");
		String numero = sc.nextLine();
		Apartamento obj = new Apartamento(bloco, numero);
		
		String cadastro = ApartamentoBO.incluirApartamento(obj);
		
		System.out.println(cadastro);		
	}
	
	public static void listarApartamento() {
		System.out.println(ApartamentoBO.listarApartamentos());
	}
	
}
