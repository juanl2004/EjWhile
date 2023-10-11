package ejwhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la variable contador para contavilizar cuantos números tendremos al
		// final. Le asignamos el valor 0 para que empieze a contar desde ahí.
		int contador = 0;

		// Creamos la variable num para poderle pedir al usuario un número.
		int num;

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduza una de las 2 opciones.
		System.out.println("Introduce un valor positivo, o un negativo en caso de querer terminar.");

		// Leemos el valor del teclado.
		num = sc.nextInt();

		// Creamos un bucle con while que se ejecutara siempre que se cumpla la condición de que el número sea mayor de 0.
		while (num >= 0) {
			contador++; //Con esta instrucción sumaremos uno al contador cada vez que introduzcamos un número positivo,

			//Le volvemos a pedir un número al usuario, si es positivo se vuelve a repetir el while, si es negativo te muestra la solución del contador.
			System.out.println("Introduce un número positivo, y negativo si deseas salir.");
			
			//Leemos el número del teclado.
			num = sc.nextInt();
		}
		
		//Mostramos la solución de la suma del contabilizador.
		System.out.println("Nº de números introducidos --> " + contador);
		
		//Cierre
		sc.close();
	}

}
