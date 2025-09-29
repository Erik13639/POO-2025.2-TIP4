package br.edu.util;

public class CalculoReajuste {
	
	
	public static double calculoReajuste (double PA, double PN) {
		double resultado;
		
		resultado = (100 * PN - 100 * PA) / PA;
		
		return resultado;
		
		

	}

}
