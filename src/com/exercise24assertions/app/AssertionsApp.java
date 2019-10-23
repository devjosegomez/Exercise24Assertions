package com.exercise24assertions.app;

import java.util.Scanner;

public class AssertionsApp {
//Asserts are used in testing
	public static void main(String[] args) {
		int edad=0;
		System.out.println("Eres mayor de edad? Introduce tu edad: ");
		Scanner input = new Scanner(System.in);
		edad = input.nextInt();
		System.out.println(isMayorEdad(edad));
	}
	
	public static String isMayorEdad(int edad) {
		assert edad>0: "Edad no valida, solo se aceptan valores positivos";
		String cad="";
		
		if(edad<18) {
			 cad = "Menor de edad";
		}
		if(edad>=18) {
			cad =  "Chavorruco";
		}
		return cad;
	}

}
