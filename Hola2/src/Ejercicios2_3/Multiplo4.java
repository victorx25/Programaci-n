package Ejercicios2_3;

import java.util.Scanner;

public class Multiplo4 {
	
	public static int pedirTope() {
		
		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el tope: ");
		int tope = teclado.nextInt();
		return tope;
	}
	
public static void mostrarMultiplos2(int tope) {
		
		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		 				// Constante, el máximo valor del múltiplo
		System.out.println("Dime el tope: ");
		
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < tope)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;	
		}
	}

		 public static void main(String argumentos[]) {
			 mostrarMultiplos2(pedirTope());
		 }
}
