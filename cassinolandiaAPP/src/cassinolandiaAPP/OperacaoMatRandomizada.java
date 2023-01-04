package cassinolandiaAPP;

import java.util.Random;

public class OperacaoMatRandomizada {
	
	public static int somaRandomizada (){
		Random numeroAleatorio1 = new Random();
		int valorRandom1 = numeroAleatorio1.nextInt(50) +1;
		Random numeroAleatorio2 = new Random();
		int valorRandom2 = numeroAleatorio2.nextInt(50) +1;
		int calculoRandomizado = valorRandom1 + valorRandom2;
		return calculoRandomizado;
	}
	public static int multiplicacaoRandomizada (){
		Random numeroAleatorio1 = new Random();
		int valorRandom1 = numeroAleatorio1.nextInt(10) +1;
		Random numeroAleatorio2 = new Random();
		int valorRandom2 = numeroAleatorio2.nextInt(10) +1;
		int calculoRandomizado = valorRandom1 * valorRandom2;
		return calculoRandomizado;
	}
}