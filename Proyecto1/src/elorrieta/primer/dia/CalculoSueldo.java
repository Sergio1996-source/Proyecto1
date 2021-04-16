package elorrieta.primer.dia;

import java.util.Scanner;

/**
 * 
 * @author Sergio Mendoza
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=4&codigo=77&inicio=0
 * 
 *      Ejercicio básico para los primeros días /
 * 
 * @author cursos_externos
 *
 */

public class CalculoSueldo {
	public static void main(String[] args) {

		// declarar variables= TIPO NOMBRE = VALOR;
		int horasTrabajadas = 0;
		float costoHora = 0;
		float sueldo = 0;

		// variable para leer datos por teclado
		Scanner teclado = new Scanner(System.in);

		// pedir datos por pantalla y leerlos
		System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
		// guardar en la variable el valor entero int leído por pantalla
		horasTrabajadas = teclado.nextInt();

		System.out.print("Ingrese el valor de la hora:");
		costoHora = teclado.nextFloat();

		// calculamos el sueldo
		sueldo = horasTrabajadas * costoHora;

		System.out.println("El sueldo es " + sueldo);

		// cerramos el teclado
		teclado.close();

	}
}
