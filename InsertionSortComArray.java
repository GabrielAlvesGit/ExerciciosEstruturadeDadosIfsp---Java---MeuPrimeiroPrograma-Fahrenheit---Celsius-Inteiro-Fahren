package br.ifsp.eed2;

import java.util.Arrays;

public class InsertionSortComArray {
	public static void main(String[] args) {
		int [] numeros = {12, 11, 13, 5,6};
		insertionSort(numeros);
		
		System.out.print(Arrays.toString(numeros));
	}

	private static void insertionSort(int[] numeros) {
		int x, aux;
		for(int i= 1; i<numeros.length; i++) {
			x = numeros[i];
			aux = i - 1;
			while((aux >= 0) && numeros[aux] > x) {
				numeros[aux+1] =  numeros[aux];
				aux = aux - 1;
				
			}
			numeros[aux + 1] = x;
		}
		
	}
}
