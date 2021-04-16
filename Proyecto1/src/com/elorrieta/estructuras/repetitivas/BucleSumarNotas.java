package com.elorrieta.estructuras.repetitivas;

import java.util.Scanner;

public class BucleSumarNotas {
	public static void main(String[] args) {

		float nota = 0;
		float sumanotas = 0;
		int numeronotas = 0;
		float media = 0;
		Scanner teclado = new Scanner(System.in);

		// bucle para pedir notas y sumarlas
		while (numeronotas < 5) {

			System.out.println("Introduzca su nota " + (numeronotas + 1) + ": ");
			nota = teclado.nextFloat();
			sumanotas = sumanotas + nota; // sumanotas += nota;
			numeronotas = numeronotas + 1; // numeronotas++;
		}
		// termina el bucle
		media = sumanotas / numeronotas;

		System.out.println("Media: " + media);

		if (media == 10) {
			System.out.println("Obtienes matrícula de honor");
		} else {
			if (media >= 5) {
				System.out.println("Aprobado");

			} else {
				System.out.println("Suspendido");

			} // final segundo if
		} // final primer if

	}// final main
}// final clase
