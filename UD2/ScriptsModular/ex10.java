/*
	10. Fer un programa en Java que imprimisca 100 asteriscos en pantalla utilitzant una funció main recursiva.
*/

public class ex11 {
	static int cont = 0;
	public static void main(String[] args) {
		if (cont < 100){
			cont++;
			System.out.print("*");
			main(args);
		}
	}
}
