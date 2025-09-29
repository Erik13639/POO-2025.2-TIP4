package br.edu.util;

public class Transformacao {

	public static void transforma(double seg){
		int horas, minutos, segundosInt, segundos, resto;
		segundosInt = (int) seg;  
		
		horas = segundosInt / 3600;        
        resto = segundosInt % 3600;       
        minutos = resto / 60;                 
        segundos = resto % 60; 
        
        System.out.printf("%d horas, %d minutos, %d segundos\n", horas, minutos, segundos);

	}

}
