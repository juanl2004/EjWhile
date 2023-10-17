package ejwhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int num = 0;
		int contador = 0;
		double media = 0;
		int suma = 0;

		Scanner sc = new Scanner(System.in);

		while (num >= 0) {
			System.out.println("Introduce un número positivo, y negativo si deseas salir.");
			// Leemos el número del teclado.
			num = sc.nextInt();

			if (num >= 0) {
				suma += num;
				contador++;
				media = (double) suma / contador;
			}

		}

		// Mostramos la solución de la suma del contabilizador.
		System.out.println("Media de números introducidos --> " + media);

		// Cierre
		sc.close();

	}

}
