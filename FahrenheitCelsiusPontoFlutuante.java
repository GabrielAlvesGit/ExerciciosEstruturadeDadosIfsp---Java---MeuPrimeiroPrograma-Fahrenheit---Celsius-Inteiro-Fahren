package br.ifsp.eed2;

import java.util.Scanner;

public class FahrenheitCelsiusPontoFlutuante {
	static double conversaoFahrenheitCelsius(double F) {
		double C =  (F - 32.0) * 5.0/9.0; 
		return C;
	}
				
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número em Fahrenheit:");
		double Fahrenheit = leitor.nextInt();
		
		System.out.println("O numero convertido em Fahrenheit para Celsius é:");
		System.out.println(conversaoFahrenheitCelsius(Fahrenheit));
		}
}
