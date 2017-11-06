package Ejercicios2_3;

import java.util.Scanner;

public class Piramide2 {

	public static void Piramide(int tamano) {

		
		for(int i = 1; i <= tamano; i++){
		int i2;
		for(i2 = 0; i2 < tamano - i; i2++)
		{
		System.out.print(" "); //imprime los espacios
		}
		for( ; i2 < tamano ; i2++)
		{
		System.out.print(" *"); //imprime los asteriscos
		}
		System.out.println(""); //cambio de lienea 
	}
	}	
		public static void main(String argumentos[])
		{
			Piramide(5);
			
	}
}
