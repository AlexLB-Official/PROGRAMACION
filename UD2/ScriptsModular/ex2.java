/*
	# 2. Realitzar una funció que reba un nombre real (double) i retorne el nombre enter més pròxim.
*/

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		// Creamos el objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable
		double number;
		
		// Pedimos un número al usuario
		System.out.print("Introduce un número: ");
		number = sc.nextDouble();
		
		// Pasamos el número a la función
		numProximo(number);
	}
	
	// Creamos la función
	public static void numProximo (double num){
		double numReal = num; // Guardamos el valor en una nueva variable dentro de la función
		num = (int) num; // Hacemos un casting del número de double a int
		numReal -= num;

		if (numReal >= 0.5)
			System.out.println("El número entero mas cercano a "+(numReal+num) +" es "+((int)(num+1)));
		else
			System.out.println("El número entero mas cercano a "+ (numReal+num) + " es " + ((int)num));
	}
}
