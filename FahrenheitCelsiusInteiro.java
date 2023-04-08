package br.ifsp.eed2;

import java.util.Scanner;

public class FahrenheitCelsiusInteiro {
	static double conversaoFahrenheitCelsius(int F) {
		int C =  (F-32)* 5/9; 
		return C;
	}
				
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número em Fahrenheit:");
		int Fahrenheit = leitor.nextInt();
		
		System.out.println("O numero convertido em Fahrenheit para Celsius é:");
		System.out.println(conversaoFahrenheitCelsius(Fahrenheit));
		}
}
