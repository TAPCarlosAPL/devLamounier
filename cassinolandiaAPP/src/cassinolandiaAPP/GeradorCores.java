package cassinolandiaAPP;

import java.util.Random;

public class GeradorCores {

	public static int gerador() {
		Random numeroRandomCor = new Random();
		int numeroCor = numeroRandomCor.nextInt(10) +1;
		return numeroCor;
	}
}
