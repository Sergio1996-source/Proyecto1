package com.elorrieta.estructuras.repetitivas;

public class While {
	public static void main(String[] args) {
		System.out.println("Iniciamos programa");

		int x = 0;
		while (x <= 10) {
			System.out.println("Pintame la " + x);
			x++; // x = x + 1

		} // termina primer while
		int y = 10;

		while (y >= 0) {
			System.out.println("Pintame la " + y);
			y--;
		} // termina segundo while

		System.out.println("Termina programa");
	}
}
