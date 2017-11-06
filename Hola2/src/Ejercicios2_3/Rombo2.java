package Ejercicios2_3;

public class Rombo2 {


		public static void Rombo(int tamaño) {

			int x;
			int y;
			int z;
			
			for (y = 1; y <= tamaño; y++) { 
				System.out.println("");
			
			for (z = 1; z <= tamaño; z++) {
			
			if (y == tamaño/2) {
				System.out.print("*");
			}
			
			else if ((z == tamaño) || (y == tamaño)) 
						System.out.print(" *");
			else { System.out.print("  ");}
			}
			}
					
		}
			public static void main(String argumentos[])
			{
				Rombo(5);
				
		}
	
}