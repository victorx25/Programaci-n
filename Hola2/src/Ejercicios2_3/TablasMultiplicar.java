package Ejercicios2_3;

public class TablasMultiplicar {
	
	public static void calcularMostrarTabla(int num) {

		int contador;
		int multiplicar;
		
		for (contador = 0; contador <= 15; contador++) {
			multiplicar = num * contador;
			System.out.println(num + " x " + contador + " = " + multiplicar);
		}
	}
		public static void main(String argumentos[])
		{
			calcularMostrarTabla(5);
			
	}
}
