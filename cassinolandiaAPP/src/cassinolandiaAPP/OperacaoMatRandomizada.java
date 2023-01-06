package cassinolandiaAPP;

import java.util.Random;

public class OperacaoMatRandomizada {
	
	public static int somaRandomizada (){
		Random numeroAleatorio1 = new Random();
		int valorRandom1 = numeroAleatorio1.nextInt(50) +1;
		//System.out.println("TESTE: " + valorRandom1);
		Random numeroAleatorio2 = new Random();
		int valorRandom2 = numeroAleatorio2.nextInt(50) +1;
		//System.out.println("TESTE: " + valorRandom2);
		int calculoRandomizado = valorRandom1 + valorRandom2;
		//System.out.println("TESTE: " + calculoRandomizado);
		return calculoRandomizado;
	}
	public static int multiplicacaoRandomizada (){
		Random numeroAleatorio1 = new Random();
		int valorRandom1 = numeroAleatorio1.nextInt(10) +1;
		//System.out.println("TESTE: " + valorRandom1);
		Random numeroAleatorio2 = new Random();
		int valorRandom2 = numeroAleatorio2.nextInt(10) +1;
		//System.out.println("TESTE: " + valorRandom2);
		int calculoRandomizado = valorRandom1 * valorRandom2;
		//System.out.println("TESTE: " + calculoRandomizado);
		return calculoRandomizado;
	}
	public static int subtracaoRandomizada (){
		Random numeroAleatorio1 = new Random();
		int valorRandom1 = numeroAleatorio1.nextInt(50) +1;
		//System.out.println("TESTE: " + valorRandom1);
		Random numeroAleatorio2 = new Random();
		int valorRandom2 = numeroAleatorio2.nextInt(50) +1;
		//System.out.println("TESTE: " + valorRandom2);
		int calculoRandomizado = valorRandom1 - valorRandom2;
		//System.out.println("TESTE: " + calculoRandomizado);
		return calculoRandomizado;
	}
	public static int divisaoRandomizada (){
		Random numeroAleatorio1 = new Random();
		int valorRandom1 = numeroAleatorio1.nextInt(50) +1;
		//System.out.println("TESTE: " + valorRandom1);
		Random numeroAleatorio2 = new Random();
		int valorRandom2 = numeroAleatorio2.nextInt(50) +1;
		//System.out.println("TESTE: " + valorRandom2);
		int calculoRandomizado = valorRandom1 / valorRandom2;
		//System.out.println("TESTE: " + calculoRandomizado);
		return calculoRandomizado;
	}
	public static int sorteadorNumRandomizada (){
		Random numeroAleatorio1 = new Random();
		int valorRandom1 = numeroAleatorio1.nextInt(10) +1;
		//System.out.println("TESTE: " + valorRandom1);
		return valorRandom1;
	}
}

//numeros impares x numeros pares (luta dos times)