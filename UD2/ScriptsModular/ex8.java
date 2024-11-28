/*
	8. Realitzar un programa, amb un subprograma recursiu, que donat un nombre enter positiu, done la suma de tots els nombres parells positius menors que ell.
*/

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
		int number;
		
		// Pedimos un número
		System.out.print("Introduce un número entero y positivo: ");
		number = sc.nextInt();
		while (number >= 0){
			System.out.print("Introduce un número entero y positivo: ");
			number = sc.nextInt();
		}
		
		System.out.println("El total de la suma es "+ sumaPares(number-1));
	}
	
	public static int sumaPares(int n) {
		if (n == 0) // si es 0 devuelve 0
			return 0;
		else // sino
			if ((n%2)==0) // si es par suma el valor n + 2 numeros mas abajo que tambien seran pares
				return n + sumaPares(n-2);
		
		return sumaPares(n-1); // Si no se cumplen ninguna de las condiciones resta 1 a n y vuelve a hacer la funcion
	}
}
