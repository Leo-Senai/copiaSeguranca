package AulaJava01;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ConversãoAnguloparaRadiano {
public static void main(String[] args) {
	
	//DECLARAÇÃO DE VARIAVEIS
	double valorAngulo,valorRadiano;

	
	//ENTRADA DE DADOS
	Scanner ler=new Scanner(System.in);
	
	System.out.println("Informar o valor do Ângulo para conversão: ");
	valorAngulo=ler.nextDouble();
	ler.close();
	
	//PROCESSAMENTO
	valorRadiano=((3.14*valorAngulo)/180);
	
	//SAIDA
	System.out.println("Informar o resultado : " +valorRadiano);
	
}

}
