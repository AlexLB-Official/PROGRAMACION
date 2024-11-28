/*
	# 3. Realitzar una funció que reba una quantitat d'hores, minuts i segons i retorne el total de segons corresponent.
*/

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		// Creamos el objeto de Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las varables
		int horas, minutos, segundos;
		
		// Pedimos al usuario que introduzca las horas minutos y segundos
		System.out.print("Introduce las horas, minutos y segundos:\nHoras: ");
		horas = sc.nextInt();
		
		System.out.print("Minutos: ");
		minutos = sc.nextInt();
		
		System.out.print("Segundos: ");
		segundos = sc.nextInt();
		
		// Seguidamente pasamos los valores de las variables a la funcion
		conversionSegundos(horas,minutos,segundos);
	}
	
	// Creamos la funcion para convertir los valores a segundos y devolverlos por pantalla
	public static void conversionSegundos(int horas, int minutos, int segundos){
		for (int i = 1; i <= 1; i++)
			minutos = minutos * 60;
			for (int i = 1; i <= 2; i++)
				horas = horas * 60;
		
		segundos += minutos + horas;
		
		System.out.println("El total de segundos es de "+segundos);
	}
}
