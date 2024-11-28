/*
2. Crea una classe Music que incloga 2 atributs (nom del músic i instrument, tots dos de tipus String). La classe inclourà també, almenys:

 - un constructor que inicialitze el músic amb un nom i un instrument inicial.
 - constructor de còpia.
 - un mètode mostraMusic (o toString()) que mostre les dades del músic per pantalla.
 - els corresponents mètodes "setters" i "getters" (setNom,setInst,getNom,getInstr) que canvien l'instrument o el nom (mètodes setXxx), o retornen aqueixos mateixos valors (mètodes getXxx).

	Realitza un programa que, utilitzant la classe Musica, definisca almenys dos objectes d'aquest tipus, mostre les seues dades, modifique alguna dada de cadascun d'ells i acabe mostrant els seus noms, instruments i el total de músics.
*/
import java.util.Scanner;

public class ex2 {
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
		System.out.println("La cantidad de musicos introducidos es: 2");
		
		

	}
}

class Music {
	private String nomMusic;
	private String nomInstrument;

	// Constructor por defeto
	public Music() {
		this.nomMusic = "Mozart";
		this.nomInstrument = "Piano";
	}

	public Music(String nom, String inst, int contMusic) {
		this.nomMusic = nom;
		this.nomInstrument = inst;
	}

	// Constructor de copia
	public Music(Music m) {
		this.nomMusic = m.nomMusic;
		this.nomInstrument = m.nomInstrument;
	}

	// Metodos getters y setters
	// setters
	public void setNom(String nom) {
		if (this.nomMusic != nom){
			this.nomMusic = nom;
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

	// Creando metodo toString()
	public String toString() {
		return "El nombre del músico actual es " + nomMusic + " y su instrumento es " + nomInstrument;
	}
	
}
