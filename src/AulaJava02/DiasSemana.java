package AulaJava02;

import java.util.Scanner;

public class DiasSemana {
public static void main(String[] args) {
	//DECLARAÇÃO DE VARIAVEIS
	
	int num	;
	Scanner ler= new Scanner(System.in);
	System.out.println("Informe o numero:");
	num = ler.nextInt();
	ler.close();
	
	
	if(num==1) {
	System.out.println("Domingo");
	
	}else if (num==2) {
		System.out.println("Segunda");
	}else if (num==3) {
		System.out.println("terca");
	}else if (num==4) {
		System.out.println("quarta");
	}else if (num==5) {
		System.out.println("quinta");
	}else if (num==6) {
		System.out.println("sexta");
	}else if (num==7) {
		System.out.println("Sabado");
		
	}else {
			System.out.println("Invalido");
	}
}
}
	
	


