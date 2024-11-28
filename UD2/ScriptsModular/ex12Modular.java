/*
	12*. Programa que demana un nombre més gran que 0 a l'usuari i realitza comprovació de valor de manera que si no és correcte torne a sol·licitar la introducció del valor.
*/

// Importamos la clase Scanner
import java.util.Scanner,

public class ex12Modular {
	public static void main(String[] args) {
		// Creamos el objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variale
		double num;
		
		// Pedimos el numero al ususario
		System.out.print("Introduce un número más grande que 0: ");
		num = sc.nextDouble();
		mostrarNumero();
	}
// Sin terminar
}
