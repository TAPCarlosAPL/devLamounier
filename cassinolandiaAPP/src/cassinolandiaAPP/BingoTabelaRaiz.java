package cassinolandiaAPP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BingoTabelaRaiz {
	
	
	/***public static int geradorTabelaBingo() {
		Set<Integer> valorGerado = new HashSet<>();
		Random gerador = new Random();
		for(int i = 0; i<75; i++) {
			int x = gerador.nextInt(75);
			valorGerado.add(x);
		}
		Integer[] result = valorGerado.toArray(new Integer[valorGerado.size()]);
		System.out.println(Arrays.toString(result));
		return 0;
	}**/
	public static int testeMatriz() {
		
		int[] geradorValores = new Random().ints(35, 1, 75).toArray();
		System.out.println(Arrays.toString(geradorValores));
		return 0;
	}
}

	