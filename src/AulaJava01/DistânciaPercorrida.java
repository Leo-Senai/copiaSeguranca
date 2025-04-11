package AulaJava01;

import java.util.Scanner;

public class DistânciaPercorrida {
	public static void main(String[] args) {
		//DECLARACAO DE VARIAVEIS
		final double GRAVIDADE=9.81;
		double valorAngulo,valorVelocidade,Distancia;
	
		
		//ENTRADA DE DADOS
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Informar o valor do Ângulo de lançamento(Graus) : ");
		valorAngulo=Math.toRadians(ler.nextDouble());//Conversão de radianos
		System.out.println("Informar o valor do valor de velocidade de lançamento(m/s): ");
		valorVelocidade=ler.nextDouble();
    
    	
    	//PROCESAMENTO
    	Distancia=(Math.pow(valorVelocidade, 2)*Math.sin(2* valorAngulo))/GRAVIDADE;
    	//Saida
    	System.out.println("A distancia total percorrida foi de : " + Distancia +"metros.");
    	ler.close();
    	
    	
		
	}

}
