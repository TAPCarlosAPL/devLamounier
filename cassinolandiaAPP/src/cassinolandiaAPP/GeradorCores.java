package cassinolandiaAPP;

import java.util.Random;

public class GeradorCores {

	public static int gerador() {
		Random numeroRandomCor = new Random();
		int numeroCor = numeroRandomCor.nextInt(10) +1;
		return numeroCor;
	}
}
		//if((numeroCor %2) !=0) {
			//System.out.println("TESTE impar: " +numeroCor);
			//int resultImpar = numeroCor;
		//}else if((numeroCor %2) ==0) {
			//System.out.println("TESTE par: " +numeroCor);
			//int resultPar = numeroCor;
		//}
