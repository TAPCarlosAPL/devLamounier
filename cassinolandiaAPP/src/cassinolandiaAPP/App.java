package cassinolandiaAPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		boolean opSair = false;
		
		List<String> pessoas = new ArrayList<>();
		pessoas.add("Carlos");
		pessoas.add("Lucas");
		pessoas.add("Marcos");
		
		System.out.println("Selecione um jogador digitando 0, 1 ou 2: ");
		System.out.println(pessoas);
		int escolhaJogador = num.nextInt();
		
		if(escolhaJogador==0) {
			System.out.println("Você selecionou o jogador " + pessoas.get(0));
		}else if(escolhaJogador==1) {
			System.out.println("Você selecionou o jogador " + pessoas.get(1));
		}else if(escolhaJogador==2) {
			System.out.println("Você selecionou o jogador " + pessoas.get(2));
		}
		
		do{
			
			System.out.println("BEM-VINDO AO CASSINOLANDIA\nDigite um numero para escolher a modalidade de jogo");
			System.out.println("1-SOMALANDIA\n2-MULTIPLICALANDIA\n3-SUBTRACAOLANDIA\n4-DIVISAOLANDIA\n5-NUMEROLANDIA\n6-JOGO DAS CORES\n0-SAIR");
			int numOpcao = num.nextInt();		
			
			switch (numOpcao) {
			case 1:
				System.out.println("1-SOMALANDIA: ACERTE O RESULTADO DA SOMA! BOA SORTE!!");
				int numDigitado1 = num.nextInt();
				int resultado1 = OperacaoMatRandomizada.somaRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado1==resultado1) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD\n\n");
					System.out.printf("RESULTADO: " + resultado1 + "\nPALPITE: " + numDigitado1 + "\n\n");
				}else{System.out.printf("Puuuxa, nao foi dessa vez! TENTE OUTRA VEZ" + "\nRESULTADO: " + resultado1 + "\nPALPITE: " + numDigitado1 + "\n\n");}
				break;
			case 2:
				System.out.println("2-MULTIPLICALANDIA: ACERTE O RESULTADO DA MULTIPLICACAO! BOA SORTE!!");
				int numDigitado2 = num.nextInt();
				int resultado2 = OperacaoMatRandomizada.multiplicacaoRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado2==resultado2) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD\n\n");
					System.out.printf("RESULTADO: " + resultado2 + "\nPALPITE: " + numDigitado2 + "\n\n");
				}else{System.out.printf("Puuuxa, nao foi dessa vez! TENTE OUTRA VEZ" + "\nRESULTADO: " + resultado2 + "\nPALPITE: " + numDigitado2 + "\n\n");}
				break;
			case 3:
				System.out.println("3-SUBTRALANDIA: ACERTE O RESULTADO DA SUBTRACAO! VALORES VARIAM ENTRE -50 E 50, BOA SORTE!!");
				int numDigitado3 = num.nextInt();
				int resultado3 = OperacaoMatRandomizada.subtracaoRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado3==resultado3) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD\n\n");
					System.out.printf("RESULTADO: " + resultado3 + "\nPALPITE: " + numDigitado3 + "\n\n");
				}else{System.out.printf("Puuuxa, nao foi dessa vez! TENTE OUTRA VEZ" + "\nRESULTADO: " + resultado3 + "\nPALPITE: " + numDigitado3 + "\n\n");}
				break;
			case 4:
				System.out.println("4-DIVISAOLANDIA: ACERTE O RESULTADO DA DIVISAO! BOA SORTE!!");
				int numDigitado4 = num.nextInt();
				int resultado4 = OperacaoMatRandomizada.divisaoRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado4==resultado4) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD\n\n");
					System.out.printf("RESULTADO: " + resultado4 + "\nPALPITE: " + numDigitado4 + "\n\n");
				}else{System.out.printf("Puuuxa, nao foi dessa vez! TENTE OUTRA VEZ" + "\nRESULTADO: " + resultado4 + "\nPALPITE: " + numDigitado4 + "\n\n");}
				break;
			case 5:
				System.out.println("5-NUMEROLANDIA: ACERTE O NUMERO ALEATORIO! ESCOLHA UM NUMERO ENTRE 1 E 10, BOA SORTE!!");
				int numDigitado5 = num.nextInt();
				int resultado5 = OperacaoMatRandomizada.sorteadorNumRandomizada();
				
				//VALIDADOR DE RESULTADO
				if(numDigitado5==resultado5) {
					System.out.println("PARABENS! VOCE ACERTOU O RESULTADO!!! QUEBROU A MATRIX xD");
					System.out.printf("RESULTADO: " + resultado5 + "\nPALPITE: " + numDigitado5 + "\n");
				}else{System.out.printf("Puuuxa, nao foi dessa vez! TENTE OUTRA VEZ" + "\nRESULTADO: " + resultado5 + "\nPALPITE: " + numDigitado5 + "\n\n");}
				break;
			case 6:
				System.out.println("6-JOGO DAS CORES: ESCOLHA UMA COR\n1-VERMELHO\n2-PRETO");
				int numDigitado6 = num.nextInt();
				int resultado6 = GeradorCores.gerador();
				
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
				if(numOpcao==0) {
					System.out.println("Voce saiu do jogo =( \n");
					opSair = true;
					break;
					
				}else if(numOpcao!=0 || numOpcao!=1 || numOpcao!=2 || numOpcao!=3 || numOpcao!=4 || numOpcao!=5 || numOpcao!=6) {
					System.out.println("Opcao nao encontrada. Digite uma opcao valida.");
					break;
				}
			}
		}while(opSair==false);
	}
}
