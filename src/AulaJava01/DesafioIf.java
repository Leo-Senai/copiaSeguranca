package AulaJava01;

import java.util.Scanner;

public class DesafioIf {

	public static void main(String[] args) {
		double nota1; 
		double nota2; 
		double nota3; 
		double nota4; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a nota 1 : ");
		nota1 = ler.nextDouble(); 
		System.out.println("Informe a nota 2 : ");
		nota2 = ler.nextDouble(); 
		System.out.println("Informe a nota 3 : ");
		nota3 = ler.nextDouble(); 
		System.out.println("Informe a nota 4 : ");
		nota4 = ler.nextDouble(); 
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Sua média é: "+ media);
		
		if (media >= 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		ler.close();
	}
}
