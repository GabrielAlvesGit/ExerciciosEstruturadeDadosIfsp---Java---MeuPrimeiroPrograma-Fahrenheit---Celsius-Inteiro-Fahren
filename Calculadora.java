package br.ifsp.eed2;

import java.util.Scanner;

public class Calculadora {
	 
	enum Operacao{
		 Somar("+") {
			@Override
			public double executarOperacao(double numero1, double numero2) {
				// TODO Auto-generated method stub
				return numero1 + numero2;
			}
		}, 
		 Subtrair("-") {
			public double executarOperacao(double numero1, double numero2) {
				return numero1 - numero2;
			}
		}, 
		 Dividir("*") {
			public double executarOperacao(double numero1, double numero2) {
				return numero1 * numero2;
			}
		}, 
		 Multiplicar("/") {
			public double executarOperacao(double numero1, double numero2) {
				return numero1 / numero2;
			}
		};
		 private String simbolo;
		 Operacao (String simbolo){
			 this.simbolo = simbolo;
		 }
		 
		 public abstract double executarOperacao(double  numero1, double numero2);
		 
		 
		 public String toString() {
			 return this.simbolo;
		 }
	 }
	 
	public static void main(String[] args) {
		
		double numero1 = 5.0;
		double numero2 = 9.0;
		
		for(Operacao op : Operacao.values()) {
			System.out.print(numero1 + " ");
			System.out.print(op.toString() + " ");
			System.out.print(numero2 + " ");
			System.out.println(op.executarOperacao(numero1 , numero2));
		}
 	}
}



//obs: Usamos o double porque ele armazena número com mais detalhes e 2 vezes mais que o float
