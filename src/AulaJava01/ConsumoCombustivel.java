package AulaJava01;

import java.util.Scanner;

    public class ConsumoCombustivel {
    public static void main(String[] args) {
	
    	//DECLARACAO DE VARIAVEIS
	double valLitro ,distanciaKM ,consumo,totalLitros,totalGasto;
	//ENTRADA DE DADOS
	Scanner ler =new Scanner(System.in);
	
	System.out.println("Informe o valor do Litro de combustivel (R$):");
	valLitro =ler.nextDouble();
	System.out.println("Informe a distancia percorrida (KM):");
	distanciaKM =ler.nextDouble();
	System.out.println("Informe o consumo médio (KM/l):");
	consumo =ler.nextDouble();
	
	//PROCESSAMENTO
	totalLitros =distanciaKM/consumo;
	totalGasto =totalLitros *valLitro;
	
	//SAIDA
	System.out.println("O total de litros consumidos é: " + totalLitros + "litros");
	System.out.println("o total gasto em R$ :" + totalGasto);
	ler.close();
}
}
