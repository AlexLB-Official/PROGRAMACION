/*
5. Defineix la classe Dau amb:

	- un atribut "valor" (que variarà entre 1 i 6)
	- constructor sense paràmetre
	- constructor general amb valor indicat com a paràmetre
	- constructor de còpia
	- setter i getter (setValor i getValor)
	- un mètode "tirada" que canvia el valor del dau a l'atzar
	- altre mètode "mostra" que dibuixe el dau en pantalla amb asteriscos
*/

public class ex5 {
	public static void main(String[] args) {
		
		Dau d1 = new Dau();
		d1.tiradaDau();
		d1.mostraDau();
		
	
		System.exit(0);
	}
}

class Dau {
	private int numDau = (int) (1+6*Math.random());
	
	public Dau() {this.numDau = numDau; }
	public Dau(int value) {this.numDau = value; }
	public Dau(Dau d) {this.numDau = d.numDau; }
	
	// Setters and getters
	public void setDau(int num) { this.numDau = num; }
	public int getDau() { return numDau; }
	
	// Metodo tirada
	public void tiradaDau() { this.numDau = (int) (1+6*Math.random()); }
	
	// Mostra tirada
	public void mostraDau() {
		for (int i = 1; i <= numDau; i++)
			System.out.println(numDau);
	}
	
	
}
