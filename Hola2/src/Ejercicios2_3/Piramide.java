package Ejercicios2_3;

import java.util.Scanner;

public class Piramide {

	public static void Piramide(int tamaño) {

		int x;
		int y;
		
		do {
		for (x = 1; x <= tamaño; x++) { 
			System.out.println("");
		
		for (y = 1; y <= tamaño; y++) {
		
		if (x == 1 && y == tamaño / 2) System.out.print(" *");
		
		else if ((x == tamaño) || (y == tamaño)) {
			System.out.print(" *");

		}
		else {
			System.out.print(" *");

					}
				}
			}
		}while (x!=tamaño);
	}
		
		public static void main(String argumentos[])
		{
			Piramide(5);
			
	}
}
