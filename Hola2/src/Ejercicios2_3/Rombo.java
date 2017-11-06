package Ejercicios2_3;


public class Rombo {

	public static void rombo(int tamano) {

		if (tamano % 2 == 0) {
			tamano = tamano + 1 ;
		}
		for(int i = 1; i <= tamano; i++){
		int n;
			for( n = 0; n < tamano - i ; n++){
				System.out.print(" "); //imprime los espacios
				}
					for( ; n < (tamano+i)-1;n++){
						System.out.print("*"); //imprime los asteriscos
					}
			System.out.println(); //cambio de lienea 
			}
	}	
	public static void main(String[] args) {
		
		rombo(6);
	}
}