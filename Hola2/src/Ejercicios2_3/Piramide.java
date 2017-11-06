package Ejercicios2_3;


public class Piramide {

	public static void piramide(int tamano) {

		for(int i = 1; i <= tamano; i++){
		int n;
			for( n = 0; n < tamano-i ; n++){
				System.out.print(" "); //imprime los espacios
				}
					for( ; n < (tamano+i)-1;n++){
						System.out.print("*"); //imprime los asteriscos
					}
			System.out.println(); //cambio de lienea 
			}
	}	
	public static void main(String[] args) {
		
		piramide(5);
	}
}