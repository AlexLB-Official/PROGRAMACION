/*
	3. Crea un programa de gestió de discos de música. Per a això, defineix una classe Disc, sabent que per a cada disc volem registrar el títol (String), grup o music (String), preu (per defecte, 15 euros però algun disc pot estar en oferta, rebaixant-lo un 20%). Afig a la classe els constructors i mètodes que consideres útils o necessaris.	

	El programa ha de crear 3 discos, amb valors de títols i grups introduïts des de teclat per l'usuari. A més el programa posarà en oferta un únic disc, triat a l'atzar amb 	Math.random(). Finalment, mostrarà tots els discos amb els seus preus.
*/ 

import java.util.Scanner;

public class ex3 {

	final static int TAM = 3;	
	
	public static void main(String[] args) {
		
		// Creamos los objetos de las clases necesarias
		Scanner sc = new Scanner(System.in);

		discos disc[] = new discos[TAM];
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Introduce el titulo del disco: ");
			String title = sc.nextLine();
			
			System.out.print("Introduce el nombre del grupo o artista: ");
			String artist = sc.nextLine();
			
			disc[i] = new discos(title, artist);
		}
		
		int random = (int) (Math.random()*disc.length);
		disc[random].discount();
		
		for (int i = 0; i < TAM; i++)
			System.out.println(disc[i]);
			
		System.exit(0);
	}
}

class discos {
	private String title;
	private String artist;
	private double price = 15.0;
	
	public discos () { // Constructor por defecto
		this.title = "Darkside";
		this.artist = "Alan Walker";
	}
	
	public discos(String tit, String art) { // Constructor general
		this.title = tit;
		this.artist = art;
	}
	
	public discos(discos d) { // Constructor de copia
		this.title = d.title;
		this.artist = d.artist;
	}
	
	// Creamos los setters
	public void setTitle(String tit){ this.title = tit;}
	public void setArtist(String art){ this.artist = art;}
	
	// Creamos los getters
	public String getTitle(){ return title;}
	public String getArtist(){ return artist;}
	
	// Creamos el toString()
	public String toString() { return "El título del disco es " + title + " su artista es " + title + " el precio es de " + price+"€";}
	
	// Creamos funcion rebaje los discos un 20%
	public double discount() { return this.price = (15.0-(15.0*0.20));}
}
