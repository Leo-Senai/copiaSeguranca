package AulaJava02;

import java.util.Scanner;

public class DesafioIf {
	
	public static void main(String[] args) {
		// DECLARAÇÃO DAS VARIAVEIS
				double nota01, nota02, nota03, nota04, media;
				// ENTRADA DE DADOS

				Scanner ler = new Scanner(System.in);

				System.out.println("Informe o valor nota 01:");
				nota01 = ler.nextDouble();

				System.out.println("Informe o valor nota 02: ");
				nota02 = ler.nextDouble();

				System.out.println("Informe o valor nota 03: ");
				nota03 = ler.nextDouble();

				System.out.println("Informe o valor nota 04: ");
				nota04 = ler.nextDouble();

				//PROCESSAMENTO
				media = (nota01 + nota02 + nota03 + nota04) / 4;
				//SAIDA
				if (media >= 6) {
					System.out.println("Aprovado");
				} else {
					System.out.println("Reprovado");
				}

				ler.close();

	}

}
