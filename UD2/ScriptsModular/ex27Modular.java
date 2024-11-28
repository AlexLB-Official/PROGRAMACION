/*
	27*. Modificar l'anterior algorisme perquè demane una llista d'enters acabada amb un 0 i indique, per a cada un d'ells, si és primer o no. A més, a la fi ha d'indicar quants primers s'han introduït.
*/

import java.util.Scanner;

public class ex27Modular {
	public static void main(String[] args) {
		Scanner mySc = new Scanner(System.in);
		long num;
		int cont=0;
		
		System.out.print("Introduce un entero (0 para terminar): ");
		num = mySc.nextLong();
		
		while (num != 0) {
			if (esPrimo(num)){
				System.out.println("El " + num + " es un número primo.");
				cont++;
			} else
				System.out.println("El " + num + " no es un número primo.");	
			
			System.out.print("Introduce un número (0 para terminar): ");
			num = mySc.nextLong();
		}
		
		System.out.println("Has introducido un total de "+cont+" números primos.");
		
	}
	
	public static boolean esPrimo(long n) {
		for (int i = 2 ; i < n ; i++)
			if ((n%i)==0) // si la division es exacta
				return false;
		return true;
	}
}
