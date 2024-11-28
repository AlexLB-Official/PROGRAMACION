// 1. Realitzar una funció que reba una variable de tipus caràcter i si és una lletra minúscula la retorne convertida en majúscules. 

public class ex1 {
	public static void main(String[] args) {
		
		// Creamos la variable
		char letter='b';
		
		letter = minToMay(letter);
		System.out.println(letter);

	}
	
	public static char minToMay(char c){
		// Comprobar si es minúscula
		if ((c >= 97) && (c <= 122))
			return (char)(c - 32);
		else
			return c;
	}
}
