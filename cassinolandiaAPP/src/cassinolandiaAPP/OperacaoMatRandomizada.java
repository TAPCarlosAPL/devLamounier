package cassinolandiaAPP;

public class OperacaoMatRandomizada {

	private Double x;
	private Double y;
	
	public static double somaRandomizada (double x, double y){
		double numeroAleatorio1 = Math.random();
		double numeroAleatorio2 = Math.random();
		double calculoRandomizado = numeroAleatorio1 + numeroAleatorio2 * 1000/10;
		//System.out.println(calculoRandomizado);
		return calculoRandomizado;
	}
	public static double multiplicacaoRandomizada (double x, double y){
		double numeroAleatorio1 = Math.random();
		double numeroAleatorio2 = Math.random();
		double calculoRandomizado = numeroAleatorio1 * numeroAleatorio2 * 1000/10;
		//System.out.println(multiplicacaoRandomizado);
		return calculoRandomizado;
	}
}