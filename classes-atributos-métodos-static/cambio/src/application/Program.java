package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cotacao, dolares, valorEmReais;
		
		System.out.print("Qual o valor do dólar? ");
		cotacao = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		dolares = sc.nextDouble();
		
		valorEmReais = CurrencyConverter.dolarParaReal(cotacao, dolares);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", valorEmReais);
		
		sc.close();

	}

}
