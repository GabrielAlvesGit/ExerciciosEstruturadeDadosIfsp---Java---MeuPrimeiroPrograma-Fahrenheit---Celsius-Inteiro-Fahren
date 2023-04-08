package br.ifsp.eed2;



public class Fibonacci {		
	public static void main(String[] args) {
		int af = 0;
		int bf = 1;
		int aux; 
		
		for(int i = 0; i< 30; i++) {
			System.out.println(af);
			aux = af;
			af = af + bf;
			bf = aux;
		}
	}
}
