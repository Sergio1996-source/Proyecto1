package com.elorrieta.estructuras.condicionales;

import java.util.Scanner;

public class EstructurasCondicionalesSimplesyCompuestas {
	public static void main(String[] args) {

		// variables
		int sueldo;

		// variable para leer datos por teclado
		Scanner teclado = new Scanner(System.in);

		// Pedir datos y condición
		System.out.println("Introduce tu sueldo: ");
		sueldo = teclado.nextInt();

		if (sueldo > 3000) {
			System.out.println("Te toca apoquinar");
		} else {
			System.out.println("Te libras del expolio");

			teclado.close();

		}

	}
}
