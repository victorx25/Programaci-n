package autoevaluación2;

import java.util.Scanner;

public class AtropellaConManuel
{
	public static void main(String argumentos[])
	{

		Scanner teclado = new Scanner(System.in);
		int num1;
		int atropellos = 0;
		int contador = 0;
		int puntos = 0;
		String acelerar;
		String direccion;
	
		do {
			num1 = ((int)(Math.random() * 2));
			System.out.println("QUIERES ACELERAR? (W): ");
			acelerar = teclado.nextLine();
			System.out.println("POR DONDE QUIERES IR? (A o D): ");
			direccion = teclado.nextLine();
			
		if (num1 == 1) {
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|   ciclista   ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
	}
		
	else {
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||    ciclista   |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
		System.out.println("|              ||               |"); 
	}
		
		if ((direccion.equals("A")) && (num1 == 1) && (acelerar.equals("W"))) {
			System.out.println("UN CICLISTA MENOS");
			atropellos++;
			puntos = puntos + 1000;
		}
		else if ((direccion.equals("D")) && (num1 == 0) && (acelerar.equals("W"))) {
			System.out.println("UN CICLISTA MENOS");
			atropellos++;
			puntos = puntos + 1000;
		}
		else if ((direccion.equals("A")) && (num1 == 1) && (!acelerar.equals("W"))) {
			System.out.println("UN CICLISTA MENOS");
			atropellos++;
			
		}
		else if ((direccion.equals("D")) && (num1 == 0) && (!acelerar.equals("W"))) {
			System.out.println("UN CICLISTA MENOS");
			atropellos++;
			
		}
		else if ((direccion.equals("A")) && (num1 == 0) && (acelerar.equals("W"))) {
			
			contador += 2;
			
		}
		else if ((direccion.equals("D")) && (num1 == 1) && (acelerar.equals("W"))) {
			
			contador += 2;
			
		}
		
		contador++;
		
	} while (contador <= 10);

		puntos = puntos + atropellos * 100;
		System.out.println("has conseguido " + puntos + " puntos");
		
	}
}