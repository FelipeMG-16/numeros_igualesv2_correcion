/* Escribir un programa que pida 2 numeros por consola de manera reiterada
		 * La ejecución del programa terminará cuando los numeros ingresados sean
		 * iguales.
		 * Nota: utilizar un ciclo while
		 */ 

import java.util.Scanner;

public class NumerosIgualesWhileCorreccion { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ingreso = new Scanner (System.in);
		int primer = 0 ; //Declaramos en 1
		int segundo = 1; //Declarando en 2
		
		//Declaramos así porque si declaramos las dos en 0, el programa identifica
		//Que los numeros son iguales y no har+á la función
		
		
		while (primer != segundo) {
			System.out.println("Este programa va a detenerse cuando los números sean iguales.\n");
			System.out.println ("Por favor ingresa el primer número:");
			primer = ingreso.nextInt();
			System.out.println("Por favor ingresa el segundo número:");
			segundo = ingreso.nextInt();
		}
		System.out.println("Los números son iguales, por lo que hemos terminado.");
	}
}


