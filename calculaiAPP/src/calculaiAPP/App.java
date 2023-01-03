package calculaiAPP;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		Scanner numOpc = new Scanner(System.in);
		//Scanner numOpcSair = new Scanner(System.in);
		
		//System.out.println("BEM VINDO AO CALCULAI\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Média\n6-Porcentagem\nFORA DO LOOPING");
		//int digiteNumOpc = numOpc.nextInt();

		do {
			System.out.println("BEM VINDO AO CALCULAI\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Média\n6-Porcentagem\nDENTRO DO LOOPING");			
			int digiteNumOpc = numOpc.nextInt();
			switch (digiteNumOpc) {
			case 1:
				System.out.println("SOMA: Digite dois números para somá-los");
				Double digiteNumSoma1 = num1.nextDouble(); Double digiteNumSoma2 = num2.nextDouble();
				System.out.println(OperacaoMat.soma(digiteNumSoma1, digiteNumSoma2));
				break;
			case 2:
				System.out.println("SUBTRAÇÃO: Digite dois números para subtraí-los");
				Double digiteNumSub1 = num1.nextDouble(); Double digiteNumSub2 = num2.nextDouble();
				System.out.println(OperacaoMat.subtracao(digiteNumSub1, digiteNumSub2));
				break;
			case 3:
				System.out.println("MULTIPLICAÇÃO: Digite dois números para multiplicá-los");
				Double digiteNumMult1 = num1.nextDouble(); Double digiteNumMult2 = num2.nextDouble();
				System.out.println(OperacaoMat.multiplicacao(digiteNumMult1, digiteNumMult2));
				break;
			case 4:
				System.out.println("DIVISÃO: Digite dois números para dividi-los");
				Double digiteNumDiv1 = num1.nextDouble(); Double digiteNumDiv2 = num2.nextDouble();
				System.out.println(OperacaoMat.divisao(digiteNumDiv1, digiteNumDiv2));
				break;
			case 5:
				System.out.println("MÉDIA: Digite dois números para calcular a média");
				Double digiteNumMedia1 = num1.nextDouble(); Double digiteNumMedia2 = num2.nextDouble();
				System.out.println(OperacaoMat.media(digiteNumMedia1, digiteNumMedia2));
				break;
			case 6:
				System.out.println("PORCENTAGEM: Digite dois números, um para valor e outro para porcentagem");
				Double digiteNumPorcen1 = num1.nextDouble(); Double digiteNumPorcen2 = num2.nextDouble();
				System.out.println(OperacaoMat.subtracao(digiteNumPorcen1, digiteNumPorcen2));
				break;
			default: System.out.println("Este não é um número válido!");
				break;
			}
		}while(1==1);
	}
}
