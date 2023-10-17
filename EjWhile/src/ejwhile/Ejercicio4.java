package ejwhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número -->");
		numero = sc.nextInt();
		
		while (numero != 0) {
			
			if (numero%2 ==  0) {
				System.out.println("¡Es PAR!");
				
			} else {
				System.out.println("¡Es IMPAR!");
			}
			
			System.out.println("Escribe un número -->");
			numero = sc.nextInt();
			
		}
		System.out.println("¡FIN!");
		sc.close();
	}

}
