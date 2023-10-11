package ejwhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int num;
		double media = 0;
		int suma = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un valor positivo, o un negativo en caso de querer terminar.");
		num = sc.nextInt();

		while (num >= 0) {
			suma += num;
			media = suma / suma++;

			System.out.println("Introduce un número positivo, y negativo si deseas salir.");

			// Leemos el número del teclado.
			num = sc.nextInt();
		}

		// Mostramos la solución de la suma del contabilizador.
		System.out.println("Nº de números introducidos --> " + media);

		// Cierre
		sc.close();

	}

}
