package cassinolandiaAPP;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);		
		
	//System.out.println("BEM-VINDO AO CASSINOLANDIA\nDigite um numero para escolher a modalidade de jogo");
	//System.out.println("1-SOMALANDIA:\nDESCRIÇÃO: DOIS NUMEROS DE 0 A 10 SERAO GERADOS ALEATORIAMENTE E EM SEGUIDA SERAO SOMADOS, MULTIPLICADOS POR 1000 E DIVIDOS POR 10.\nCOMO JOGAR: DIGITE UM NUMERO DE 0 A 100 PARA SER O SEU RESULTADO ESPERADO\nCASO ACERTE O RESULTADO VOCE GANHARA A PARTIDA.\nBOA SORTE!!");
	double numDigitado = num.nextDouble();
	double resultado = OperacaoMatRandomizada.somaRandomizada(0, 0);
	if(numDigitado==OperacaoMatRandomizada.somaRandomizada(0, 0)) {
		System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD");
	}else if(numDigitado!=OperacaoMatRandomizada.somaRandomizada(0, 0)) {
		System.out.printf("Nao foi dessa vez! Tente novamente\n" + "RESULTADO: " + resultado);
		}
	//System.out.println(OperacaoMatRandomizada.multiplicacaoRandomizada(0, 0));	
	}
}
