package br.edu.util;

public class Somador {

	public static int somar(int num1, int num2) {
		int s;
		s = 0;
		
		for (int i = num1 + 1; i < num2; i++) {
            s = s + i;
        }
		
		return s;

	}

}
