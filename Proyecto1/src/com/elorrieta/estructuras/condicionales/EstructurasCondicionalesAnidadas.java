package com.elorrieta.estructuras.condicionales;

import java.util.Scanner;

public class EstructurasCondicionalesAnidadas {
	public static void main(String[] args) {

		// variables
		float nota1;
		float nota2;
		float nota3;
		final float media;

		// variable para leer datos por teclado
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresa tu primera nota: ");
		nota1 = teclado.nextFloat();

		System.out.println("Ingresa tu segunda nota: ");
		nota2 = teclado.nextFloat();

		System.out.println("Ingresa tu tercera nota: ");
		nota3 = teclado.nextFloat();

		// media
		media = (nota1 + nota2 + nota3) / 3;

		System.out.println("Tu media es  " + media);

		// condición

		if (media >= 7) {
			System.out.println("Aprobado");
		} else {

			if (media >= 4) {
				System.out.println("Regular");

			} else {
				System.out.println("Reprobado");

			}

		} // condicion principal
	}// main
}// clase