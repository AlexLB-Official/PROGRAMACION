/*
	2b. utilitza la classe Music de l'exercici anterior, afegint-li un tercer atribut: nombre de músics (aquest atribut s'incrementarà en una unitat per a cada músic nou que es cree).
*/
import java.util.Scanner;

public class ex2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Music m1 = new Music();
		Music m2 = new Music();
		
		// Nombre del primer artista
		System.out.println("El nombre del artista es "+m1.getNom()+" y su instrumento es "+m1.getInst());
		
		// Definiendo segundo artista
		System.out.print("\nIntroduce el nombre de un musico: ");
		m2.setNom(sc.nextLine());

		System.out.print("\nIntroduce el instrumento del music: ");
		m2.setInst(sc.nextLine());
		
		// Cantidad de musicos
		System.out.println(m1);
		System.out.println(m2);
		System.out.println("La cantidad de musicos introducidos es: "+ m2.getCont());
		
		

	}
}

class Music {
	private String nomMusic;
	private String nomInstrument;
	private static int cont=1;	// cont = 0

	// Constructor por defeto
	public Music() {
		this.nomMusic = "mozart";
		this.nomInstrument = "piano";
	}

	public Music(String nom, String inst, int contMusic) {
		this.nomMusic = nom;
		this.nomInstrument = inst;
		cont++;
	}

	// Constructor de copia
	public Music(Music m) {
		this.nomMusic = m.nomMusic;
		this.nomInstrument = m.nomInstrument;
		cont++;
	}

	// Metodos getters y setters
	// setters
	public void setNom(String nom) {
		if (this.nomMusic != nom) {
			this.nomMusic = nom;
			cont++;
		}
	}

	public void setInst(String inst) {
		this.nomInstrument = inst;
	}

	public String getNom() {
		return this.nomMusic;
	}

	public String getInst() {
		return this.nomInstrument;
	}
	
	public int getCont(){
		return cont;
	}

	// Creando metodo toString()
	public String toString() {
		return "El nombre del músico actual es " + nomMusic + " y su instrumento es " + nomInstrument;
	}
	
}
