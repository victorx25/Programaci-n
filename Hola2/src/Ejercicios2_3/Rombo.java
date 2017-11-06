package Ejercicios2_3;

import java.util.Scanner;

public class Rombo {


	public static void main(String argumentos[]){


			Scanner teclado = new Scanner(System.in);
			
			int tamano;
			System.out.println("dime el tamano que desees: ");
			tamano = teclado.nextInt();
			
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
			
			for(int i = 1; i <= tamano; i++){
				int i2;
				for(i2 = 0; i2 < tamano - i; i2++)
				{
				System.out.print(" *"); //imprime los espacios
				}
				for( ; i2 < tamano ; i2++)
				{
				System.out.print(""); //imprime los asteriscos
				}
				System.out.println(""); //cambio de lienea 
				}
			
}
}