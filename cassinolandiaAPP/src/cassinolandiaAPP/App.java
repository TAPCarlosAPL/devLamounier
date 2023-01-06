package cassinolandiaAPP;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);		
	
		do{
			
			System.out.println("BEM-VINDO AO CASSINOLANDIA\nDigite um numero para escolher a modalidade de jogo");
			System.out.println("1-SOMALANDIA\n2-MULTIPLICALANDIA\n3-SUBTRACAOLANDIA\n4-DIVISAOLANDIA\n5-NUMEROLANDIA\n6-JOGO DAS CORES\n0-SAIR");
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
				System.out.println("3-SUBTRALANDIA: ACERTE O RESULTADO DA SUBTRACAO! BOA SORTE!!");
				int numDigitado3 = num.nextInt();
				int resultado3 = OperacaoMatRandomizada.subtracaoRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado3==resultado3) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD");
				}else{System.out.printf("Nao foi dessa vez! Tente novamente\n" + "RESULTADO: " + resultado3 + "\n");}
				break;
			case 4:
				System.out.println("4-DIVISAOLANDIA: ACERTE O RESULTADO DA DIVISAO! BOA SORTE!!");
				int numDigitado4 = num.nextInt();
				int resultado4 = OperacaoMatRandomizada.divisaoRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado4==resultado4) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD");
				}else{System.out.printf("Nao foi dessa vez! Tente novamente\n" + "RESULTADO: " + resultado4 + "\n");}
				break;
			case 5:
				System.out.println("5-NUMEROLANDIA: ACERTE O NÚMERO ALEATÓRIO! NÚMEROS ENTRE 1 E 10. BOA SORTE!!");
				int numDigitado5 = num.nextInt();
				int resultado5 = OperacaoMatRandomizada.sorteadorNumRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado5==resultado5) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD");
				}else{System.out.printf("Nao foi dessa vez! Tente novamente\n" + "RESULTADO: " + resultado5 + "\n");}
				break;
			case 6:
				System.out.println("6-JOGO DAS CORES: ESCOLHA UMA COR\n1-VERMELHO\n2-PRETO");
				int numDigitado6 = num.nextInt();
				int resultado6 = ComparadorCores.comparador();
				
				//VALIDADOR DE RESULTADO COR VERMELHA
				if(numDigitado6==1) {
					System.out.println("PALPITE: VERMELHO");
					int resultPalpite = resultado6;
					if((resultPalpite %2)!=0) {
						System.out.println("COR: VERMELHO\n");
						System.out.println("PARABENS! VOCE ACERTOU\n\n");
						//System.out.println("TESTE: " + resultPalpite);
					}else if((resultPalpite %2)==0) {
						System.out.println("COR: PRETO\n");
						System.out.println("VOCE ERROU! TENTE OUTRA VEZ ;/\n\n");
						//System.out.println("TESTE: " + resultPalpite);
													}
				//VALIDADOR DE RESULTADO COR PRETA	
				}else if(numDigitado6==2) {
					System.out.println("PALPITE: PRETO");
					int resultPalpite2 = resultado6;
					if((resultPalpite2 %2)==0) {
						System.out.println("COR: PRETO\n");
						System.out.println("PARABENS! VOCE ACERTOU\n\n");
						//System.out.println("TESTE: " + resultPalpite2);
					}else if((resultPalpite2 %2)!=0) {
						System.out.println("COR: VERMELHO\n");
						System.out.println("VOCE ERROU! TENTE OUTRA VEZ ;/\n\n");
						//System.out.println("TESTE: " + resultPalpite2);
													 }
										   }
				break;
			default: 
				System.out.println("Opcao nao encontrada. Digite uma opcao valida.");
				break;
			}
		}while(1==1);
	}
}
