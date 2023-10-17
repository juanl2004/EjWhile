package ejwhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int num;
		int contador = 1;
		int numposit = 0;
		int numnegt = 0;
		int contnegt = 0;
		int contcero = 0;
		double solnumneg = 0;
		
		Scanner sc = new Scanner(System.in);

		while (contador <= 10) {
			System.out.println("Escriba un número");
			num = sc.nextInt();
			
			if (num > 0) {
				numposit += num;
				
			} else if (num < 0) {
				numnegt += num;
				contnegt++; 
				solnumneg = (double)numnegt/contnegt;
				
				
			} else {
				contcero++;
			}
			contador++;
 				
		}
		System.out.println("La suma de los números positivos es: " + numposit);
        System.out.println("La media de los números negativos es: " + solnumneg);
        System.out.println("El número de ceros introducidos es: " + contcero);
		sc.close();
	}

}
