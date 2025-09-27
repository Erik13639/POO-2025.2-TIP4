package br.edu.util;

public class Divisores {

	public static int divisor(int a, int b, int c) {
		int s, resto;
		s = 0;
		
		for (int i = b; i <= c; i++) {
            resto = i % a;
            if (resto == 0) {
                s = s + i;
            }
        }
		
		return s;

	}

}
