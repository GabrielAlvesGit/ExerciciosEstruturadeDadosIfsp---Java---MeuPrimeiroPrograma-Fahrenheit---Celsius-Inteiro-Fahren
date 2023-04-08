package br.ifsp.eed2;

import java.util.Arrays;

public class Matriz2 {
	public static void main(String[] args) {
		int [][] meses = new int [8][];
		int cont = 1;
		
		for(int i = 1; i<meses.length; i++) {
			meses[i] = new int [i];
			for(int j = 0; j<meses[i].length; j++) {
				meses[i][j] = cont;
				cont ++;
			}
		}
		
		for(int i = 0; i<meses.length; i++) {
			System.out.println(Arrays.toString(meses[i]));
		}
	
            
	}
}
