
package com.elorrieta.estructuras.condicionales;

import java.util.Scanner;

/**
 * Ejercicio 6
 * 
 * @author Sergio Mendoza Camarena
 *
 */

public class EstructuraDeProgramacionSecuencial {

	public static void main(String[] args) {

		// variables
		int num1;
		int num2;
		int suma;

		// variable para leer datos por teclado
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();

		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();

		// Suma
		suma = num1 + num2;
		System.out.println("La suma es " + suma);
		/*
		 * // pedir datos por pantalla y leerlos syso System.out.println
		 * ("Introduce el primer numero"); teclado = num1nextFloat () System.out.println
		 * ("Introduce el segundo numero"); teclado = num2nextFloat ()
		 * 
		 * //Calculamos la suma
		 */

		float num3;
		float num4;
		float sumaotra;

		// variable para leer datos por teclado
		Scanner teclado2 = new Scanner(System.in);

		System.out.println("Introduce el primer número");
		num3 = teclado2.nextFloat();

		System.out.println("Introduce el segundo número");
		num4 = teclado2.nextFloat();

		// Suma
		sumaotra = num3 + num4;
		System.out.println("La suma es " + sumaotra);

		teclado2.close();
	}// final main

}// final clase
