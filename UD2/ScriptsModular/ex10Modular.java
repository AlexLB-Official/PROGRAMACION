/*
	10*. Programa que mostra les 10 taules de multiplicar (per 1,2,3, ..., 10).
*/

public class ex10Modular {
	public static void main(String[] args) {
		// LLamamos a la función
		tablasMult();
	}
	
	public static void tablasMult(){
		// Creamos 2 for para mostrar las tablas
		for (int i = 1; i <= 10; i++){
			System.out.println("\nTabla de multiplicar del "+i);
			System.out.println("****************************");
			for (int j =1; j <=10; j++)
				System.out.println(i+" x "+j+" = "+(i*j));
		}
	}
}
