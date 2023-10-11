package ejwhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		//Valor que leeremos del teclado.
		int num;
		
		//Creamos la variable suma dandole su valor inicial 0.
		int suma = 0;
		
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario una de esas dos opciones.
		System.out.println("Introduce un número positivo, y negativo si deseas salir.");
		
		//Leemos el número del teclado.
		num = sc.nextInt();
		
		//Creamos un bloque con while que se ejecutará siempre y cuando el número sea mayor o igual a 0.
		while (num >= 0) {
			suma += num; //A nuestro valor inicial 0 le vamos sumando los números introducidos por el usuario.
		
		//Le volvemos a pedir un número porque es caso de que sea negativo no se vulve a repetir el bucle.
		System.out.println("Introduce un número positivo, y negativo si deseas salir.");
		
		//Leemos el número del teclado.
		num = sc.nextInt();
		}
		
		//Finalmente leemos el resultado de la suma. 
	System.out.println("Suma total --> " + suma);
	
	//Cierre
	sc.close();
	}

}
