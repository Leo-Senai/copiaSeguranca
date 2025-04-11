package AulaJava01;

import java.util.Scanner;

public class ConversaoTemperatura {
       public static void main(String[] args) {
	
	//DECLARACAO DE VARIAVEIS
	double fahrenheit;
	final double CELSIUS;
	
	//ENTRADA DE DADOS
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em Fahrenheit: ");
	fahrenheit =ler.nextDouble();
			
	//PROCESSAMENTO
	CELSIUS =((( fahrenheit-32)*5)/9);
	
	//SAIDA
	System.out.println("A temperatura em Celsius é " + CELSIUS);
	ler.close();
}
} 
