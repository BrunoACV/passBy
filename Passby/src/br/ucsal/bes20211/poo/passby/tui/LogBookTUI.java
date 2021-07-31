package br.ucsal.bes20211.poo.passby.tui;

import java.util.Date;
import java.util.Scanner;

import br.ucsal.bes20211.poo.passby.business.LogBookBO;
import br.ucsal.bes20211.poo.passby.domain.Ocorrencia;

public class LogBookTUI {
	
	private static Scanner sc = new Scanner(System.in);

	public static void cadastrarOcorrencia() {

		System.out.println("Informe a ocorrência:");
		String ocorrencia = sc.nextLine();
		
		Ocorrencia oc = new Ocorrencia(new Date(), ocorrencia);
        if(LogBookBO.inserirOcorrencia(oc)){
            System.out.println("Ocorrência cadastrada com sucesso!");
        } else {
        	System.out.println("Houve uma falha no registro da ocorrência.");
        }		

	}

	public static void listarOcorrencias() {
		System.out.println(LogBookBO.listarOcorrencias());
	}

}
