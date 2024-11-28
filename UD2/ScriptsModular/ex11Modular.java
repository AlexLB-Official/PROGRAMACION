/*
	11*. Programa que demana un nombre enter i imprimeix la seva taula de multiplicar.
*/

// Importamos Scanner
import java.util.Scanner;

public class ex11Modular {
	public static void main(String[] args) {
		// Creamos el objeto de Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variale
		int num;
		
		// Pedimos el número al usuario
		System.out.print("Introduce un número entero: ");
		num = sc.nextInt();
		tablaMult(num);
	}
	
	public static void tablaMult(int n){
		System.out.println("\nTabla de multiplicar del "+n);
		for (int i = 1; i <= 10; i++)
			System.out.println(n+" x "+i+" = "+(n*i));
	}
}
