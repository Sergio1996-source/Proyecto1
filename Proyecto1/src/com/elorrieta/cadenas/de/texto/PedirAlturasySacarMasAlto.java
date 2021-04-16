package com.elorrieta.cadenas.de.texto;

import java.util.Scanner;

public class PedirAlturasySacarMasAlto {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);

		String nombre1, nombre2;
		int edad1, edad2;
		float altura1, altura2;

		System.out.print("Ingrese el nombre:");
		nombre1 = teclado.next();
		System.out.print("Ingrese edad:");
		edad1 = teclado.nextInt();
		System.out.println("Ingrese altura en metros:");
		altura1 = teclado.nextFloat();

		System.out.print("Ingrese el nombre:");
		nombre2 = teclado.next();
		System.out.print("Ingrese edad:");
		edad2 = teclado.nextInt();
		System.out.println("Ingrese altura en metros:");
		altura2 = teclado.nextFloat();

		System.out.print("La persona de mayor edad es: ");
		if (edad1 > edad2) {
			System.out.println(nombre1);
		} else {
			System.out.println(nombre2);
		}

		System.out.print("La persona de mayor altura es: ");
		if (altura1 > altura2) {
			System.out.println(nombre1);
		} else {
			System.out.println(nombre2);

			teclado.close();
		}
	}
}
