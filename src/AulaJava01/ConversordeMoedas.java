package AulaJava01;

import java.util.Scanner;

public class ConversordeMoedas {
public static void main(String[] args) {
	//DECLARACAO DE VARIAVEIS
	double valorReal;
	double cotacaoMoeda;
	double valorConvertido;
	
	//ENTRADAS DE DADOS
	Scanner ler =new Scanner(System.in);
	
	System.out.println("Digite o valor em reais: ");
	valorReal = ler.nextDouble();
	
	System.out.println("Digite a cotação da moeda desejada: ");
	cotacaoMoeda = ler.nextDouble();
			
	//PROCESSAMENTO
			valorConvertido =valorReal * cotacaoMoeda;
	//SAIDA
			
	System.out.println("O valor convertido para a moeda desejada é: "+ valorConvertido);
	ler.close();
}
}
