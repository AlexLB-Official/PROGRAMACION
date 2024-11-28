/*
	Autor: Alexander Luzarraga Bautista
	Ejercicio: g) 10 mayúsculas aleatorias y 10 minúsculas aleatorias
*/

public class exMayMin {
	// Establecemos el número de veces a hacer
	private static final int cont = 10;
	
	// Especificamso el mínimo y máximo de las mayúsculas
	private static final int minMayu = 65;
	private static final int maxMayu = 90;
	
	// Especificamos el minimo y máximo de las minúsculas
	private static final int minMins = 97;
	private static final int maxMins = 122;
	
	public static void main(String[] args) {
		for (int i = 1; i <= cont; i++) {
			System.out.println((char) (minMayu + (maxMayu-minMayu+1) * Math.random()));
			System.out.println((char) (minMins + (maxMins-minMins+1) * Math.random()));
		}
	}
}
