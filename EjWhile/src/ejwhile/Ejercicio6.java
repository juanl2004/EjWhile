package ejwhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int edad ;
		int numAlum = 0;
		int suma = 0;
		int mayoresEdad = 0;
		double media = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cual es la edad? -->");
		edad = sc.nextInt();
		
		while (edad > 0) {
			
			suma += edad;
			numAlum++;
			media = (double) suma / numAlum;
			
			if (edad >= 18)
				mayoresEdad++;
			
			System.out.println("¿Cual es la edad? -->");
			edad = sc.nextInt();
			
		}
		 System.out.println("Suma de las edades: " + suma);
         System.out.println("Media de las edades: " + media);
         System.out.println("Número de alumnos: " + numAlum);
         System.out.println("Alumnos mayores de edad: " + mayoresEdad);
		
         sc.close();
	}

}
