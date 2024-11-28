/*class Rellotge {
	// Creamos una variable final en la que especificaremos la hora inicial por defecto
	private int hour;
	private int min;
	private int sec;
	private int rest_sec, rest_min;
	
	public Rellotge() {
		hour = 12;
	}
	
	public Rellotge(int h, int m, int s) {
		if (s > 59){
			if (m > 59) {
				if (h > 23) {
					// Si segundos, minutos y horas es mayor a los valores máximos entonces haremos lo siguiente.
					while (h > 59){ // mientras la hora sea mayor a 23, le restaremos la hora menos 24. Ejemplo: 27h -> 27-24 = 3am
						while (m > 59) { // mientras minutos sea mayor a 59 sumaremos 1 hora, cuando llegue a un valor aceptable el bucle no se repetirá
							while (s > 59){ // mientras segundos sea mayor a 59 sumaremos 1 minuto, cuando llegue a un valor aceptable no se repetira de nuevo el bucle aunque se repita el bucle exterior while(m > 59) 
								m++;
								s = s - 60;
							} // fin bucle while (s > 59)
							h++; 
							m = m - 60;
						}// fin bucle while(m > 59)
						h = h - 24;
					} // fin bucle while (h > 59)
					// A continuación despues de que se ejecuten los bucles estableceremos los valores a las variables privadas hour, min y sec.
					this.hour = h;
					this.min = m;
					this.sec = s;
				} else { // En caso de que horas no sea mayor a 23 haremos lo siguiente.
					while (m > 59){ // Mientras minutos sea mayor a 59 sumaremos a hora 1 y le restaremos a minutos 60
						while (s > 59) { // Mientras segundos sea mayor a 59 sumaremos a minutos 1 y a segundos le restaremos 60.
							m++;
							s = s - 60;
						}// fin bucle (s > 59)
						h++;
						m = m - 60;
					} // fin bucle (m > 59)
					if (h > 23) { // Debemos de comprobar si hora es mayor a 23 (ya que al sumarle 1 en el bucle de minutos puede darnos un valor no permitido)
						while (h > 23) // Mientras hora sea mayor a 23 le restaremos 24
							h = h - 24;
						// Establecemos los valores a las variables privadas hour, min y sec.
						this.hour = h;
						this.min = m;
						this.sec = s;					
					} else { // Si hora no es mayor a 23 solo establecemos los valores
						this.hour = h;
						this.min = m;
						this.sec = s;
					}	
				}
			} else { // En caso de que minutos no sea mayor a 59
				while (s > 59){ // Mientras segundos sea mayor a 59 sumar a minutos 1
					m++;
					s = s - 60; // Restamos a segundos 60
				}
				if (m > 59){ // Si minutos es mayor a 59 haremos lo siguiente
					while (m > 59){ // Bucle que se ejecutar mientras minutos sea mayor a 59 y le sumara a hora 1
						h++;
						m = m - 60; // Restamos a minutos 60
					}
					if (h > 23){ // Si hora es mayor a 23
						while (h > 23) // Mientras hora sea mayor a 23 le restaremos a hora 24.
							h = h - 24;
						// Después de ejecutar el bucle estableceremos los valores a las variables hour, min y sec
						this.hour = h;
						this.min = m;
						this.sec = s;
					} else { // Si hora no es mayor a 23 solo establecemos los valores a las variables hour, min y sec
						this.hour = h;
						this.min = m;
						this.sec = s;
					}
				} else { // si minutos no es mayor a 59 solo establecemos los valores a las variables hour, min y sec
					this.hour = h;
					this.min = m;
					this.sec = s;
				}
			}
		} else { // Si segundos no es mayor a 59 haremos lo siguiente
			if (m > 59){ // Si minutos es mayor a 59...
				while (m > 59){ // Bucle que restara a minutos 60 y le sumara a horas 1
						h++;
						m = m - 60;
					}
				if (h > 23){ // Si hora es mayor a 23 entonces...
					while (h > 23) // Bucle que restara a hora 24
						h = h - 24;
					// Después del bucle establecemos los valores a las variables privadas hour, min y sec
					this.hour = h;
					this.min = m;
					this.sec = s;
				} else { // En caso de que no sea hora mayor a 23 solo establecemos los valores a las variables privadas hour, min y sec
					this.hour = h;
					this.min = m;
					this.sec = s;
				}
			} else { // Si minutos no es mayor a 59...
				if (h > 23){ // Si hora es mayor a 23...
					while (h > 23) // Bucle que resta a horas 24
						h = h - 24;
					// Después del bucle establecemos los valores a las variables privadas hour, min y sec.
					this.hour = h;
					this.min = m;
					this.sec = s;
				}else { // Si hora no es mayor a 23 entonces solo establecemos los valores a las variables privadas hour, min y sec.
					this.hour = h;
					this.min = m;
					this.sec = s;
				}
			}
		}
	}
	
	// Creamos los setters
	public void setHour(int h) {
		if (h > 23) {
			while (h > 23)
				h = h - 24;
			this.hour = h;
		} else {
			this.hour = h;
		}
	}
	
	public void setMin(int m) {
		if (m > 59){
			while (m > 59)
				m = m - 60;
			this.min = m;
		} else
			this.min = m;
	}

	public void setSec(int s) {
		if (s > 59){
			while (s > 59)
				s = s - 60;
			this.sec = s;
		} else
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

	// Creamos el getter que obtiene la hora total en segundos.
	public int getTotalSeconds() {
		int totHour = hour;
		int totMin = min;
		int totSec = sec;

		for (int i = 1; i <= 2; i++)
			totHour *= 60;
		totMin *= 60;

		return totHour+totMin+totSec;
	}

	// Creamos función que sume horas, minutos y segudos al reloj
	public void sumHour(int userInputSeconds){
		int s = userInputSeconds%60;
		int m = userInputSeconds/60;
		int h = 0;
		
		if (m > 59) {
			while(m>59){
				h++;
				m = userInputSeconds/60;
			}
			if (h > 23){
				h = h%24;
			}
			h += hour;
			m += min;
			s += sec;
		} else{
			h += hour;
			m += min;
			s += sec;
		}
		
		if (s>59){
			while(s>59){
				m++;
				s = s%60;
			}
			if (m > 59) {
				while(m>59){
					h++;
					m = m - 60;
				}
				if (h > 23){
					h = h%24;
				} else {
					this.hour = h;
					this.min = m;
					this.sec = s;
				}
			} else {
				if (h > 23){
					h = h%24;
				} else {
					this.hour = h;
					this.min = m;
					this.sec = s;
				}
			}
		} else{
			if (m > 59) {
				while(m>59){
					h++;
					m = m - 60;
				}
				if (h > 23){
					h = h%24;
				} else {
					this.hour = h;
					this.min = m;
					this.sec = s;
				}
			} else {
				if (h > 23){
					h = h%24;
					this.hour = h;
					this.min = m;
					this.sec = s;
				} else {
					this.hour = h;
					this.min = m;
					this.sec = s;
				}
			}
		}
	}
	public static void main(String[] args) {
		// Pedimos al usuario que elija una opción
		int option = 
	}
	
}
*/
