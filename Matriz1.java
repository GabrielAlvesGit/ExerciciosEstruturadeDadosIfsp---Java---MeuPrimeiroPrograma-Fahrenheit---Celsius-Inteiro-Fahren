package br.ifsp.eed2;

import java.util.Arrays;

public class Matriz1 {
	public static void main(String[] args) {
		
		int [][] meses = new int[8][]; // 8 linhas, 12 colunas
		
		meses[0] = new int [9];
		meses[1] = new int [10];
		meses[2] = new int [8];
		meses[3] = new int [12];
		meses[4] = new int [6];
		meses[5] = new int [2];
		meses[6] = new int [1];
		meses[7] = new int [8];
		
		int cont = 1;
		for (int i = 0; i < meses.length; i++) {
            for(int j=0; j<meses[i].length; j++) {
            	meses[i][j] = cont;
            	cont++;
            	}
        	}
			for(int i = 0; i<meses.length; i++) {
				System.out.println(Arrays.toString(meses[i]));
			}
	}
}