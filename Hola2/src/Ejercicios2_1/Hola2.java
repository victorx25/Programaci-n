package Ejercicios2_1;

import java.util.Scanner;

/**
 * Hola2.java
 * Los comentarios si son un elemento de lenguaje Java, 
 * es donde se hacen aclaraciones de las funciones
 * @author dam17-18 VMM
 */

public class Hola2
{
	public static void main(String argumentos[])
	{
		// La siguiente linea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util
		// Existe una alternativa de entrada más compleja con BufferedReader

		Scanner teclado = new Scanner(System.in);
		
		int num ;				// variable numérica
		String nombre = "";		// variable de texto 
		
		// configura y muestra mensaje de bienvenida
		num = 1 ;
		System.out.println("Hola, Soy un modesto ");
		System.out.print("programa de ordenador...\n");
		System.out.println("Mi numero de orden es el " + num + " por ser el primero.");

		// Pide nombre
		System.out.print("\nDame tu nombre: ");
		
		nombre = teclado.nextLine();
		
		// muestra mensaje personalizado
		System.out.println("\nBienvenido a Java. \n" + nombre + ", espero que lo pases bien...");
		
	}

}