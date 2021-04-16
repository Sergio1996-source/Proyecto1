package elorrieta.primer.dia;

import java.util.Scanner;

public class TemperaturaMediaSemana {

	public static void main(String[] args) {
		/*
		 * *TODO Auto-generated method stub Pedir por teclado la temperatura y calcular
		 * la media de la semana
		 */

		// declarar variables
		float temperaturalunes;
		float temperaturamartes;
		float temperaturamiercoles;
		float temperaturajueves;
		float temperaturaviernes;
		float temperaturasabado;
		float temperaturadomingo;
		float temperaturamedia;
		final int DIAS_SEMANA = 7; // final es para indicar que es una constante, siempre en Mayusculas
		// variable para leer datos por teclado
		Scanner teclado = new Scanner(System.in);

		// pedir datos por pantalla y leerlos
		System.out.println("Dime la temperatura del lunes:");
		temperaturalunes = teclado.nextFloat();

		System.out.println("Dime la temperatura del martes:");
		temperaturamartes = teclado.nextFloat();

		System.out.println("Dime la temperatura del miercoles:");
		temperaturamiercoles = teclado.nextFloat();

		System.out.println("Dim la temperatura del jueves:");
		temperaturajueves = teclado.nextFloat();

		System.out.println("Dime la temperatura del viernes:");
		temperaturaviernes = teclado.nextFloat();

		System.out.println("Dime la temperatura del sábado:");
		temperaturasabado = teclado.nextFloat();

		System.out.println("Dime la temperatura del domingo:");
		temperaturadomingo = teclado.nextFloat();

		// calculamos la media
		float media = (temperaturalunes + temperaturamartes + temperaturamiercoles + temperaturajueves
				+ temperaturaviernes + temperaturasabado + temperaturadomingo) / DIAS_SEMANA;

		if (media <= 20)
			System.out.println("Hace frio");
		else
			System.out.println("Hace calor");

		// mostrar media
		System.out.println("La temperatura media es de " + media);

		teclado.close();
	}

}
