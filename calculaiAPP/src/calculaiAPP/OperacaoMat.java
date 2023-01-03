package calculaiAPP;

public class OperacaoMat {
	
	//private double x;
	//private double y;
	
	public static Double soma(Double x, Double y) {
		return x + y;
	}
	public static Double subtracao(Double x, Double y){
		return x - y;
	}
	public static Double multiplicacao(Double x, Double y){
		return x * y;
	}
	public static Double divisao(Double x, Double y){
		return x / y;
	}
	public static Double media(Double x, Double y){
		return x + y / 2;
	}
	public static Double porcentagem(Double x, Double y){
		Double numInt = x;
		Double calcPorcen = numInt * y; 
		Double resultPorcen = calcPorcen / 100; 
		return resultPorcen;
	}
}
