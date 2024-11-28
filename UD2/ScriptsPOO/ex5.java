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
		Dau d2 = new  Dau(3);
		
		int cont = 0;
		int tirades = 0;
		
		while (cont <= 3) {
			d1.tiradaDau();
			d1.mostraDau();
			
			if (d1.getDau() == 6) {
				cont++;
				tirades++;
			} else
				tirades++;
		}
		
		System.out.println("El numero total de tiradas ha sido " + tirades);
		
		
	}
}

class Dau {
	private int numDau;
	
	public Dau() {this.numDau = (int) (1+6*Math.random()); }
	public Dau(int value) {this.numDau = value; }
	public Dau(Dau d) {this.numDau = d.numDau; }
	
	// Setters and getters
	public void setDau(int num) {
		if ((num <= 6) && (num >=1))
			this.numDau = num;
		else
			this.numDau = (int) (1+6*Math.random());
	}
	
	public int getDau() { return numDau; }
	
	// Metodo tirada
	public void tiradaDau() { this.numDau = (int) (1+6*Math.random()); }
	
	// Mostra tirada
	public void mostraDau() {
		switch (numDau){
			case 1:
				System.out.println(" "+" "+" ");
				System.out.println(" "+"*"+" ");
				System.out.println(" "+" "+" ");
				System.out.println("");
			case 2:
				System.out.println(" "+" "+" ");
				System.out.println("*"+" "+"*");
				System.out.println(" "+" "+" ");
				System.out.println("");
			case 3:
				System.out.println("*"+" "+" ");
				System.out.println(" "+"*"+" ");
				System.out.println(" "+" "+"*");
				System.out.println("");
			case 4:
				System.out.println("*"+" "+"*");
				System.out.println(" "+" "+" ");
				System.out.println("*"+" "+"*");
				System.out.println("");
			case 5:
				System.out.println("*"+" "+"*");
				System.out.println(" "+"*"+" ");
				System.out.println("*"+" "+"*");
				System.out.println("");
			case 6:
				System.out.println("*"+" "+"*");
				System.out.println("*"+" "+"*");
				System.out.println("*"+" "+"*");
				System.out.println("");
		}
	}
}
