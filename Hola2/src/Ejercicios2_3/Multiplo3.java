package Ejercicios2_3;

import java.util.Scanner;

public class Multiplo3 {
	Scanner teclado = new Scanner(System.in);
	
	public static void pedirTope() {
		
		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		 				// Constante, el máximo valor del múltiplo
		System.out.println("Dime el tope: ");
		int TOPE = teclado.nextInt();
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;	
		}
	}
		 public static void main(String argumentos[]) {
			 pedirTope();
		 }
}
