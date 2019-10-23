package com.exercise24assertions.app;

import java.util.Scanner;

public class AssertionsApp {

	public static void main(String[] args) {
		int edad=0;
		System.out.println("Eres mayor de edad? Introduce tu edad: ");
		Scanner input = new Scanner(System.in);
		edad = input.nextInt();
		
		assert edad<0: "Edad no valida";
		
		if(edad<18) {
			System.out.println("Menor de edad");
		}
		if(edad>=18) {
			System.out.println("Chavorruco");
		}

	}

}
