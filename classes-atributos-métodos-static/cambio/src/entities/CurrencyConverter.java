package entities;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double dolarParaReal(double cotacao, double dolares) {
		return cotacao * dolares * (1 + IOF);
	}

}
