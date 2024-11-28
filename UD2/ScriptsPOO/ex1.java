/*
1. Crear una classe Rellotge (hora,minuts,segons) que permeta almenys:

 - crear rellotges amb hora inicial les 12 del migdia
 - crear rellotges amb hora inicial a triar
 - canviar només l'hora, només els minuts o només els segons (setters)
 - obtindre només el valor d'hora, o de minuts o de segons (getters)

-------------------------------------------------------
 
 - obtindre els segons transcorreguts des de les 12 de la mitjanit()
 
 - afegir una quantitat de temps expressada en segons (vigila que els minuts o segons no excedisquen de 59, ni les hores de 23).
 	Exemple:
 	si el rellotge marca les 10.35:24 i se li afigen 1810 segons (mitja hora i 10 segons) quedarà en 11.05:34
 - ... (altres operacions que se t'ocórreguen útils)
 
 Crea un programa que instàncie rellotges posant a prova tota la classe anterior.
*/

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rellotge r1 = new Rellotge();
		Rellotge r2 = new Rellotge(10,35,24);
		Rellotge r3 = new Rellotge(24,75,65);
		
		int horas, minutos, segundos;
		
		// Mostrando relojes sin modificar
		System.out.println("Hora del primer reloj "+r1.getHour()+":"+r1.getMin()+":"+r1.getSec());
		System.out.println("Hora del segundo reloj "+r2.getHour()+":"+r2.getMin()+":"+r2.getSec());
		System.out.println("Hora del tercer reloj "+r3.getHour()+":"+r3.getMin()+":"+r3.getSec());
		
		// Obtener segundos totales pasados desde las 00:00:00
		System.out.println("En el primer reloj a pasado un total de "+r1.getTotalSeconds()+" seegundos desde la media noche.");
		System.out.println("En el segundo reloj a pasado un total de "+r2.getTotalSeconds()+" seegundos desde la media noche.");
		System.out.println("En el tercer reloj a pasado un total de "+r3.getTotalSeconds()+" seegundos desde la media noche.");
		
		// Sumando tiempo a los relojes
		r1.sumHour(9800);	
		r2.sumHour(1810);
		r3.sumHour(2400);
		
		// Mostrando relojes modificados
		System.out.println("Hora del primer reloj "+r1.getHour()+":"+r1.getMin()+":"+r1.getSec());
		System.out.println("Hora del segundo reloj "+r2.getHour()+":"+r2.getMin()+":"+r2.getSec());
		System.out.println("Hora del tercer reloj "+r3.getHour()+":"+r3.getMin()+":"+r3.getSec());
		
		// Añadiendo tiempo al reloj
		System.out.println("Establece una hora nueva para el primer reloj: ");
		System.out.print("Hora: ");
		horas = sc.nextInt();
		r1.setHour(horas);
		
		System.out.print("Minutos: ");
		minutos = sc.nextInt();
		r1.setMin(minutos);
		
		System.out.print("Segundos: ");
		segundos = sc.nextInt();
		r1.setSec(segundos);
		
		System.out.println("Establece una hora nueva para el segundo reloj: ");
		System.out.print("Hora: ");
		horas = sc.nextInt();
		r2.setHour(horas);
		
		System.out.print("Minutos: ");
		minutos = sc.nextInt();
		r2.setMin(minutos);
		
		System.out.print("Segundos: ");
		segundos = sc.nextInt();
		r2.setSec(segundos);
		
		sc.close();
		
		// Mostrando relojes modificados
		System.out.println("Hora del primer reloj "+r1.getHour()+":"+r1.getMin()+":"+r1.getSec());
		System.out.println("Hora del segundo reloj "+r2.getHour()+":"+r2.getMin()+":"+r2.getSec());
		
		if (r1.esAnterior(r2))
			System.out.println("El primer reloj es anterior al segundo.");
		else
			System.out.println("El segundo reloj es anterior al primero.");
	}
	class Rellotge {
		// Creamos una variable final en la que especificaremos la hora inicial por defecto
		private int hour;
		private int min;
		private int sec;
		
		public Rellotge() {
			hour = 12;
		}
		
		public Rellotge(int h, int m, int s) {
			if ((h > 0) && (h < 24))
				this.hour = h;
			if ((m > 0) && (m < 60))
				this.min = m;
			if ((s > 0) && (s < 60))
				this.sec = s;
		}
		
		public Rellotge(Rellotge r) { // Constructor de copia
			this.hour = r.hour;
			this.min = r.min;
			this.sec = r.sec;
		}
		
		// Creamos los setters
		public void setHour(int h) {
			if ((h > 0) && (h < 24))
				this.hour = h;
		}
		
		public void setMin(int m) {
			if ((m < 0) && (m > 60))
				this.min = m;
		}
		
		public void setSec(int s) {
			if ((s < 0) && (s > 60))
				this.sec = s;
		}
		
		// Creamos los getters
		public int getHour() {
			return hour;
		}
		
		public int getMin() {
			return min;
		}

		public int getSec() {
			return sec;
		}

		// Creamos el getter que obtiene la hora total en segundos a partir de la media noche
		public int getTotalSeconds() {
			return hour * 3600 + min * 60 + sec;
		}

		// Creamos función que sume horas, minutos y segudos al reloj
		public void sumHour(int userInpSec){
			int secTotal = userInpSec + getTotalSeconds();
			
			hour = (secTotal / 3600)%24;
			min = (secTotal / 60) % 60;
			sec = secTotal % 60;
			corrigeNegativos();
		}
		
		public void corrigeNegativos(){
			if (sec < 0){
				sec += 60;
				min--;
			}
			if (min < 0){
				min += 60;
				hour--;
			}
			if (hour < 0){
				hour += 24;
			}
		}
		
		public boolean esAnterior(Rellotge r){
			if (getTotalSeconds() < r.getTotalSeconds())
				return true;
			return false;
		}
	}
}
