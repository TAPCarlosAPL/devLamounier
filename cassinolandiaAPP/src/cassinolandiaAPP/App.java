package cassinolandiaAPP;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);		
	
		do{
			
			System.out.println("BEM-VINDO AO CASSINOLANDIA\nDigite um numero para escolher a modalidade de jogo");
			System.out.println("1-SOMALANDIA\n2-SUBTRACAOLANDIA\n3-MULTIPLICALANDIA\n4-DIVISAOLANDIA\n5-NUMEROLANDIA\n6-REGRAS\n0-SAIR");
			int numOpcao = num.nextInt();
			
			
			switch (numOpcao) {
			//AS INSTRUÇÕES DO CASE 1: O USUÁRIO DIGITARÁ UM NÚMERO CORRESPONDENTE AO PALPITE DE RESULTADO ESPERADO POR ELE
			//SERÃO GERADOS 2 NÚMEROS INTEIROS ALEATÓRIOS E, EM SEGUIDA, ESTES DOIS NÚMEROS SERÃO SOMADOS, MULTIPLICADOS POR 1000 E DIVIDIDOS POR 10
			//EM SEGUIDA O RESULTADO DA SOMA SERÁ COMPARADA COM O PALPITE QUE FORA DIGITADO PELO USUÁRIO
			case 1:
				System.out.println("1-SOMALANDIA: ACERTE O RESULTADO DA SOMA! BOA SORTE!!");
				int numDigitado1 = num.nextInt();
				int resultado1 = OperacaoMatRandomizada.somaRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado1==resultado1) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD");
				}else{System.out.printf("Nao foi dessa vez! Tente novamente\n" + "RESULTADO: " + resultado1 + "\n");}
				break;
			case 2:
				System.out.println("2-MULTIPLICALANDIA: ACERTE O RESULTADO DA MULTIPLICACAO! BOA SORTE!!");
				int numDigitado2 = num.nextInt();
				int resultado2 = OperacaoMatRandomizada.multiplicacaoRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado2==resultado2) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD");
				}else{System.out.printf("Nao foi dessa vez! Tente novamente\n" + "RESULTADO: " + resultado2 + "\n");}
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("REGRAS: EM TODAS AS MODALIDADES, OS NUMEROS SAO GERADOS DE 1 A 100. DIGITE APENAS NUMEROS ENTRE 1 E 100");
				break;
			default: 
				System.out.println("Opcao nao encontrada. Digite uma opcao valida.");
				break;
			}
		}while(1==1);
	}
}
