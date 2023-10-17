package ejwhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int altura;
		int alturaMax = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la altura del árbol en cm (introduce -1 para finalizar): ");
		altura = sc.nextInt();

		while (altura != -1) {

			if (altura > alturaMax) {
				alturaMax = altura;
			}
			System.out.println("Introduce la altura del árbol en cm (introduce -1 para finalizar): ");
			altura = sc.nextInt();

		}
		if (alturaMax > 0) {
			System.out.println("La altura del árbol más alto es: " + alturaMax + " centímetros.");

		}

	}
}